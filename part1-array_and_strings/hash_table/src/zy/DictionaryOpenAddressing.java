package zy;

/**
 * Created by zy on 6/5/15.
 */
public class DictionaryOpenAddressing {
    private int buckets_size;
    private int dict_size;
    private Bucket[] buckets;

    private int map(String key){

        int index = key.hashCode() % (buckets_size - 1);
        return index;
    }

    private int resolveCollision(int index, String key){
        while (buckets[index] != null){
            if (buckets[index].getKey().equals(key))
                return index;
            index = getNextBucket(index);
        }
        dict_size++;
        return index;
    }

    private int getNextBucket(int index){
        index++;
        if (index >= buckets_size)
            index -= buckets_size;
        return index;
    }

    private int findIndexToInsert(String key) throws KeyException {

        int index = map(key);

        try {
            while (!buckets[index].getKey().equals(key))
                index = getNextBucket(index);
        } catch (NullPointerException error){
            throw new KeyException("Can not find the key "+key+"!");
        }
        return index;
    }

    private void increaseNumberOfBuckets(){
        buckets_size *= 2;
        Bucket[] old_buckets = buckets;
        buckets = new Bucket[buckets_size];
        dict_size = 0;

        for (Bucket b : old_buckets)
            if (b != null)
                put(b);
    }

    private void put(Bucket bucket) {
        String key = bucket.getKey();

        int index = map(key);
        index = resolveCollision(index, key);
        buckets[index] = bucket;

        if (dict_size >= buckets_size*2/3)
            increaseNumberOfBuckets();
    }

    public DictionaryOpenAddressing(){
        buckets_size = 8;
        dict_size = 0;
        buckets = new Bucket[buckets_size];
    }

    public void put(String key, int value) {
        Bucket bucket = new Bucket(key, value);
        put(bucket);
    }

    public String[] getKeys(){
        String [] keys = new String[dict_size];
        int nth = 0;
        for (Bucket b : buckets) {
            if (b != null) {
                keys[nth] = b.getKey();
                nth++;
                continue;
            }
        }

        return keys;
    }

    public int getValue(String key){
        try {
            int index = findIndexToInsert(key);
            return buckets[index].getValue();
        } catch (KeyException error){
            System.err.println("Error:" + error.getMessage());
        }
        return -1;
    }

    public void remove(String key){
        try {
            int index = findIndexToInsert(key);
            buckets[index] = null;
            dict_size--;
        } catch (KeyException error){
            System.err.println("Error:" + error.getMessage());
        }

    }

    public int getDictSize(){
        return dict_size;
    }

    public int getBucketsSize(){
        return buckets_size;
    }


}

package zy;

/**
 * Created by zy on 6/6/15.
 */
public class Bucket {
    private String key;
    private int value;

    public Bucket(){
        System.out.println("Initialized!");
        this.key = null;
        this.value = 0;
    }

    public Bucket(String key, int value){
        this.key = key;
        this.value = value;
    }

    public String getKey(){
        return key;
    }

    public int getValue(){
        return value;
    }
}

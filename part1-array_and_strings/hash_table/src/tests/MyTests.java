package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import zy.DictionaryOpenAddressing;

public class MyTests {
    @Test
    public void test_repetition() {

        // MyClass is tested
        DictionaryOpenAddressing dict = new DictionaryOpenAddressing();

        for (int ii=0; ii<2; ii++)
            dict.put(String.format("%d",ii),ii);

        assertEquals("Dict size should 2 .", 2, dict.getDictSize());

        for (int ii=0; ii<2; ii++)
            dict.put(String.format("%d",ii),ii);

        assertEquals("Dict size should remain 2.", 2, dict.getDictSize());
    }

    @Test
    public void test_expansion_and_repetition() {

        // MyClass is tested
        DictionaryOpenAddressing dict = new DictionaryOpenAddressing();

        for (int ii=0; ii<7; ii++)
            dict.put(String.format("%d",ii),ii);

        assertEquals("Dict size should 7 .", 7, dict.getDictSize());
        assertEquals("Buckets size should be 16.", 16, dict.getBucketsSize());

        for (int ii=0; ii<7; ii++)
            dict.put(String.format("%d",ii),ii);

        assertEquals("Dict size should remain 7.", 7, dict.getDictSize());
        assertEquals("Buckets size should be 16.", 16, dict.getBucketsSize());
    }

    @Test
    public void test_expansion() {

        // MyClass is tested
        DictionaryOpenAddressing dict = new DictionaryOpenAddressing();

        for (int ii=0; ii<4; ii++)
            dict.put(String.format("%d",ii),ii);
        assertEquals("Dict size should remain 4.", 4, dict.getDictSize());
        assertEquals("Buckets size should be 8.", 8, dict.getBucketsSize());

        for (int ii=0; ii<9; ii++)
            dict.put(String.format("%d",ii),ii);
        assertEquals("Dict size should remain 9.", 9, dict.getDictSize());
        assertEquals("Buckets size should be 16.", 16, dict.getBucketsSize());

        for (int ii=0; ii<20; ii++)
            dict.put(String.format("%d",ii),ii);
        assertEquals("Dict size should remain 20.", 20, dict.getDictSize());
        assertEquals("Buckets size should be 16.", 32, dict.getBucketsSize());

        for (int ii=0; ii<41; ii++)
            dict.put(String.format("%d",ii),ii);
        assertEquals("Dict size should remain 41.", 41, dict.getDictSize());
        assertEquals("Buckets size should be 16.", 64, dict.getBucketsSize());

        for (int ii=0; ii<84; ii++)
            dict.put(String.format("%d",ii),ii);
        assertEquals("Dict size should remain 41.", 84, dict.getDictSize());
        assertEquals("Buckets size should be 16.", 128, dict.getBucketsSize());
    }

    @Test
    public void test_get_value() {

        DictionaryOpenAddressing dict = new DictionaryOpenAddressing();
        for (int ii=0; ii<100; ii++){
            String key = String.format("%d", ii);
            int value = key.hashCode();
            dict.put(key, value);
        }


        for (int ii=0; ii<100; ii++){
            String key = String.format("%d", ii);
            int value = key.hashCode();
            assertEquals("Value", value, dict.getValue(key));
        }

    }

    @Test
    public void test_remove() {

        DictionaryOpenAddressing dict = new DictionaryOpenAddressing();
        for (int ii=0; ii<100; ii++){
            String key = String.format("%d", ii);
            int value = key.hashCode();
            dict.put(key, value);
        }

        for (int ii=0; ii<100; ii++){
            String key = String.format("%d", ii);
            dict.remove(key);
        }



    }

}

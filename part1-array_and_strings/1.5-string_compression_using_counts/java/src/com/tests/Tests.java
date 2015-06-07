package com.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.StringCompression;
import org.junit.Test;

public class Tests {

    @Test
    public void testCalculateCompressedLength() {
        String str = new String("abcd");
        int len = StringCompression.calculateCompressedLength(str);
        assertEquals("Must be 8.", 8, len);

    }

    @Test
    public void testCalculateCompressedLength2() {
        String str = new String("aabbbccd");
        int len = StringCompression.calculateCompressedLength(str);
        assertEquals("Must be 8.", 8, len);

    }

    @Test
    public void testCalculateCompressedLength3() {
        String str = new String("aabbbccdddddkkkkul");
        int len = StringCompression.calculateCompressedLength(str);
        assertEquals("Must be 14.", 14, len);

    }

    @Test
    public void testCompressed() {
        String str = new String("aabbccddkkkkkf");
        String compress = StringCompression.compress(str);
        assertTrue(compress.equals("a2b2c2d2k5f1"));
    }

    @Test
    public void testCompressed2() {
        String str = new String("abcd");
        String compress = StringCompression.compress(str);
        assertTrue(compress.equals("abcd"));
    }

    @Test
    public void testCompressed3() {
        String str = new String("aaabbb   cc");
        String compress = StringCompression.compress(str);
        assertTrue(compress.equals("a3b3 3c2"));
    }

}
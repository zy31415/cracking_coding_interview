/**
 * Created by zy on 6/7/15.
 */
package com;
public class StringCompression {

    public static int calculateCompressedLength(String str){
        int len = str.length();
        int compressed_len = 0;

        int i = 0;
        while (i < len){
            char c1 = str.charAt(i);
            compressed_len++;
            while (i < len && str.charAt(i) == c1)
                i++;
            compressed_len++;
        }
        return compressed_len;
    }

    public static String compress(String str){
        int compressed_len = calculateCompressedLength(str);

        if (compressed_len >= str.length())
            return str;

        char[] compressed = new char[compressed_len];

        int len = str.length();

        int insert_at = 0;
        int i = 0;
        while (i < len){
            char c1 = str.charAt(i);
            compressed[insert_at++] = c1;
            int rep_num = 0;
            while (i<len && str.charAt(i) == c1){
                i++;
                rep_num++;
            }
            compressed[insert_at++] = (char) ('0' + rep_num);
        }
        return new String(compressed);
    }
}

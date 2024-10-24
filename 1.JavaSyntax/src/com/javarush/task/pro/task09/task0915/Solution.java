package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query,delimiter);
        int count = tokenizer.countTokens();
        String[] array = new String[count];
        for (int i = 0; tokenizer.hasMoreTokens(); i++) {
            array[i] = tokenizer.nextToken();

        }

        return array;
    }
}

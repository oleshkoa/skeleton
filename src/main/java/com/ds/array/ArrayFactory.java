package com.ds.array;

import java.io.*;

/**
 * OleshkoArtem
 * 10.06.14
 */
public class ArrayFactory {

    private static final int MIN = 0;
    private static final int MAX = 100;

    public static int[] getIntArray(int size){
        return getIntArray(size, MIN, MAX);
    }

    public static int[] getIntArray(int size, int min, int max) {
        int[] array = new int[size];
        int i = 0;
        while (i<array.length) {
            array[i] = min + (int)(Math.random() * ((max - min) + 1));
            i++;
        }
        return array;
    }

    public static int[] getSortedArray() throws Exception {
        return new int[] {0, 1, 6, 10, 13, 14, 20, 55, 66, 77};
    }
}

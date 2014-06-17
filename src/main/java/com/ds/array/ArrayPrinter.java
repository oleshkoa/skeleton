package com.ds.array;

/**
 * OleshkoArtem
 * 10.06.14
 */
public class ArrayPrinter {
    public static void printArray(int[] array){
        int i = 0;
        while ( i < array.length) {
            System.out.println("array[" + i + "]=" + array[i]);
            i++;
        }
    }
}

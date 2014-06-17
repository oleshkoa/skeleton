package com.ds.array;

import java.util.Arrays;
import java.util.Collections;

/**
 * OleshkoArtem
 * 10.06.14
 */

/**
 * O(log2N)
 */
public class BinarySearch {
    public static void main(String... args) throws Exception {
        int[] array = ArrayFactory.getSortedArray();

        int index = binarySearch(array, 20);
        ArrayPrinter.printArray(array);
        System.out.println(index);
    }

    private static int binarySearch(int[] array, int item) {
        int fIndex = 0;
        int lIndex = array.length - 1;
        int mIndex = -1;
        while(fIndex < lIndex) {
            mIndex = (lIndex + fIndex) / 2;
            if(array[mIndex] == item) {
                return mIndex;
            }
            if(array[mIndex] > item){
                lIndex = mIndex;
            } else {
                fIndex = mIndex;
            }
        }
        return mIndex;
    }
}

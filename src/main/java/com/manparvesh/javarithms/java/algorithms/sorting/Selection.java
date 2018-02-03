package com.manparvesh.javarithms.java.algorithms.sorting;

import com.manparvesh.javarithms.java.interfaces.algorithms.Sorting;

public class Selection implements Sorting {
    /**
     * This is a simple sorting algorithm with the runtime of O(n^2).
     * <br>
     * Process:
     * <br>
     * 1. start iterating from the first element to the second last element
     * <br>
     * 2. for subsequent elements, find the minimum element and swap with the first element
     *
     * @param inputArray array to be sorted
     * @return sorted array
     */
    public int[] sort(int inputArray[]) {
        int len = inputArray.length;

        if (len < 2) {
            return inputArray;
        }

        int temp; // used for swapping
        for (int i = 0; i < len - 1; i++) {
            int minimumForNow = i;
            for (int j = i + 1; j < len; j++) {
                if (inputArray[j] < inputArray[minimumForNow]) {
                    minimumForNow = j;
                }
            }
            /*
             * swap the first element with the minimum one
             * */
            temp = inputArray[i];
            inputArray[i] = inputArray[minimumForNow];
            inputArray[minimumForNow] = temp;
        }
        return inputArray;
    }
}

package com.manparvesh.javarithms.java.searching;

import com.manparvesh.javarithms.java.exceptions.ArrayNotSortedException;
import com.manparvesh.javarithms.java.interfaces.Searching;

public class BinarySearch implements Searching {
    @Override
    public int search(int elementToSearch, int[] arrayToSearchIn) throws ArrayNotSortedException {
        /*
         * Binary search requires that its members are already sorted
         * */
        if (arrayToSearchIn.length > 1) {
            for (int i = 0; i < arrayToSearchIn.length - 1; i++) {
                if (arrayToSearchIn[i] > arrayToSearchIn[i + 1]) {
                    throw new ArrayNotSortedException("The array needs to be sorted for performing Binary Search");
                }
            }
        }

        int left = 0;
        int right = arrayToSearchIn.length - 1;

        if (elementToSearch < arrayToSearchIn[left] || arrayToSearchIn[right] < elementToSearch) {
            return -1;
        }

        int middle;
        while (left < right) {
            middle = left + (right - left) / 2;
            if (elementToSearch > arrayToSearchIn[middle]) {
                // look for it in the right part, so set left to middle
                left = middle + 1;
            } else if (elementToSearch < arrayToSearchIn[middle]) {
                right = middle;
            } else {
                // found
                return middle;
            }
        }
        return -1;
    }
}

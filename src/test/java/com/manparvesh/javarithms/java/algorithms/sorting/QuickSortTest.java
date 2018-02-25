package com.manparvesh.javarithms.java.algorithms.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void quickSort() {
        QuickSort quickSort = new QuickSort();
        int arrayToSort[] = new int[] { 3, 2, 4, 67, 324, 54, 1 };
        quickSort.quickSort(arrayToSort);
        int[] sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        Arrays.sort(sortedArray);
        assertArrayEquals(sortedArray, arrayToSort);

        arrayToSort = new int[] {};
        quickSort.quickSort(arrayToSort);
        sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        Arrays.sort(sortedArray);
        assertArrayEquals(sortedArray, arrayToSort);

        arrayToSort = new int[] { 1 };
        quickSort.quickSort(arrayToSort);
        sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        Arrays.sort(sortedArray);
        assertArrayEquals(sortedArray, arrayToSort);

        arrayToSort = new int[] { 3, 2, 1 };
        quickSort.quickSort(arrayToSort);
        sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        Arrays.sort(sortedArray);
        assertArrayEquals(sortedArray, arrayToSort);

        arrayToSort = new int[] { 1, 1, 1 };
        quickSort.quickSort(arrayToSort);
        sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        Arrays.sort(sortedArray);
        assertArrayEquals(sortedArray, arrayToSort);
    }
}
package com.manparvesh.javarithms.java.algorithms.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void mergeSort() {
        MergeSort mergeSort = new MergeSort();
        int arrayToSort[] = new int[] { 3, 2, 4, 67, 324, 54, 1 };
        mergeSort.mergeSort(arrayToSort);
        int[] sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        Arrays.sort(sortedArray);
        assertArrayEquals(sortedArray, arrayToSort);

        arrayToSort = new int[] {};
        mergeSort.mergeSort(arrayToSort);
        sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        Arrays.sort(sortedArray);
        assertArrayEquals(sortedArray, arrayToSort);

        arrayToSort = new int[] { 1 };
        mergeSort.mergeSort(arrayToSort);
        sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        Arrays.sort(sortedArray);
        assertArrayEquals(sortedArray, arrayToSort);

        arrayToSort = new int[] { 3, 2, 1 };
        mergeSort.mergeSort(arrayToSort);
        sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        Arrays.sort(sortedArray);
        assertArrayEquals(sortedArray, arrayToSort);

        arrayToSort = new int[] { 1, 1, 1 };
        mergeSort.mergeSort(arrayToSort);
        sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        Arrays.sort(sortedArray);
        assertArrayEquals(sortedArray, arrayToSort);

    }
}
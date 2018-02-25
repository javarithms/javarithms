package com.manparvesh.javarithms.java.algorithms.sorting;

public class QuickSort {

    public void quickSort(int[] inputArray) {
        quickSortUtil(inputArray, 0, inputArray.length - 1);
    }

    private void quickSortUtil(int[] ar, int low, int high) {
        if (low < high) {
            int pivot = partition(ar, low, high);
            quickSortUtil(ar, low, pivot - 1);
            quickSortUtil(ar, pivot + 1, high);
        }
    }

    private int partition(int ar[], int low, int high) {
        // pivot element is the right most one
        int pivot = ar[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (ar[j] <= pivot) {
                // increment i; swap this and pivot
                i++;

                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }

        int temp = ar[i + 1];
        ar[i + 1] = ar[high];
        ar[high] = temp;

        return i + 1;
    }
}

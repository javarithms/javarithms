package com.manparvesh.javarithms.java.algorithms.sorting;

public class MergeSort {
    public void mergeSort(int ar[]) {
        mergeSortUtil(ar, 0, ar.length - 1);
    }

    private void mergeSortUtil(int[] ar, int left, int right) {
        if (left < right) {
            int mid = (right - left) / 2 + left;
            mergeSortUtil(ar, mid + 1, right);
            mergeSortUtil(ar, left, mid);
            merge(ar, left, right, mid);
        }
    }

    private void merge(int[] ar, int left, int right, int mid) {
        // sizes of 2 arrays
        int rightArrayLength = right - mid;
        int leftArrayLength = mid - left + 1;

        int rightArray[] = new int[rightArrayLength];
        int leftArray[] = new int[leftArrayLength];

        // copy data to arrays
        System.arraycopy(ar, left, leftArray, 0, leftArrayLength);
        System.arraycopy(ar, mid + 1, rightArray, 0, rightArrayLength);

        // merging the temp arrays
        int i = 0, j = 0;
        int k = left;
        while (i < leftArrayLength && j < rightArrayLength) {
            if (leftArray[i] <= rightArray[j]) {
                ar[k] = leftArray[i];
                i++;
            } else {
                ar[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // copy remaining elements from both arrays
        while (i < leftArrayLength) {
            ar[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArrayLength) {
            ar[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

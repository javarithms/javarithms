package com.manparvesh.javarithms.java.algorithms.searching;

public class BinarySearch {
    public int binarySearchIterative(int elementToSearch, int[] arrayToSearchIn) {
        return binarySearchIterativeUtil(elementToSearch, arrayToSearchIn, 0, arrayToSearchIn.length - 1);
    }

    private int binarySearchIterativeUtil(int elementToSearch, int[] arrayToSearchIn, int left, int right) {
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (arrayToSearchIn[mid] == elementToSearch) {
                return mid;
            }
            if (arrayToSearchIn[mid] > elementToSearch) {
                // move left
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int binarySearchRecursive(int elementToSearch, int[] arrayToSearchIn) {
        return binarySearchRecursiveUtil(elementToSearch, arrayToSearchIn, 0, arrayToSearchIn.length - 1);
    }

    private int binarySearchRecursiveUtil(int x, int ar[], int left, int right) {
        if (left <= right) {
            int mid = (right - left) / 2 + left;
            if (ar[mid] == x) {
                return mid;
            }

            if (ar[mid] > x) {
                return binarySearchRecursiveUtil(x, ar, left, mid - 1);
            } else {
                return binarySearchRecursiveUtil(x, ar, mid + 1, right);
            }
        }
        return -1;
    }
}

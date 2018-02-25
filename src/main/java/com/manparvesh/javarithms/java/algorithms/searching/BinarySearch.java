package com.manparvesh.javarithms.java.algorithms.searching;

import com.manparvesh.javarithms.java.datastructures.misc.Pair;

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

    /**
     * returns the index of the first element in the range
     * [first,last) which does not compare less than val
     *
     * @param val
     * @param ar
     * @return
     */
    public int lowerBound(int val, int ar[]) {
        int left = 0, right = ar.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (ar[mid] == val) {
                // found the element, now move to its leftmost occurrence
                int it = mid;
                while (ar[mid] == ar[it]) {
                    it--;
                }
                return it;
            }
            if (ar[mid] > val) {
                // move left
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    /**
     * returns the index of the first element in the range
     * [first,last) which is strictly grater than val
     *
     * @param val
     * @param ar
     * @return
     */
    public int upperBound(int val, int ar[]) {
        int left = 0, right = ar.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (ar[mid] == val) {
                // found the element, now move to its rightmost occurrence
                int it = mid;
                while (ar[mid] == ar[it]) {
                    it++;
                }
                return it + 1;
            }
            if (ar[mid] > val) {
                // move left
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    /**
     * returns a pair of lower and upper bound for an array
     * relative to a given integer x
     *
     * @param element integer
     * @param array   array
     * @return a pair of lower and upper bound for an array
     */
    public Pair<Integer, Integer> equalRange(int element, int array[]) {
        return new Pair<>(lowerBound(element, array), upperBound(element, array));
    }
}

package com.manparvesh.javarithms.java.algorithms.searching;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    private BinarySearch binarySearch;

    @Before
    public void setup() {
        binarySearch = new BinarySearch();
    }

    @Test
    public void searchTestIterative() {
        assertEquals(-1, binarySearch.binarySearchIterative(3, new int[] {}));
        assertEquals(-1, binarySearch.binarySearchIterative(3, new int[] { 1 }));
        assertEquals(0, binarySearch.binarySearchIterative(1, new int[] { 1 }));

        assertEquals(0, binarySearch.binarySearchIterative(1, new int[] { 1, 3, 5 }));
        assertEquals(1, binarySearch.binarySearchIterative(3, new int[] { 1, 3, 5 }));
        assertEquals(2, binarySearch.binarySearchIterative(5, new int[] { 1, 3, 5 }));
        assertEquals(-1, binarySearch.binarySearchIterative(0, new int[] { 1, 3, 5 }));
        assertEquals(-1, binarySearch.binarySearchIterative(2, new int[] { 1, 3, 5 }));
        assertEquals(-1, binarySearch.binarySearchIterative(4, new int[] { 1, 3, 5 }));
        assertEquals(-1, binarySearch.binarySearchIterative(6, new int[] { 1, 3, 5 }));

        assertEquals(0, binarySearch.binarySearchIterative(1, new int[] { 1, 3, 5, 7 }));
        assertEquals(1, binarySearch.binarySearchIterative(3, new int[] { 1, 3, 5, 7 }));
        assertEquals(2, binarySearch.binarySearchIterative(5, new int[] { 1, 3, 5, 7 }));
        assertEquals(3, binarySearch.binarySearchIterative(7, new int[] { 1, 3, 5, 7 }));
        assertEquals(-1, binarySearch.binarySearchIterative(0, new int[] { 1, 3, 5, 7 }));
        assertEquals(-1, binarySearch.binarySearchIterative(2, new int[] { 1, 3, 5, 7 }));
        assertEquals(-1, binarySearch.binarySearchIterative(4, new int[] { 1, 3, 5, 7 }));
        assertEquals(-1, binarySearch.binarySearchIterative(6, new int[] { 1, 3, 5, 7 }));
        assertEquals(-1, binarySearch.binarySearchIterative(8, new int[] { 1, 3, 5, 7 }));
    }

    @Test
    public void searchTestRecursive() {
        assertEquals(-1, binarySearch.binarySearchRecursive(3, new int[] {}));
        assertEquals(-1, binarySearch.binarySearchRecursive(3, new int[] { 1 }));
        assertEquals(0, binarySearch.binarySearchRecursive(1, new int[] { 1 }));

        assertEquals(0, binarySearch.binarySearchRecursive(1, new int[] { 1, 3, 5 }));
        assertEquals(1, binarySearch.binarySearchRecursive(3, new int[] { 1, 3, 5 }));
        assertEquals(2, binarySearch.binarySearchRecursive(5, new int[] { 1, 3, 5 }));
        assertEquals(-1, binarySearch.binarySearchRecursive(0, new int[] { 1, 3, 5 }));
        assertEquals(-1, binarySearch.binarySearchRecursive(2, new int[] { 1, 3, 5 }));
        assertEquals(-1, binarySearch.binarySearchRecursive(4, new int[] { 1, 3, 5 }));
        assertEquals(-1, binarySearch.binarySearchRecursive(6, new int[] { 1, 3, 5 }));

        assertEquals(0, binarySearch.binarySearchRecursive(1, new int[] { 1, 3, 5, 7 }));
        assertEquals(1, binarySearch.binarySearchRecursive(3, new int[] { 1, 3, 5, 7 }));
        assertEquals(2, binarySearch.binarySearchRecursive(5, new int[] { 1, 3, 5, 7 }));
        assertEquals(3, binarySearch.binarySearchRecursive(7, new int[] { 1, 3, 5, 7 }));
        assertEquals(-1, binarySearch.binarySearchRecursive(0, new int[] { 1, 3, 5, 7 }));
        assertEquals(-1, binarySearch.binarySearchRecursive(2, new int[] { 1, 3, 5, 7 }));
        assertEquals(-1, binarySearch.binarySearchRecursive(4, new int[] { 1, 3, 5, 7 }));
        assertEquals(-1, binarySearch.binarySearchRecursive(6, new int[] { 1, 3, 5, 7 }));
        assertEquals(-1, binarySearch.binarySearchRecursive(8, new int[] { 1, 3, 5, 7 }));
    }
}
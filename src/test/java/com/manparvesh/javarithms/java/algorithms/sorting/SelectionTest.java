package com.manparvesh.javarithms.java.algorithms.sorting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SelectionTest {

    @Test
    public void testSort() {
        int ar[] = { 1, 3, 4, 23, 21, 65, 3, 7, 8 };
        Selection selection = new Selection();
        int expectedOutput[] = new int[] { 1, 3, 3, 4, 7, 8, 21, 23, 65 };
        int actualOutput[] = selection.sort(ar);
        for (int i = 0; i < ar.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }
}
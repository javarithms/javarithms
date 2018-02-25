package com.manparvesh.javarithms.java.datastructures.string;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SuffixArrayTest {

    @Test
    public void getSuffixArrayNaive() {
        SuffixArray suffixArray = new SuffixArray();
        int ar[] = suffixArray.getSuffixArrayNaive("mississippi");
        int ar2[] = suffixArray.getSuffixArrayEfficient("mississippi");
        assertArrayEquals(ar, ar2);
    }

    @Test
    public void test() {
        SuffixArray suffixArray = new SuffixArray();
        int ar[] = suffixArray.getSuffixArrayEfficient("banana");
        assertArrayEquals(new int[] { 5, 3, 1, 0, 4, 2 }, ar);
    }
}
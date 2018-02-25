package com.manparvesh.javarithms.java.datastructures.string;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testSearch() {
        SuffixArray suffixArray = new SuffixArray();
        String text = "banana";
        int ar[] = suffixArray.getSuffixArrayEfficient(text);
        String pattern = "nan";

        assertTrue(suffixArray.search(pattern, text, ar));
    }
}
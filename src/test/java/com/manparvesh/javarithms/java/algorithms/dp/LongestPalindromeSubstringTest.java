package com.manparvesh.javarithms.java.algorithms.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromeSubstringTest {
    @Test
    public void test() {
        LongestPalindromeSubstring longestPalindromeSubstring = new LongestPalindromeSubstring();
        String s = "forgeeksskeegfor";
        assertEquals(longestPalindromeSubstring.naive(s), longestPalindromeSubstring.efficient(s));
    }
}
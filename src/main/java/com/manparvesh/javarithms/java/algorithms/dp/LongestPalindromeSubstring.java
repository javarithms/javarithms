package com.manparvesh.javarithms.java.algorithms.dp;

public class LongestPalindromeSubstring {
    private boolean isPalindromic(String s) {
        if (s.length() < 2) {
            return true;
        }

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    /**
     * O(n^3) algorithm
     *
     * @param s
     * @return
     */
    public String naive(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                String ss = s.substring(i, j);
                if (isPalindromic(ss)) {
                    ans = ss.length() > ans.length() ? ss : ans;
                }
            }
        }

        System.out.println(ans);
        return ans;
    }

    /**
     * O(n^2) using DP (O(n^2) space)
     *
     * @param s
     * @return
     */
    public String efficient(String s) {
        int n = s.length();
        boolean table[][] = new boolean[n][n];

        // since all substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            table[i][i] = true;
        }

        int maxLength = 1;
        // substrings of length 2
        int start = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // for lengths greater than 2
        for (int k = 3; k <= n; k++) {
            for (int i = 0; i < n - k + 1; i++) {
                // end index of substring from starting index i and length k
                int j = i + k - 1;

                if (table[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    table[i][j] = true;
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }

        String ans = s.substring(start, start + maxLength);
        System.out.println(ans);
        return ans;
    }

    /**
     * TODO:
     * 1. https://www.geeksforgeeks.org/longest-palindromic-substring-set-2/
     * 2. https://www.geeksforgeeks.org/manachers-algorithm-linear-time-longest-palindromic-substring-part-1/
     * 3. https://www.geeksforgeeks.org/manachers-algorithm-linear-time-longest-palindromic-substring-part-2/
     * */
}

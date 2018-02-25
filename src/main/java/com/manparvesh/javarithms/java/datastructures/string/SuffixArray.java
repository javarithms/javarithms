package com.manparvesh.javarithms.java.datastructures.string;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Suffix array is just a sorted array of all the suffixes of a string.
 * It contains starting indices of all the substrings of a string, after
 * the suffixes are sorted.
 * <p>
 * A character like '$' is appended to every suffix before sorting.
 */
public class SuffixArray {
    /**
     * Naive sorting of the suffixes by simply doing quick sort on the list
     * O(N^2 Log(N)) because O(N Log(N)) for sorting and O(N) for string comparison
     */
    public int[] getSuffixArrayNaive(String s) {
        int ar[] = new int[s.length()];
        List<SuffixNaive> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(new SuffixNaive(i, s.substring(i) + '$'));
        }

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            ar[i] = list.get(i).index;
        }

        for (SuffixNaive suffix : list) {
            System.out.println(suffix);
        }

        return ar;
    }

    public int[] getSuffixArrayEfficient(String s) {
        int n = s.length();

        SuffixEfficient[] suffixes = new SuffixEfficient[n];

        // initialize ranks and stuff
        for (int index = 0; index < n; index++) {
            suffixes[index] = new SuffixEfficient(
                    s.charAt(index) - 'a',
                    index + 1 < n ? s.charAt(index + 1) - 'a' : -1,
                    index,
                    s.substring(index));
        }

        Arrays.sort(suffixes);

        int indices[] = new int[n];

        for (int k = 4; k < 2 * n; k *= 2) {
            int rank = 0;
            int previousRank = suffixes[0].rank1;
            suffixes[0].rank1 = rank;
            indices[suffixes[0].index] = 0;

            // assigning rank1 to suffixes
            for (int i = 1; i < n; i++) {
                // if rank1 and rank2 are same as that of previous
                // suffix in the array, assign the same rank to this suffix
                if (suffixes[i].rank1 == previousRank &&
                        suffixes[i].rank2 == suffixes[i - 1].rank2) {
                    previousRank = suffixes[i].rank1;
                    suffixes[i].rank1 = rank;
                } else {
                    // increment rank and assign
                    previousRank = suffixes[i].rank1;
                    rank++;
                    suffixes[i].rank1 = rank;
                }
                indices[suffixes[i].index] = i;
            }

            // assign rank2 to suffixes
            for (int i = 0; i < n; i++) {
                int nextIndex = suffixes[i].index + k / 2;
                suffixes[i].rank2 = nextIndex < n ?
                        suffixes[indices[nextIndex]].rank1 : -1;
            }

            Arrays.sort(suffixes);
        }

        int suffixArray[] = new int[n];

        for (int i = 0; i < n; i++) {
            suffixArray[i] = suffixes[i].index;
        }

        System.out.println("Printing suffix array obtained by efficient approach");
        for (SuffixEfficient suffixEfficient : suffixes) {
            System.out.println(suffixEfficient);
        }

        return suffixArray;
    }

    private class SuffixEfficient implements Comparable<SuffixEfficient> {
        int rank1;
        int rank2;
        int index;
        String suffix;

        SuffixEfficient(int rank1, int rank2, int index, String suffix) {
            this.rank1 = rank1;
            this.rank2 = rank2;
            this.index = index;
            this.suffix = suffix;
        }

        @Override
        public int compareTo(@NotNull SuffixEfficient otherSuffixEfficient) {
            return this.rank1 == otherSuffixEfficient.rank1 ?
                    this.rank2 - otherSuffixEfficient.rank2 :
                    this.rank1 - otherSuffixEfficient.rank1;
        }

        @Override
        public String toString() {
            return this.index + " " + this.suffix;
        }
    }

    private class SuffixNaive implements Comparable<SuffixNaive> {
        int index;
        String suffix;

        SuffixNaive(int index, String suffix) {
            this.index = index;
            this.suffix = suffix;
        }

        @Override
        public int compareTo(SuffixNaive otherSuffix) {
            return this.suffix.compareTo(otherSuffix.suffix);
        }

        @Override
        public String toString() {
            return this.index + " " + this.suffix;
        }
    }
}

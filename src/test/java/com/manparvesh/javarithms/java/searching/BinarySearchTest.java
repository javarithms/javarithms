package com.manparvesh.javarithms.java.searching;

import com.manparvesh.javarithms.java.exceptions.ArrayNotSortedException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    private int arrayToSearch[];
    private int elementToSearch;

    private int expectedPosition;

    private BinarySearch binarySearch;

    @Before
    public void setup() {
        arrayToSearch = new int[] { 1, 2, 4, 5, 6, 23, 45 };
        binarySearch = new BinarySearch();
    }

    /**
     * a common private function that checks if the actual and expected positions are equal
     *
     * @throws ArrayNotSortedException
     */
    private void check() throws ArrayNotSortedException {
        int actualPosition = binarySearch.search(elementToSearch, arrayToSearch);
        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void search1() throws ArrayNotSortedException {
        elementToSearch = 2;
        expectedPosition = 1;

        check();
    }

    @Test
    public void search2() throws ArrayNotSortedException {
        elementToSearch = -1;
        expectedPosition = -1;

        check();
    }

    @Test
    public void search3() throws ArrayNotSortedException {
        elementToSearch = 100;
        expectedPosition = -1;

        check();
    }

    @Test
    public void search4() throws ArrayNotSortedException {
        elementToSearch = 3;
        expectedPosition = -1;

        check();
    }

    @Test(expected = ArrayNotSortedException.class)
    public void search5() throws ArrayNotSortedException {
        int arrayToSearchNew[] = new int[] { 45, 2, 21, 45, 23 };
        int elementToSearchNew = 21;
        int elementIndex = binarySearch.search(elementToSearchNew, arrayToSearchNew);
    }
}
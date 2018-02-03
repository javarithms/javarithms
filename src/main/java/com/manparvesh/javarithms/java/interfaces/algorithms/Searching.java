package com.manparvesh.javarithms.java.interfaces.algorithms;

import com.manparvesh.javarithms.java.exceptions.ArrayNotSortedException;

public interface Searching {
    /**
     * This element searches for an element in an array in an average of O(n) complexity
     *
     * @param elementToSearch Element to search for
     * @param arrayToSearchIn array where we will search the element
     * @return The index of the searched element. If not present, this returns -1
     */
    int search(int elementToSearch, int[] arrayToSearchIn) throws ArrayNotSortedException;
}

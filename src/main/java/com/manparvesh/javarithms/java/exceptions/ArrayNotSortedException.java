package com.manparvesh.javarithms.java.exceptions;

/**
 * This is thrown when we expect an array to be sorted but it isn't
 */
public class ArrayNotSortedException extends Exception {
    public ArrayNotSortedException(String message) {
        super(message);
    }
}

package com.manparvesh.javarithms.java.datastructures.stack;

public class StackArray implements Stack {
    private int[] array;
    private int size;

    StackArray(int capacity) {
        this.array = new int[capacity];
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void push(int data) {
        if (this.size != this.array.length) {
            this.array[this.size++] = data;
        }
    }

    @Override
    public int pop() {
        if (this.size > 0) {
            int value = this.array[this.size - 1];
            this.size--;
            return value;
        }
        return -1;
    }
}

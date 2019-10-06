package com.manparvesh.javarithms.java.datastructures.stack;

public class Stack {
    private int[] array;
    private int size;

    Stack(int capacity) {
        this.array = new int[capacity];
        this.size = 0;
    }

    int size() {
        return this.size;
    }

    void push(int data) {
        if (this.size != this.array.length) {
            this.array[this.size++] = data;
        }
    }

    int pop() {
        if (this.size > 0) {
            int value = this.array[this.size - 1];
            this.size--;
            return value;
        }
        return -1;
    }
}

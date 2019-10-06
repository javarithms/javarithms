package com.manparvesh.javarithms.java.datastructures.stack;

public class StackLL implements Stack {
    private Node head;
    private int size;
    private int capacity;

    StackLL(int capacity) {
        size = 0;
        this.capacity = capacity;
    }

    @Override public int size() {
        return size;
    }

    @Override public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        if (size == capacity)
            return;

        newNode.next = head;
        head = newNode;
        size++;
    }

    @Override public int pop() {
        if (size == 0)
            return -1;

        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}

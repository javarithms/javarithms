package com.manparvesh.javarithms.java.interfaces.datastructures;

public interface LinkedList {
    int length();

    void printList();

    /*
     * insertions
     * */
    boolean insertAtBeginning(LinkedListNode node);

    boolean insertAtEnd(LinkedListNode node);

    boolean insertAtNthPosition(LinkedListNode node, int position);

    boolean insertAtBeginning(int data);

    boolean insertAtEnd(int data);

    boolean insertAtNthPosition(int data, int position);

    /*
     * deletions
     * */
    boolean delete(int data);

    boolean delete(LinkedListNode node);

    boolean deleteAt(int position);

    boolean deleteList();

    boolean deleteLast();

    boolean deleteFirst();
}

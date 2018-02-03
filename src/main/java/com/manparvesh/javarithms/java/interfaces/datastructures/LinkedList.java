package com.manparvesh.javarithms.java.interfaces.datastructures;

import com.manparvesh.javarithms.java.datastructures.SinglyLinkedList.Node;

public interface LinkedList {
    int length();

    void printList();

    /*
     * insertions
     * */
    boolean insertAtBeginning(Node node);

    boolean insertAtEnd(Node node);

    boolean insertAtNthPosition(Node node, int position);

    boolean insertAtBeginning(int data);

    boolean insertAtEnd(int data);

    boolean insertAtNthPosition(int data, int position);

    /*
     * deletions
     * */
    boolean delete(int data);

    boolean delete(Node node);

    boolean deleteAt(int position);

    boolean deleteList();

    boolean deleteLast();

    boolean deleteFirst();
}

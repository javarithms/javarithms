package com.manparvesh.javarithms.java.datastructures.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DoublyLinkedListTest {

    @Test
    public void insert() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtEnd(1);
        doublyLinkedList.insertAtBeginning(2);
        doublyLinkedList.printList();
        assertEquals(2, doublyLinkedList.length());
        assertTrue(doublyLinkedList.checkValidDoublyinkedList());

        doublyLinkedList.insertAtEnd(3);
        doublyLinkedList.insertAtBeginning(4);
        doublyLinkedList.printList();
        assertEquals(4, doublyLinkedList.length());
        assertTrue(doublyLinkedList.checkValidDoublyinkedList());

        doublyLinkedList.insertAtNthPosition(5, 1);
        doublyLinkedList.printList();
        assertEquals(5, doublyLinkedList.length());
        assertTrue(doublyLinkedList.checkValidDoublyinkedList());
    }

    @Test
    public void delete() {
    }
}
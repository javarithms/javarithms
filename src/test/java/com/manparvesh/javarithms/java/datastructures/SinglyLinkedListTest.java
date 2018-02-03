package com.manparvesh.javarithms.java.datastructures;

import com.manparvesh.javarithms.java.datastructures.linkedlist.SinglyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SinglyLinkedListTest {

    @Test
    public void length() {
    }

    @Test
    public void insertAtBeginning() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertAtBeginning(0);
        singlyLinkedList.insertAtBeginning(1);
        singlyLinkedList.insertAtBeginning(2);
        singlyLinkedList.printList();
        assertEquals(3, singlyLinkedList.length());
    }

    @Test
    public void insertAtEnd() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertAtEnd(0);
        singlyLinkedList.insertAtEnd(1);
        singlyLinkedList.insertAtEnd(2);
        singlyLinkedList.printList();
        assertEquals(3, singlyLinkedList.length());
    }

    @Test
    public void insertAtNthPosition() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        assertTrue(singlyLinkedList.insertAtNthPosition(0, 1));
        assertTrue(singlyLinkedList.insertAtNthPosition(1, 0));
        assertTrue(singlyLinkedList.insertAtNthPosition(2, 1));
        singlyLinkedList.printList();
        assertEquals(3, singlyLinkedList.length());
    }

    @Test
    public void delete() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        assertTrue(singlyLinkedList.insertAtNthPosition(0, 1));
        singlyLinkedList.insertAtEnd(1);
        singlyLinkedList.insertAtEnd(2);
        singlyLinkedList.printList();
        assertEquals(3, singlyLinkedList.length());

        singlyLinkedList.delete(1);
        singlyLinkedList.printList();
        assertEquals(2, singlyLinkedList.length());

        singlyLinkedList.deleteList();
        assertEquals(0, singlyLinkedList.length());

        singlyLinkedList.insertAtEnd(1);
        singlyLinkedList.insertAtEnd(2);
        singlyLinkedList.insertAtEnd(3);
        singlyLinkedList.printList();

        singlyLinkedList.deleteFirst();
        singlyLinkedList.printList();

        singlyLinkedList.deleteLast();
        singlyLinkedList.printList();
        assertEquals(1, singlyLinkedList.length());

        singlyLinkedList.deleteAt(1);
        singlyLinkedList.printList();
        assertEquals(0, singlyLinkedList.length());

        singlyLinkedList.insertAtEnd(2);
        singlyLinkedList.insertAtEnd(3);
        singlyLinkedList.deleteAt(2);
        singlyLinkedList.printList();
        assertEquals(1, singlyLinkedList.length());
    }
}
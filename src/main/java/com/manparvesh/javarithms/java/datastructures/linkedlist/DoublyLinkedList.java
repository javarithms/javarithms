package com.manparvesh.javarithms.java.datastructures.linkedlist;

import com.manparvesh.javarithms.java.interfaces.datastructures.LinkedList;
import com.manparvesh.javarithms.java.interfaces.datastructures.LinkedListNode;

import java.util.ArrayList;

public class DoublyLinkedList implements LinkedList {
    private DoublyLinkedListNode head;

    @Override public int length() {
        int length = 0;
        LinkedListNode current = head;
        while (current != null) {
            length++;
            current = current.getNext();
        }
        return length;
    }

    @Override public void printList() {
        LinkedListNode current = head;
        while (current != null) {
            System.out.print(current.getData() + (current.getNext() != null ? " <-> " : ""));
            current = current.getNext();
        }
        System.out.println();
    }

    @Override public boolean insertAtBeginning(LinkedListNode node) {
        node.setNext(head);
        head = (DoublyLinkedListNode)node;
        return true;
    }

    @Override public boolean insertAtEnd(LinkedListNode node) {
        if (head == null) {
            head = (DoublyLinkedListNode)node;
        } else {
            DoublyLinkedListNode currentNode = head;
            DoublyLinkedListNode nodeToInsert = (DoublyLinkedListNode)node;
            while (currentNode.getNext() != null) {
                currentNode = (DoublyLinkedListNode)currentNode.getNext();
            }
            nodeToInsert.setPrevious(currentNode);
            currentNode.setNext(nodeToInsert);
        }
        return true;
    }

    @Override public boolean insertAtNthPosition(LinkedListNode node, int position) {
        if (head == null) {
            head = (DoublyLinkedListNode)node;
            return true;
        }

        if (position == 0) {
            insertAtBeginning(node);
            return true;
        }

        DoublyLinkedListNode currentNode = head;
        DoublyLinkedListNode nodeToInsert = (DoublyLinkedListNode)node;
        int currentPosition = 1;
        while (currentNode != null && currentPosition < position) {
            currentNode = (DoublyLinkedListNode)currentNode.getNext();
            currentPosition++;
        }
        if (currentNode != null) {
            nodeToInsert.setNext(currentNode.getNext());
            nodeToInsert.setPrevious(currentNode);
            currentNode.setNext(nodeToInsert);
        }
        return currentPosition == position;
    }

    @Override public boolean insertAtBeginning(int data) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        insertAtBeginning(node);
        return true;
    }

    @Override public boolean insertAtEnd(int data) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        insertAtEnd(node);
        return true;
    }

    @Override public boolean insertAtNthPosition(int data, int position) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        insertAtNthPosition(node, position);
        return true;
    }

    @Override public boolean delete(int data) {
        if (head == null) {
            return false;
        }

        if (head.getData() == data) {
            head = null;
            return true;
        }

        DoublyLinkedListNode currentNode = head;
        while (currentNode.getNext() != null) {
            if (currentNode.getNext().getData() == data) {
                /*
                 * delete the next node
                 * Since there is no delete in Java and the garbage collector handles deletion,
                 * we don't need to do anything else
                 * */
                currentNode.setNext(currentNode.getNext().getNext());
                return true;
            }
            currentNode = (DoublyLinkedListNode)currentNode.getNext();
        }
        return false;
    }

    // todo remove all interfaces related to linked lists, because it's not needed.
    // All implementations have their own config, and so should define their nodes inside their classes
    // and should have functions that use only those inner class nodes
    @Override public boolean delete(LinkedListNode node) {
        return false;
    }

    // todo
    @Override public boolean deleteAt(int position) {
        return false;
    }

    // todo
    @Override public boolean deleteList() {
        return false;
    }

    // todo
    @Override public boolean deleteLast() {
        return false;
    }

    // todo
    @Override public boolean deleteFirst() {
        return false;
    }

    public boolean checkValidDoublyinkedList() {
        if (head == null) {
            return true;
        }
        ArrayList<Integer> list = new ArrayList<>();
        DoublyLinkedListNode currentNode = head;
        list.add(currentNode.getData());
        while (currentNode.getNext() != null) {
            list.add(currentNode.getNext().getData());
            currentNode = (DoublyLinkedListNode)currentNode.getNext();
        }
        for (int n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
        int i = list.size() - 1;
        while (currentNode.getPrevious() != null) {
            if (currentNode.getData() != list.get(i)) {
                return false;
            }
            currentNode = currentNode.getPrevious();
            i--;
        }
        return true;
    }

    /**
     * Node definition for doubly linked list
     */
    class DoublyLinkedListNode implements LinkedListNode {
        private int data;
        private DoublyLinkedListNode next;
        private DoublyLinkedListNode previous;

        DoublyLinkedListNode(int data) {
            this.data = data;
        }

        @Override public int getData() {
            return data;
        }

        @Override public LinkedListNode getNext() {
            return next;
        }

        @Override public void setNext(LinkedListNode next) {
            this.next = (DoublyLinkedListNode)next;
        }

        DoublyLinkedListNode getPrevious() {
            return previous;
        }

        void setPrevious(DoublyLinkedListNode previous) {
            this.previous = previous;
        }
    }
}

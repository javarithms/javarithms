package com.manparvesh.javarithms.java.datastructures.linkedlist;

import java.util.ArrayList;

public class DoublyLinkedList {
    private DoublyLinkedListNode head;

    public int length() {
        int length = 0;
        DoublyLinkedListNode current = head;
        while (current != null) {
            length++;
            current = current.getNext();
        }
        return length;
    }

    public void printList() {
        DoublyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.getData() + (current.getNext() != null ? " <-> " : ""));
            current = current.getNext();
        }
        System.out.println();
    }

    public boolean insertAtBeginning(DoublyLinkedListNode node) {
        node.setNext(head);
        head = node;
        return true;
    }

    public boolean insertAtEnd(DoublyLinkedListNode node) {
        if (head == null) {
            head = node;
        } else {
            DoublyLinkedListNode currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            node.setPrevious(currentNode);
            currentNode.setNext(node);
        }
        return true;
    }

    public boolean insertAtNthPosition(DoublyLinkedListNode node, int position) {
        if (head == null) {
            head = node;
            return true;
        }

        if (position == 0) {
            insertAtBeginning(node);
            return true;
        }

        DoublyLinkedListNode currentNode = head;
        DoublyLinkedListNode nodeToInsert = node;
        int currentPosition = 1;
        while (currentNode != null && currentPosition < position) {
            currentNode = currentNode.getNext();
            currentPosition++;
        }
        if (currentNode != null) {
            nodeToInsert.setNext(currentNode.getNext());
            nodeToInsert.setPrevious(currentNode);
            currentNode.setNext(nodeToInsert);
        }
        return currentPosition == position;
    }

    public boolean insertAtBeginning(int data) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        return insertAtBeginning(node);
    }

    public boolean insertAtEnd(int data) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        return insertAtEnd(node);
    }

    public boolean insertAtNthPosition(int data, int position) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        insertAtNthPosition(node, position);
        return true;
    }

    public boolean delete(int data) {
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
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public boolean delete(DoublyLinkedListNode node) {
        return delete(node.data);
    }

    public boolean deleteAt(int position) {
        DoublyLinkedListNode currentNode = head;
        int currentPosition = 1;
        if (head != null) {
            
        }
        return false;
    }

    // todo
    public boolean deleteList() {
        return false;
    }

    // todo
    public boolean deleteLast() {
        return false;
    }

    // todo
    public boolean deleteFirst() {
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
    class DoublyLinkedListNode {
        private int data;
        private DoublyLinkedListNode next;
        private DoublyLinkedListNode previous;

        DoublyLinkedListNode(int data) {
            this.data = data;
        }

        int getData() {
            return data;
        }

        DoublyLinkedListNode getNext() {
            return next;
        }

        void setNext(DoublyLinkedListNode next) {
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

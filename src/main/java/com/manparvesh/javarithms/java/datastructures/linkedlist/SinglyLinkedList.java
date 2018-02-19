package com.manparvesh.javarithms.java.datastructures.linkedlist;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Basic operations:
 * 1. Traversing the list
 * 2. insertion
 * 3. deletion
 */
@NoArgsConstructor
public class SinglyLinkedList {
    private SinglyLinkedListNode head;

    public int length() {
        int length = 0;
        SinglyLinkedListNode current = head;
        while (current != null) {
            length++;
            current = current.getNext();
        }
        return length;
    }

    public void printList() {
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.getData() + (current.getNext() != null ? " -> " : ""));
            current = current.getNext();
        }
        System.out.println();
    }

    public boolean insertAtBeginning(SinglyLinkedListNode node) {
        node.setNext(head);
        head = node;
        return true;
    }

    public boolean insertAtEnd(SinglyLinkedListNode node) {
        if (head == null) {
            head = node;
        } else {
            SinglyLinkedListNode currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(node);
        }
        return true;
    }

    public boolean insertAtNthPosition(SinglyLinkedListNode node, int position) {
        if (head == null) {
            head = node;
            return true;
        }

        if (position == 0) {
            insertAtBeginning(node);
            return true;
        }

        SinglyLinkedListNode currentNode = head;
        int currentPosition = 1;
        while (currentNode != null && currentPosition < position) {
            currentNode = currentNode.getNext();
            currentPosition++;
        }
        if (currentNode != null) {
            node.setNext(currentNode.getNext());
            currentNode.setNext(node);
        }
        return currentPosition == position;
    }

    public boolean insertAtBeginning(int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        insertAtBeginning(newNode);
        return true;
    }

    public boolean insertAtEnd(int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        insertAtEnd(newNode);
        return true;
    }

    public boolean insertAtNthPosition(int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        return insertAtNthPosition(newNode, position);
    }

    public boolean delete(int data) {
        if (head == null) {
            return false;
        }

        if (head.getData() == data) {
            head = null;
            return true;
        }

        SinglyLinkedListNode currentNode = head;
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

    public boolean delete(SinglyLinkedListNode node) {
        return delete(node.getData());
    }

    public boolean deleteAt(int position) {
        int currentPosition = 1;
        if (head == null) {
            return false;
        }
        if (head.getNext() == null) {
            if (position == 1) {
                head = null;
                return true;
            } else {
                return false;
            }
        }
        SinglyLinkedListNode currentNode = head;
        while (currentNode != null && currentPosition < position - 1) {
            currentNode = currentNode.getNext();
            currentPosition++;
        }
        if (currentNode != null) {
            /*
             * delete the next node
             * Since there is no delete in Java and the garbage collector handles deletion,
             * we don't need to do anything else
             * */
            currentNode.setNext(currentNode.getNext().getNext());
            return true;
        }
        return false;
    }

    public boolean deleteList() {
        if (head != null) {
            head = null;
            return true;
        }
        return false;
    }

    public boolean deleteLast() {
        if (head == null) {
            return false;
        } else if (head.getNext() == null) {
            head = null;
            return true;
        } else {
            SinglyLinkedListNode currentNode = head;
            while (currentNode.getNext().getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);
            return true;
        }
    }

    public boolean deleteFirst() {
        if (head == null) {
            return false;
        } else if (head.getNext() == null) {
            head = null;
            return true;
        } else {
            head = head.getNext();
            return true;
        }
    }

    @Data
    public class SinglyLinkedListNode {
        SinglyLinkedListNode next;
        int data;

        SinglyLinkedListNode(int data) {
            this.data = data;
        }
    }

}

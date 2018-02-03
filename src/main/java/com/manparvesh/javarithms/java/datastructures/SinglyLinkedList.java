package com.manparvesh.javarithms.java.datastructures;

import com.manparvesh.javarithms.java.interfaces.datastructures.LinkedList;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Basic operations:
 * 1. Traversing the list
 * 2. insertion
 * 3. deletion
 */
@NoArgsConstructor
public class SinglyLinkedList implements LinkedList {
    private Node head;

    @Override public int length() {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    @Override public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    @Override public boolean insertAtBeginning(Node node) {
        node.next = head;
        head = node;
        return true;
    }

    @Override public boolean insertAtEnd(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
        return true;
    }

    @Override public boolean insertAtNthPosition(Node node, int position) {
        if (head == null) {
            head = node;
            return true;
        }

        if (position == 0) {
            insertAtBeginning(node);
            return true;
        }

        Node currentNode = head;
        int currentPosition = 1;
        while (currentNode != null && currentPosition < position) {
            currentNode = currentNode.next;
            currentPosition++;
        }
        if (currentNode != null) {
            node.next = currentNode.next;
            currentNode.next = node;
        }
        return currentPosition == position;
    }

    @Override public boolean insertAtBeginning(int data) {
        Node newNode = new Node(data);
        insertAtBeginning(newNode);
        return true;
    }

    @Override public boolean insertAtEnd(int data) {
        Node newNode = new Node(data);
        insertAtEnd(newNode);
        return true;
    }

    @Override public boolean insertAtNthPosition(int data, int position) {
        Node newNode = new Node(data);
        return insertAtNthPosition(newNode, position);
    }

    @Override public boolean delete(int data) {
        if (head == null) {
            return false;
        }

        if (head.data == data) {
            head = null;
            return true;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.data == data) {
                /*
                 * delete the next node
                 * Since there is no delete in Java and the garbage collector handles deletion,
                 * we don't need to do anything else
                 * */
                currentNode.next = currentNode.next.next;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override public boolean delete(Node node) {
        return delete(node.data);
    }

    @Override public boolean deleteAt(int position) {
        int currentPosition = 1;
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            if (position == 1) {
                head = null;
                return true;
            } else {
                return false;
            }
        }
        Node currentNode = head;
        while (currentNode != null && currentPosition < position - 1) {
            currentNode = currentNode.next;
            currentPosition++;
        }
        if (currentNode != null) {
            /*
             * delete the next node
             * Since there is no delete in Java and the garbage collector handles deletion,
             * we don't need to do anything else
             * */
            currentNode.next = currentNode.next.next;
            return true;
        }
        return false;
    }

    @Override public boolean deleteList() {
        if (head != null) {
            head = null;
            return true;
        }
        return false;
    }

    @Override public boolean deleteLast() {
        if (head == null) {
            return false;
        } else if (head.next == null) {
            head = null;
            return true;
        } else {
            Node currentNode = head;
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            return true;
        }
    }

    @Override public boolean deleteFirst() {
        if (head == null) {
            return false;
        } else if (head.next == null) {
            head = null;
            return true;
        } else {
            head = head.next;
            return true;
        }
    }

    @Data
    public class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

}

package com.manparvesh.javarithms.java.datastructures.lrucache;

import java.util.HashMap;

public class LRUCache {
    private int capacity;
    private HashMap<Integer, DLLNode> map = new HashMap<>();
    private DLLNode head = null;
    private DLLNode end = null;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets the value of the Node corresponding to the key in the HashMap
     *
     * @param key key
     * @return corresponding value
     */
    public int get(int key) {
        if (map.containsKey(key)) {
            DLLNode node = map.get(key);
            remove(node);
            setHead(node);
            return node.value;
        }
        return -1;
    }

    private void setHead(DLLNode node) {
        node.previous = null;
        node.next = head;

        if (head != null) {
            head.previous = node;
        }

        head = node;

        if (end == null) {
            end = head;
        }
    }

    private void remove(DLLNode node) {
        if (node.previous != null) {
            node.previous.next = node.next;
        } else {
            // this node is head
            head = node.next;
        }

        if (node.next != null) {
            node.next.previous = node.previous;
        } else {
            // this node is tail
            end = node.previous;
        }
    }

    /**
     * set the position of an existing node
     * insert a new node if the value is not present
     * if the cache has reached its limit, pop the oldest node
     *
     * @param key   key
     * @param value value
     */
    public void set(int key, int value) {
        if (map.containsKey(key)) {
            DLLNode oldNode = map.get(key);
            oldNode.value = value;
            remove(oldNode);
            setHead(oldNode);
        } else {
            // insert
            DLLNode newNode = new DLLNode(key, value);
            if (map.size() >= capacity) {
                map.remove(end.key);
                remove(end);
            }
            setHead(newNode);
            map.put(key, newNode);
        }
    }

    class DLLNode {
        int key;
        int value;
        DLLNode previous;
        DLLNode next;

        DLLNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

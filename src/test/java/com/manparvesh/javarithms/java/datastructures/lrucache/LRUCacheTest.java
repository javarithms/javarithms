package com.manparvesh.javarithms.java.datastructures.lrucache;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LRUCacheTest {
    @Test
    public void testLRUCache() {
        LRUCache lruCache = new LRUCache(5);
        assertEquals(-1, lruCache.get(2));
        lruCache.set(1, 1);
        lruCache.set(2, 2);
        lruCache.set(3, 3);
        lruCache.set(4, 4);
        lruCache.set(5, 5);
        assertEquals(1, lruCache.get(1));
        assertEquals(2, lruCache.get(2));
        assertEquals(3, lruCache.get(3));
        assertEquals(4, lruCache.get(4));
        assertEquals(5, lruCache.get(5));
        lruCache.set(1, 5);
        assertEquals(5, lruCache.get(1));
        lruCache.set(1, 6);
        assertEquals(6, lruCache.get(1));
        lruCache.set(6, 7);
        assertEquals(7, lruCache.get(6));
    }
}
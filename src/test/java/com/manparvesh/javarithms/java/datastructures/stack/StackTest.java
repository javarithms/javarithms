package com.manparvesh.javarithms.java.datastructures.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {
    @Test
    public void test() {
        Stack stack = new Stack(10);

        for (int i = 0; i < 10; i++) {
            stack.push(i + 1);
            assertEquals(i + 1, stack.size());
        }
        for (int i = 0; i < 10; i++) {
            stack.push(i + 1);
            assertEquals(10, stack.size());
        }
        for (int i = 0; i < 10; i++) {
            assertEquals(10 - i, stack.pop());
            assertEquals(10 - i - 1, stack.size());
        }
        for (int i = 0; i < 10; i++) {
            assertEquals(-1, stack.pop());
            assertEquals(0, stack.size());
        }
    }
}
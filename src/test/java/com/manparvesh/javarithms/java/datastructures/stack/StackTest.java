package com.manparvesh.javarithms.java.datastructures.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {
    private void testStack(Stack stack) {
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

    @Test
    public void testStackArray() {
        Stack stack = new StackArray(10);
        testStack(stack);
    }

    @Test
    public void testStackLL() {
        Stack stack = new StackLL(10);
        testStack(stack);
    }
}
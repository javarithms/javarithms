package com.manparvesh.javarithms.test.kotlin.sorting

import com.manparvesh.javarithms.kotlin.sorting.Selection
import org.junit.Assert.assertNull
import org.junit.Test

class SelectionTest {
    @Test
    fun testSelectionSort() {
        val intArray = Selection().sort(IntArray(10))
        assertNull(intArray)
    }
}
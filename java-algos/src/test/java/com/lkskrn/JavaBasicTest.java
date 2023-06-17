package com.lkskrn;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JavaBasicTest {

    @Test
    void countBits() {
        var javaBasic = new JavaBasic();
        assertArrayEquals(new int[]{0}, javaBasic.countBits(0));
        assertArrayEquals(new int[]{0, 1}, javaBasic.countBits(1));
        assertArrayEquals(new int[]{0, 1, 1}, javaBasic.countBits(2));
        assertArrayEquals(new int[]{0, 1, 1, 2}, javaBasic.countBits(3));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1}, javaBasic.countBits(4));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, javaBasic.countBits(5));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2, 2}, javaBasic.countBits(6));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2, 2, 3}, javaBasic.countBits(7));
    }

    @Test
    void countBitsForASpecificNumber() {
        var javaBasic = new JavaBasic();
        assertEquals(javaBasic.countBitsForASpecificNumber(0), 0);
        assertEquals(javaBasic.countBitsForASpecificNumber(1), 1);
        assertEquals(javaBasic.countBitsForASpecificNumber(2), 1);
        assertEquals(javaBasic.countBitsForASpecificNumber(3), 2);
        assertEquals(javaBasic.countBitsForASpecificNumber(4), 1);
        assertEquals(javaBasic.countBitsForASpecificNumber(5), 2);
        assertEquals(javaBasic.countBitsForASpecificNumber(6), 2);
        assertEquals(javaBasic.countBitsForASpecificNumber(7), 3);
        assertEquals(javaBasic.countBitsForASpecificNumber(255), 8);
        assertEquals(javaBasic.countBitsForASpecificNumber(256), 1);
        assertEquals(javaBasic.countBitsForASpecificNumber(Integer.MAX_VALUE), 31);
//        assertEquals(javaBasic.countBitsForASpecificNumber(Integer.MIN_VALUE), 1);
//        assertEquals(javaBasic.countBitsForASpecificNumber(-1), 32);
    }
}
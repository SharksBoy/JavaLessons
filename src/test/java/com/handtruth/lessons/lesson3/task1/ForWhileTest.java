package com.handtruth.lessons.lesson3.task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForWhileTest {
    private static ForWhile forWhile;

    @BeforeAll
    static void setUp() {
        forWhile = new ForWhile();
    }

    @Test
    @Tag("Trivial")
    void factorial() {
        assertEquals(1.0, forWhile.factorial(0), 1e-5);
        assertEquals(1.0, forWhile.factorial(1), 1e-5);
        assertEquals(6.0, forWhile.factorial(3), 1e-5);
        assertEquals(120.0, forWhile.factorial(5), 1e-5);
        assertEquals(3628800.0, forWhile.factorial(10), 1e-5);
        assertEquals(2.43290200817664E18, forWhile.factorial(20), 1E10);
    }

    @Test
    @Tag("Trivial")
    void counter() {
        assertEquals(1, forWhile.counter(0));
        assertEquals(1, forWhile.counter(7));
        assertEquals(2, forWhile.counter(10));
        assertEquals(2, forWhile.counter(99));
        assertEquals(3, forWhile.counter(123));
        assertEquals(10, forWhile.counter(Integer.MAX_VALUE));
    }

    @Test
    @Tag("Easy")
    void isCoPrime() {
        assertTrue(forWhile.isCoPrime(25, 49));
        assertFalse(forWhile.isCoPrime(6, 8));
        assertTrue(forWhile.isCoPrime(17, 97));
        assertFalse(forWhile.isCoPrime(37, 111));
        assertTrue(forWhile.isCoPrime(1234567890, 908765431));
        assertTrue(forWhile.isCoPrime(2109876543, 1234567891));
    }

    @Test
    @Tag("Medium")
    void sin() {
        assertEquals(0.0, forWhile.sin(0.0, 1e-5), 1e-5);
        assertEquals(1.0, forWhile.sin(Math.PI / 2.0, 1e-5), 1e-5);
        assertEquals(0.0, forWhile.sin(Math.PI, 1e-5), 1e-5);
        assertEquals(-1.0, forWhile.sin(3.0 * Math.PI / 2.0, 1e-5), 1e-5);
        assertEquals(0.0, forWhile.sin(100 * Math.PI, 1e-5), 1e-5);
    }

    @Test
    @Tag("Hard")
    void squareSequenceDigit() {
        assertEquals(1, forWhile.squareSequenceDigit(1));
        assertEquals(4, forWhile.squareSequenceDigit(2));
        assertEquals(5, forWhile.squareSequenceDigit(7));
        assertEquals(6, forWhile.squareSequenceDigit(12));
        assertEquals(0, forWhile.squareSequenceDigit(17));
        assertEquals(9, forWhile.squareSequenceDigit(27));
    }
}
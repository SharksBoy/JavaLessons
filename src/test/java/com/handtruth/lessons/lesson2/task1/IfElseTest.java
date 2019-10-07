package com.handtruth.lessons.lesson2.task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IfElseTest {
    private static IfElse ifElse;

    @BeforeAll
    static void setObjects() {
        ifElse = new IfElse();
    }

    @Test
    @Tag("Trivial")
    void compare() {
        assertEquals(1, ifElse.compare(5, 3));
        assertEquals(-1, ifElse.compare(4, 5));
        assertEquals(0, ifElse.compare(5, 5));
    }

    @Test
    @Tag("Easy")
    void ageDescription() {
        assertEquals("1 год", ifElse.ageDescription(1));
        assertEquals("21 год", ifElse.ageDescription(21));
        assertEquals("132 года", ifElse.ageDescription(132));
        assertEquals("12 лет", ifElse.ageDescription(12));
        assertEquals("111 лет", ifElse.ageDescription(111));
        assertEquals("199 лет", ifElse.ageDescription(199));
    }

    @Test
    @Tag("Easy")
    void triangleKind() {
        assertEquals(-1, ifElse.triangleKind(3.0, 7.5, 4.0));
        assertEquals(1, ifElse.triangleKind(5.0, 3.0, 4.0));
        assertEquals(2, ifElse.triangleKind(4.0, 6.0, 8.0));
        assertEquals(0, ifElse.triangleKind(1.0, 1.5, 1.5));
    }

    @Test
    @Tag("Medium")
    void segmentLength() {
        assertEquals(-1, ifElse.segmentLength(1, 2, 3, 4));
        assertEquals(-1, ifElse.segmentLength(5, 7, 1, 3));
        assertEquals(0, ifElse.segmentLength(1, 2, 2, 4));
        assertEquals(3, ifElse.segmentLength(3, 6, 0, 9));
        assertEquals(2, ifElse.segmentLength(2, 5, 3, 9));
        assertEquals(1, ifElse.segmentLength(3, 6, 1, 4));
        assertEquals(4, ifElse.segmentLength(1, 15, 10, 14));
    }
}

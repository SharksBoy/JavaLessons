package com.handtruth.lessons.lesson5.task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomParseTest {
    private static CustomParse parse;

    @BeforeAll
    static void setUp() {
        parse = new CustomParse();
    }

    @Test
    @Tag("Easy")
    void customHash() {
        assertEquals("Hello".hashCode(), parse.customHash("Hello"));
        assertEquals("12333".hashCode(), parse.customHash("12333"));
        assertEquals("".hashCode(), parse.customHash(""));
        assertEquals("world".hashCode(), parse.customHash("world"));
    }

    @Test
    @Tag("Medium")
    void isClose() {
        assertTrue(parse.isClose("([{({})}]())"));
        assertFalse(parse.isClose("[({)}]"));
        assertFalse(parse.isClose("(((()))"));
        assertFalse(parse.isClose("["));
        assertFalse(parse.isClose("]"));
        assertFalse(parse.isClose(""));
        assertTrue(parse.isClose("([]())"));
    }

    @Test
    @Tag("Hard")
    void contain() {
        assertTrue(parse.contain("Hello world", "world"));
        assertTrue(parse.contain("My name is Java", "ame"));
        assertTrue(parse.contain("What a beautiful day today", "a bea"));
        assertFalse(parse.contain("What a beautiful day today", "beautifule"));
    }
}
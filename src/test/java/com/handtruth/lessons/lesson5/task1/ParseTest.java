package com.handtruth.lessons.lesson5.task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParseTest {
    private static Parse parse;

    @BeforeAll
    static void setUp() {
        parse = new Parse();
    }

    @Test
    @Tag("Easy")
    void toDigitStr() {
        assertEquals("00", parse.toDigitStr(0));
        assertEquals("05", parse.toDigitStr(5));
        assertEquals("67", parse.toDigitStr(67));
        assertEquals("99", parse.toDigitStr(99));
    }

    @Test
    @Tag("Easy")
    void timeSecondsToStr() {
        assertEquals("10:00:00", parse.timeSecondsToStr(36000));
        assertEquals("11:34:45", parse.timeSecondsToStr(41685));
        assertEquals("23:59:59", parse.timeSecondsToStr(86399));
    }

    @Test
    @Tag("Easy")
    void isBin() {
        assertTrue(parse.isBin("1001"));
        assertTrue(parse.isBin("1"));
        assertFalse(parse.isBin("10102"));
    }

    @Test
    @Tag("Medium")
    void substring() {
        assertEquals("Hello", parse.substring("Hello world",0, 5));
        assertEquals("wo", parse.substring("Hello world",6, 8));
    }

    @Test
    @Tag("Hard")
    void mathOperation() {
        assertEquals(11, parse.mathOperation("5 + 6"));
        assertEquals(100, parse.mathOperation("155 - 55"));
        assertEquals(30, parse.mathOperation("5 * 6"));
        assertEquals(12, parse.mathOperation("6+6"));
    }
}
package com.handtruth.lessons.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTaskTest {
    private static ListTask listTask;

    @BeforeAll
    static void setUp() {
        listTask = new ListTask();
    }

    @Test
    @Tag("Easy")
    void positiveCounter() {
        assertEquals(0, listTask.positiveCounter(new ArrayList<Integer>()));
        assertEquals(3, listTask.positiveCounter(Arrays.asList(3, 4, 5)));
        assertEquals(1, listTask.positiveCounter(Arrays.asList(0, -4, -5)));
        assertEquals(0, listTask.positiveCounter(Arrays.asList(-3, -4, -5)));
    }

    @Test
    @Tag("Easy")
    void maxNumber() {
        assertEquals(5, listTask.maxNumber(Arrays.asList(3, 4, 5)));
        assertEquals(5, listTask.maxNumber(Arrays.asList(-10, 0, 5)));
        assertEquals(0, listTask.maxNumber(Arrays.asList(0, -4, -5)));
        assertEquals(Integer.MAX_VALUE, listTask.maxNumber(Arrays.asList(Integer.MIN_VALUE, Integer.MAX_VALUE)));
    }

    @Test
    @Tag("Medium")
    void items() {
        assertEquals(Collections.singletonList(-3), listTask.items(Arrays.asList(-3, 10, 50), Arrays.asList(-3, 4, 5)));
        assertEquals(Arrays.asList(3, 4, 5), listTask.items(Arrays.asList( -4, -3, 3, 4, 5), Arrays.asList(3, 4, 5)));
        assertEquals(Collections.emptyList(), listTask.items(Arrays.asList(3, 4, 5), Arrays.asList(6, 7, 8)));
    }

    @Test
    @Tag("Hard")
    void simpleSort() {
        assertEquals(Arrays.asList(3, 4, 5), listTask.simpleSort(Arrays.asList( 5, 4, 3)));
        assertEquals(Arrays.asList(-1000, -89, 100, Integer.MAX_VALUE),
                listTask.simpleSort(Arrays.asList( 100, -89, -1000, Integer.MAX_VALUE)));
        assertEquals(Arrays.asList(-90, -15, -4, -3, 0), listTask.simpleSort(Arrays.asList( -4, -3, -15, -90, 0)));
    }

    @Test
    @Tag("Hard")
    void mergeSort() {
        assertEquals(Arrays.asList(3, 4, 5), listTask.mergeSort(Arrays.asList( 5, 4, 3)));
        assertEquals(Arrays.asList(-1000, -89, 100, Integer.MAX_VALUE),
                listTask.mergeSort(Arrays.asList( 100, -89, -1000, Integer.MAX_VALUE)));
        assertEquals(Arrays.asList(-90, -15, -4, -3, 0), listTask.mergeSort(Arrays.asList( -4, -3, -15, -90, 0)));
    }

    @Test
    @Tag("Hard")
    void quickSort() {
        assertEquals(Arrays.asList(3, 4, 5), listTask.quickSort(Arrays.asList( 5, 4, 3)));
        assertEquals(Arrays.asList(-1000, -89, 100, Integer.MAX_VALUE),
                listTask.quickSort(Arrays.asList( 100, -89, -1000, Integer.MAX_VALUE)));
        assertEquals(Arrays.asList(-90, -15, -4, -3, 0), listTask.quickSort(Arrays.asList( -4, -3, -15, -90, 0)));
    }

    @Test
    @Tag("Hard")
    void linearSort() {
        assertEquals(Arrays.asList(3, 4, 5), listTask.linearSort(Arrays.asList( 5, 4, 3)));
        assertEquals(Arrays.asList(5, 15, 60, 100),
                listTask.linearSort(Arrays.asList(15, 100, 60, 5)));
        assertEquals(Arrays.asList(15, 15, 50, 50), listTask.linearSort(Arrays.asList( 50, 50, 15, 15)));
    }
}
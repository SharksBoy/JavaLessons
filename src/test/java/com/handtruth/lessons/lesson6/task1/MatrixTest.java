package com.handtruth.lessons.lesson6.task1;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    @Tag("Trivial")
    void defaultTest() {
        Matrix a = new Matrix(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        assertEquals(1, a.getByIndex(0, 0));
        assertEquals(5, a.getByIndex(1, 1));
        assertEquals(9, a.getByIndex(2, 2));
        assertEquals(3, a.getHeight());
        assertEquals(3, a.getWeight());
    }

    @Test
    @Tag("Trivial")
    void createMatrix() {
        Matrix res = new Matrix(new int[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        });
        assertEquals(res, Matrix.createMatrix(3, 3, 1));
    }

    @Test
    @Tag("Medium")
    void testEquals() {
        Matrix a1 = new Matrix(new int[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        });
        Matrix a2 = Matrix.createMatrix(3, 3, 1);
        Matrix a3 = Matrix.createMatrix(2, 2, 1);
        assertEquals(a1, a2);
        assertNotEquals(a1, a3);
    }
}
package com.handtruth.lessons.lesson6.task2;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.handtruth.lessons.lesson6.task1.Matrix;

import static org.junit.jupiter.api.Assertions.*;

class MatrixToolsTest {

    @Test
    @Tag("Easy")
    void rotation() {
        Matrix a = new Matrix(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        Matrix res = new Matrix(new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        });
        assertEquals(res, MatrixTools.rotation(a));
    }

    @Test
    @Tag("Easy")
    void transpose() {
        Matrix a = new Matrix(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        Matrix res = new Matrix(new int[][]{
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        });
        assertEquals(res, MatrixTools.transpose(a));
    }

    @Test
    @Tag("Medium")
    void determinant() {
        Matrix a = new Matrix(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        Matrix b = new Matrix(new int[][]{
                {1, 2, 100},
                {4, 5, 6},
                {7, 10, 9}
        });
        assertEquals(0, MatrixTools.determinant(a));
        assertEquals(497, MatrixTools.determinant(b));
    }

    @Test
    @Tag("Medium")
    void inverse() {
        Matrix a = new Matrix(new int[][]{
                {3, 4},
                {5, 7}
        });
        Matrix res = new Matrix(new int[][]{
                {7, -4},
                {-5, 3}
        });
        assertEquals(res, MatrixTools.inverse(a));
    }

    @Test
    @Tag("Easy")
    void addition() {
        Matrix a = new Matrix(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        Matrix b = new Matrix(new int[][]{
                {3, 4, 5},
                {6, 7, 8},
                {9, 1, 2}
        });
        Matrix res = new Matrix(new int[][]{
                {4, 6, 8},
                {10, 12, 14},
                {16, 9, 11}
        });
        assertEquals(res, MatrixTools.addition(a, b));
    }

    @Test
    @Tag("Medium")
    void multiplication() {
        Matrix a = new Matrix(new int[][]{
                {4, 2},
                {9, 0}
        });
        Matrix b = new Matrix(new int[][]{
                {3, 1},
                {-3, 4}
        });
        Matrix res = new Matrix(new int[][]{
                {6, 12},
                {27, 9}
        });
        assertEquals(res, MatrixTools.multiplication(a, b));
    }

    @Test
    @Tag("Medium")
    void multiplicationExceptions() {
        Matrix a = new Matrix(new int[][]{
                {4}
        });
        Matrix b = new Matrix(new int[][]{
                {3, 1},
                {-3, 4}
        });
        //noinspection ResultOfMethodCallIgnored
        assertThrows(IllegalArgumentException.class, () -> MatrixTools.multiplication(a, b));
    }
}
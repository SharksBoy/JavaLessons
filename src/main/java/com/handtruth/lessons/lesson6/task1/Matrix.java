package com.handtruth.lessons.lesson6.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Medium
 * <p>
 * Необходимо реализовать все методы класса Матрица.
 * из списка: ArrayList<Integer>, int[], int[][] и т.д.
 */
@SuppressWarnings("WeakerAccess")
public class Matrix {
    private int height;
    private int weight;
    private int[][] matrix;

    /**
     * Easy
     * <p>
     * Реализовать конструктор
     *
     * @param matrix - исходная матрица
     */
    public Matrix(int[][] matrix) {
        assert matrix.length > 0 && matrix[0].length > 0 : "Значения ширины и высоты не могут быть меньше нуля!";
        //TODO your code
    }

    /**
     * Easy
     * <p>
     * Реализовать конструктор
     *
     * @param height высота матрицы
     * @param weight ширина матрицы
     * @param e      чем заполнять
     */
    public Matrix(int height, int weight, int e) {
        assert height > 0 && weight > 0 : "Значения ширины и высоты не могут быть меньше нуля!";
        //TODO your code
    }

    /**
     * Trivial
     *
     * @return значение высоты
     */
    public int getHeight() {
        return -1; //TODO your code
    }

    /**
     * Trivial
     *
     * @param height новое значние высоты
     */
    public void setHeight(int height) {
        //TODO your code
    }

    /**
     * Trivial
     *
     * @return значение ширины
     */
    public int getWeight() {
        return -1; //TODO your code
    }

    /**
     * Trivial
     *
     * @param weight новое значение ширины
     */
    public void setWeight(int weight) {
        //TODO your code
    }

    /**
     * Trivial
     *
     * @return текущая конфигурация матрицы
     */
    public int[][] getMatrix() {
        return new int[][]{}; //TODO your code
    }

    /**
     * Trivial
     *
     * @param matrix новая матрица
     */
    public void setMatrix(int[][] matrix) {
        //TODO your code
    }

    /**
     * Trivial
     *
     * @param weight ширина элемента
     * @param height высота элемента
     * @return значение в заданных индексах
     */
    public int getByIndex(int weight, int height) {
        //TODO your code
        return -1;
    }

    /**
     * Trivial
     * <p>
     * Метод для генерации Матрциы
     *
     * @param height высота матрицы
     * @param weight ширина матрицы
     * @param e      чем заполнять
     * @return объект матрицы
     */
    public static Matrix createMatrix(int height, int weight, int e) {
        //TODO your code
        return null;
    }

    /**
     * Medium
     * <p>
     * Реализовать метод проверки на равенство матриц.
     * Вместо матрица может прийти другой объект!
     * Не забудьте, что ссылка на сравниваемый объкт может совпадать с
     * сылкой на текущий объект.
     *
     * @param o - объект для сравнения
     * @return true, если объекты совпадают, иначе false
     */
    @Override
    public boolean equals(Object o) {
        //TODO your code
        return false;
    }

    /**
     * Medium
     * <p>
     * Реализовать получение hashcode матрицы.
     *
     * @return значение типа int
     */
    @Override
    public int hashCode() {
        return -1; //TODO your code
    }
}

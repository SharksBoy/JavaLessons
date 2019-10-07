package com.handtruth.lessons.lesson2.task1;


class IfElse {

    /**
     * Trivial
     *
     * На вход два числа.
     * Если первое больше второго, вывести 1,
     * Если равны - 0,
     * Если второе больше первого - -1
     */
    int compare(int a, int b) {
        if (a == b)
            return (0);
        else
        if (a > b)
            return (1);
        else
            return (-1);
    }


    /**
     * Easy
     * <p>
     * Мой возраст. Для заданного 0 < n < 200, рассматриваемого как возраст человека,
     * вернуть строку вида: «21 год», «32 года», «12 лет».
     */
    String ageDescription(int age) {
        String slovo = "";
        if ( age % 10 == 1 && age /10 != 11)
            slovo = "год";
        else
            if (11 <= age % 100 && age % 100 <= 14 || 4 < age % 10)
                slovo = "лет";
            else
                slovo = "года";
        return (age +" "+ slovo);
    }

    /**
     * Easy
     * <p>
     * Треугольник задан длинами своих сторон a, b, c.
     * Проверить, является ли данный треугольник остроугольным (вернуть 0),
     * прямоугольным (вернуть 1) или тупоугольным (вернуть 2).
     * Если такой треугольник не существует, вернуть -1.
     */
    int triangleKind(double a, double b, double c) {
        // TODO your code
        return -1;
    }

    /**
     * Medium
     * <p>
     * Даны четыре точки на одной прямой: A, B, C и D.
     * Координаты точек a, b, c, d соответственно, b >= a, d >= c.
     * Найти длину пересечения отрезков AB и CD.
     * Если пересечения нет, вернуть -1.
     */

    int segmentLength(int a, int b, int c, int d) {
        // TODO your code
        return -1;
    }
}

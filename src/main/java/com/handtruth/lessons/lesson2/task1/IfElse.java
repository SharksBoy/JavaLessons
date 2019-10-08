package com.handtruth.lessons.lesson2.task1;


class IfElse {

    /**
     * Trivial
     *
     * На вход два числа.
     * Если первёёое больше второго, вывести 1,
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
        String word = "";
        if ( age % 10 == 1 && age /10 != 11)
            word = "год";
        else
            if (11 <= age % 100 && age % 100 <= 14 || 4 < age % 10)
                word = "лет";
            else
                word = "года";
        return (age +" "+ word);
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
    double cos_c = (Math.pow(a,2) + Math.pow(c,2) - Math.pow(b,2)) / (2 * a * c);
    double cos_a = (Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,2)) / (2 * a * b);
    double cos_b = (Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2)) / (2 * b * c);
    if (a + b <= c || b + c <= a || c + a <= b)
        return -1;
    else
        if (0 < cos_a && cos_a < 1 && 0 < cos_b && cos_b < 1 && 0 < cos_c && cos_c < 1)
            return 0;
        else
            if (cos_a == 0 || cos_b == 0 || cos_c ==0)
                return 1;
            else
                return 2;
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
        if (c > b && d > b || a > c && a > d)
            return -1;
        else
            if (a <= c && b >= d)
                return (d - c);
            else
                if (c <= a && d >= b)
                    return (b - a);
                else
                    if (a <= c)
                        return (b - c);
                    else
                        return (d - a);
    }
}

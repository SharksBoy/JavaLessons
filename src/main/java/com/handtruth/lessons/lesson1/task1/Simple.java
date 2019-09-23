package com.handtruth.lessons.lesson1.task1;

class Simple {

    /**
     * Trivial
     *
     * Вычислить дискриминант квадратного уравнения
     */
    double discriminant(double a, double b, double c) {
        double dis = Math.pow(b,2) - 4 * a * c;
        return dis;
    }

    /**
     * Trivial
     *
     * Поиск одного из корней квадратного уравнения
     */
    double sqRoot(double a, double b, double c) {
        double dis = Math.pow(b,2) - 4 * a * c;
        double x = (-b + Math.pow(dis, 0.5)) / 2 * a;
        return x;
    }

    /**
     * Trivial
     *
     * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
     * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
     */
    double seconds(int hours, int minutes, int seconds) {
        int v = hours * 3600 + minutes * 60 + seconds;
        return v;
    }

    /**
     * Easy
     * Пользователь задает целое трехзначное число (например, 478).
     * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
     */
    int numberRevert(int number) {
        StringBuilder _str = new StringBuilder();
        _str.append(number);
        _str.reverse();
        int s = Integer.parseInt(String.valueOf(_str));
        return s;
    }
}

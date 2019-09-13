package com.handtruth.lessons.lesson2.task2;

import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchTest {

    private static Switch switchClass;

    @BeforeAll
    static void setObjects() {
        switchClass = new Switch();
    }

    @Test
    @Tag("Trivial")
    void switchNumber() {
        assertEquals("Один", switchClass.switchNumber(1));
        assertEquals("Два", switchClass.switchNumber(2));
        assertEquals("Три", switchClass.switchNumber(3));
        assertEquals("Четыре", switchClass.switchNumber(4));
        assertEquals("Пять", switchClass.switchNumber(5));
        assertEquals("Шесть", switchClass.switchNumber(6));
        assertEquals("Семь", switchClass.switchNumber(7));
        assertEquals("Восемь", switchClass.switchNumber(8));
        assertEquals("Девять", switchClass.switchNumber(9));
        assertEquals("Десять", switchClass.switchNumber(10));

        Random rnd = new Random();
        int random = rnd.nextInt();
        while (random <= 10 && random >= 1 ) {
            random = rnd.nextInt();
        }
        assertEquals("Число не входит в разрешенный интервал", switchClass.switchNumber(random));

    }

    @Test
    @Tag("Trivial")
    void switchEnum() {
        assertEquals("Белый", switchClass.switchEnum(Switch.Color.White));
        assertEquals("Желтый", switchClass.switchEnum(Switch.Color.Yellow));
        assertEquals("Черный", switchClass.switchEnum(Switch.Color.Black));
    }
}
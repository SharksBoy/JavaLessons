package com.handtruth.lessons.lesson6.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomHashTableTest {
    private CustomHashTable<String, Integer> table;

    /**
     * Сотрите "//" и вставитье вместо <...> то, что необходимо
     */
    @BeforeEach
    void setUp() {
        // table = new <Имя вашей структуры>()
        table.put("111", 1);
        table.put("222", 1);
        table.put("333", 3);
        table.put("444", 4);
        table.put("355", 35);
        table.put("56", 5);
    }

    @Test
    @Tag("Trivial")
    void get() {
        assertEquals(Integer.valueOf(1), table.get("111"));
        assertEquals(Integer.valueOf(1), table.get("222"));
        assertEquals(Integer.valueOf(4), table.get("444"));
        assertEquals(Integer.valueOf(35), table.get("355"));
        assertNull(table.get("344"));
    }

    @Test
    @Tag("Trivial")
    void containsKey() {
        assertTrue(table.containsKey("111"));
        assertTrue(table.containsKey("222"));
        assertTrue(table.containsKey("333"));
        assertFalse(table.containsKey("1111"));
        assertFalse(table.containsKey("96789"));
    }

    @Test
    @Tag("Trivial")
    void containsValue() {
        assertTrue(table.containsValue(1));
        assertTrue(table.containsValue(4));
        assertTrue(table.containsValue(35));
        assertFalse(table.containsValue(-1));
        assertFalse(table.containsValue(11));
    }

    @Test
    @Tag("Medium")
    void put() {
        assertEquals(1, table.put("1", 1));
        assertEquals(2, table.put("2", 2));
        assertEquals(4, table.put("4", 4));
        assertEquals(5, table.put("5", 5));

        assertNull(table.put("1", 1));
        assertNull(table.put("4", 4));

        assertEquals(5, table.put("sdgfg", 5));
        assertEquals(5, table.put("sdgfgds", 5));
        assertEquals(5, table.put("sdgfgsdfsd", 5));
        assertEquals(5, table.put("fffffffffggh", 5));
        assertEquals(5, table.put("fffffffffgghsdfa;,f;lv,fd;lf,vfd;,bfd;,da;fd;", 5));
    }

    @Test
    @Tag("Medium")
    void remove() {
        assertEquals(1, table.remove("111"));
        assertNull(table.remove("7"));

    }

    @Test
    @Tag("Medium")
    void removeException() {
        assertThrows(IllegalArgumentException.class, () -> table.remove(456));
    }

    @Test
    @Tag("Trivial")
    void size() {
        assertEquals(6, table.size());
        table.put("34534534", 345345);
        assertEquals(7, table.size());
        table.remove("34534534");
        table.remove("111");
        assertEquals(5, table.size());
    }
}
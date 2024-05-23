package org.example.Tests;

import org.example.Main;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void testStringCount() {
        assertEquals(1, Main.stringCount("Hello", 'o'));
        assertEquals(2, Main.stringCount("Hello", 'l'));
        assertEquals(0, Main.stringCount("", 'z'));
    }

    @Test
    public void testReverseWords() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Main.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", Main.reverseWords("apple"));
        assertEquals("a b c d", Main.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", Main.reverseWords("double  spaced  words"));
    }

    //    @Test
    //    public void tests() {
    //        assertEquals(String.valueOf(250), Main.multiply(10), "For number = 10");
    //        assertEquals(String.valueOf(25000), Main.multiply(200), "For number = 200");
    //        assertEquals(String.valueOf(0), Main.multiply(0), "For number = 0");
    //        assertEquals(String.valueOf(-15), Main.multiply(-3), "For number = -3");
    //    }

    @Test
    public void tests() {
        assertEquals("67", Main.numberToString(67));
        assertEquals("123", Main.numberToString(123));
        assertEquals("999", Main.numberToString(999));
    }

    @Test
    public void setAlarmTest() {
        assertTrue("Should be true.", Main.setAlarm(true, false));
        assertFalse("Should be false.", Main.setAlarm(true, true));
        assertFalse("Should be false.", Main.setAlarm(false, false));
        assertFalse("Should be false.", Main.setAlarm(false, true));
    }


    @Test @DisplayName("A true hero")
    public void aTrueHero() {
        assertTrue("With 10 bullets and 5 dragons", Main.hero(10, 5));
        assertTrue("With 10g0 bullets and 40 dragons", Main.hero(100, 40));
    }

    @Test @DisplayName("A false hero")
    public void aFalseHero() {
        assertFalse("With 4 bullets and 5 dragons", Main.hero(4, 5));
        assertFalse("With 1500 bullets and 751 dragons", Main.hero(1500, 751));
        assertFalse("With 0 bullets and 1 dragon", Main.hero(0, 1));
        assertFalse("With 7 bullets and 4 dragons", Main.hero(7, 4));
    }

    @Test
    public void test1() {
        assertEquals("Hello, Mr. Spock",
                Main.sayHello("Mr. Spock"));
    }
    @Test
    public void test2() {
        assertEquals("Hello, Captain Kirk",
                Main.sayHello("Captain Kirk"));
    }
    @Test
    public void test3() {
        assertEquals("Hello, Liutenant Uhura",
                Main.sayHello("Liutenant Uhura"));
    }
    @Test
    public void test4() {
        assertEquals("Hello, Dr. McCoy",
                Main.sayHello("Dr. McCoy"));
    }

}

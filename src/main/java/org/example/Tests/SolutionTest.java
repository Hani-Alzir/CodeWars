package org.example.Tests;

import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

}

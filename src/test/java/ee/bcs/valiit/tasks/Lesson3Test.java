package ee.bcs.valiit.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lesson3Test {

    @Test
    void factorial() {
        assertEquals(120, Lesson3.factorial(5));
        assertEquals(1, Lesson3.factorial(1));
        assertEquals(5040, Lesson3.factorial(7));
    }

    @Test
    void reverseString() {
        assertEquals("eret", Lesson3.reverseString("tere"));
        assertEquals("eReT", Lesson3.reverseString("TeRe"));
        assertEquals("", Lesson3.reverseString(""));
        assertEquals("A", Lesson3.reverseString("A"));
    }

    @Test
    void isPrime() {
        assertTrue(Lesson3.isPrime(2));
        assertTrue(Lesson3.isPrime(937));
        assertFalse(Lesson3.isPrime(217));
        assertFalse(Lesson3.isPrime(1));
    }

    @Test
    void sort() {
        int[] x = new int[]{6, 2, 7, 3, 1};
        int[] expectedResult = new int[]{1, 2, 3, 6, 7};
        assertArrayEquals(expectedResult, Lesson3.sort(x));
        assertArrayEquals(new int[0], new int[0]);
        assertArrayEquals(new int[1], new int[1]);
    }

    @Test
    void evenFibonacci() {
        assertEquals(10, Lesson3.evenFibonacci(10));
        assertEquals(10, Lesson3.evenFibonacci(20));
        assertEquals(44, Lesson3.evenFibonacci(40));
    }

    @Test
    void morseCode() {
        assertEquals(".... . .-.. .-.. ---", Lesson3.morseCode("hello"));
        assertEquals("... --- ...", Lesson3.morseCode("sos"));
    }
}

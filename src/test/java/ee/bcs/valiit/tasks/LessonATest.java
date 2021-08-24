package ee.bcs.valiit.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LessonATest {

    @Test
    void e1() {
        assertEquals(-2, LessonA.e1(2));
        assertEquals(0, LessonA.e1(0));
        assertEquals(9, LessonA.e1(-9));
    }

    @Test
    void e2() {
        assertEquals(2, LessonA.e2(1, 3));
        assertEquals(0, LessonA.e2(-1, 1));
        assertEquals(10, LessonA.e2(0, 20));
    }

    @Test
    void e3() {
        assertEquals(-990, LessonA.e3(-5));
        assertEquals(-495, LessonA.e3(0));
        assertEquals(0, LessonA.e3(5));
    }

    @Test
    void e4() {
        assertEquals(41, LessonA.e4(1, 3, 2, 4, 5, 6));
        assertEquals(-12, LessonA.e4(-5, 9, 2, 18, 1, -3));
    }

    @Test
    void e5() {
        int answer = LessonA.e5();
        assertTrue(answer % 2 == 0);
        assertTrue(answer % 3 == 0);
        assertTrue(answer % 7 == 0);
        assertTrue(answer < 55);
    }

    @Test
    void e6() {
        assertEquals(true, LessonA.e6(1984));
        assertEquals(true, LessonA.e6(2000));
        assertEquals(false, LessonA.e6(1900));
        assertEquals(false, LessonA.e6(2021));
        assertEquals(true, LessonA.e6(2020));
    }

    @Test
    void e7() {
        assertTrue(LessonA.e7(false));
        assertFalse(LessonA.e7(true));
    }

    @Test
    void e8() {
        assertTrue(LessonA.e8(true, false));
        assertTrue(LessonA.e8(false, true));
        assertFalse(LessonA.e8(true, true));
        assertFalse(LessonA.e8(false, false));
    }

    @Test
    void e9() {
        assertTrue(LessonA.e9(true, false, false, false));
        assertTrue(LessonA.e9(false, true, false, false));
        assertFalse(LessonA.e9(true, true, true, true));
        assertFalse(LessonA.e9(false, false, false, false));
        assertTrue(LessonA.e9(true, true, true, false));
        assertTrue(LessonA.e9(false, true, true, true));
        assertFalse(LessonA.e9(true, true, false, false));
        assertFalse(LessonA.e9(false, false, true, true));
    }

    @Test
    void e10() {
        int[] a = new int[]{1, 4, 6, 2, 4, 1};
        int[] aAnswer = new int[]{2, 8, 12, 4, 8, 2};
        int[] b = new int[]{4, 3, 1, 53, 2, 55};
        int[] bAnswer = new int[]{8, 6, 2, 106, 4, 110};
        LessonA.e10(a);
        LessonA.e10(b);
        assertArrayEquals(aAnswer, a);
        assertArrayEquals(bAnswer, b);
    }

    @Test
    void e11() {
        int[] a = new int[]{1, 4, 6, 2, 4, 1};
        int[] aAnswer = new int[]{1, 0, 6, 2, 4, 1};
        int[] b = new int[]{4, 3, 1, 53, 2, 55};
        int[] bAnswer = new int[]{4, 0, 1, 53, 2, 55};
        LessonA.e11(a);
        LessonA.e11(b);
        assertArrayEquals(aAnswer, a);
        assertArrayEquals(bAnswer, b);
    }

    @Test
    void e12() {
        int[] a = new int[]{1, 4, 6, 2, 4, 1};
        int[] aAnswer = new int[]{4, 1, 6, 2, 4, 1};
        int[] b = new int[]{4, 3, 1, 53, 2, 55};
        int[] bAnswer = new int[]{3, 4, 1, 53, 2, 55};
        LessonA.e12(a);
        LessonA.e12(b);
        assertArrayEquals(aAnswer, a);
        assertArrayEquals(bAnswer, b);
    }

    @Test
    void e13() {
        int[] a = new int[]{1, 4, 6, 2, 4, 1, 5, 2, 7, 1, 8, 1};
        int[] aAnswer = new int[]{1, 1, 6, 2, 4, 1, 5, 2, 7, 1, 8, 1};
        int[] b = new int[]{4, 3, 1, 53, 2, 55};
        int[] bAnswer = new int[]{4, 4, 1, 53, 2, 55};
        LessonA.e13(a);
        LessonA.e13(b);
        assertArrayEquals(aAnswer, a);
        assertArrayEquals(bAnswer, b);
    }

    @Test
    void e14() {
        int[] a = new int[]{1, 4, 6, 2, 4, 1, 5, 2, 7, 1, 8, 1};
        int[] aAnswer = new int[]{1, 1, 6, 6, 4, 4, 5, 5, 7, 1, 8, 1};
        LessonA.e14(a);
        assertArrayEquals(aAnswer, a);
    }

    @Test
    void e15() {
        int[] a = new int[]{1, 4, 6, 2, 4, 1, 5, 2, 7, 1, 8, 1, 1};
        int[] aAnswer = new int[]{1, 1, 6, 6, 4, 4, 5, 5, 7, 7, 8, 8, 1};
        int[] b = new int[]{4, 3, 1, 53, 2, 55};
        int[] bAnswer = new int[]{4, 4, 1, 1, 2, 2};
        LessonA.e15(a);
        LessonA.e15(b);
        assertArrayEquals(aAnswer, a);
        assertArrayEquals(bAnswer, b);
    }
}
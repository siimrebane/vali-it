package ee.bcs.valiit.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Lesson2bTest {

    @Test
    void sampleArray() {
        Lesson2b lesson2b = new Lesson2b();
        int[] answer = lesson2b.sampleArray();
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, answer);
    }

    @Test
    void generateArray() {
        int[] answer1 = Lesson2b.generateArray(0);
        int[] expected1 = {};
        assertArrayEquals(expected1, answer1);
        int[] answer2 = Lesson2b.generateArray(6);
        int[] expected2 = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected2, answer2);
    }

    @Test
    void decreasingArray() {
        int[] answer1 = Lesson2b.decreasingArray(0);
        int[] expected1 = {0};
        assertArrayEquals(expected1, answer1);
        int[] answer2 = Lesson2b.decreasingArray(6);
        int[] expected2 = {6, 5, 4, 3, 2, 1, 0};
        assertArrayEquals(expected2, answer2);
        int[] answer3 = Lesson2b.decreasingArray(-4);
        int[] expected3 = {-4, -3, -2, -1, 0};
        assertArrayEquals(expected2, answer2);
    }

    @Test
    void yl3() {
        int[] answer1 = Lesson2b.decreasingArray(0);
        int[] expected1 = {};
        assertArrayEquals(expected1, answer1);
        int[] answer2 = Lesson2b.decreasingArray(6);
        int[] expected2 = {3, 3, 3, 3, 3, 3};
        assertArrayEquals(expected2, answer2);
    }
}

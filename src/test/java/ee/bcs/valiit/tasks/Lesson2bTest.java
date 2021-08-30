package ee.bcs.valiit.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson2bTest {

    @Test
    void reverseArray_evenElements() {
        int[] input = {1, 2, 3, 4};
        int[] expectedOutput = {4, 3, 2, 1};
        int[] output = Lesson2b.reverseArray(input);
        Assertions.assertArrayEquals(expectedOutput, output);
    }
    @Test
    void reverseArray_oddElements() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expectedOutput = {5, 4, 3, 2, 1};
        int[] output = Lesson2b.reverseArray(input);
        Assertions.assertArrayEquals(expectedOutput, output);
    }
    @Test
    void reverseArray_empty() {
        int[] input = new int[0];
        int[] output = Lesson2b.reverseArray(input);
        Assertions.assertArrayEquals(new int[0], output);
    }

    @Test
    void evenNumbers() {
        int[] expectedOutput = {2,4,6};
        Assertions.assertArrayEquals(expectedOutput, Lesson2b.evenNumbers(3));
        int[] expectedOutput2 = {2,4,6,8,10,12};
        Assertions.assertArrayEquals(expectedOutput2, Lesson2b.evenNumbers(6));
    }

    @Test
    void min() {
        int[] input = {2, 4, 5, -2, -1};
        Assertions.assertEquals(-2, Lesson2b.min(input));
    }

    @Test
    void max() {
        int[] input = {2, 4, 5, -2, -1};
        Assertions.assertEquals(5, Lesson2b.max(input));
    }

    @Test
    void sum() {
        int[] input = {2, 4, 5, -2, -1};
        Assertions.assertEquals(8, Lesson2b.sum(input));
    }

    @Test
    void multiplyTable() {
        // TODO
    }

    @Test
    void fibonacci() {
        Assertions.assertEquals(0, Lesson2b.fibonacci(0));
        Assertions.assertEquals(1, Lesson2b.fibonacci(1));
        Assertions.assertEquals(1, Lesson2b.fibonacci(2));
        Assertions.assertEquals(610, Lesson2b.fibonacci(15));
    }

    @Test
    void sequence3n() {
        Assertions.assertEquals(20, Lesson2b.sequence3n(1, 10));
        Assertions.assertEquals(125, Lesson2b.sequence3n(100, 200));
        Assertions.assertEquals(89, Lesson2b.sequence3n(201, 210));
        Assertions.assertEquals(174, Lesson2b.sequence3n(900, 1000));
    }
}

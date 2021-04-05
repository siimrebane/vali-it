package ee.bcs.java.demo.tasks.lesson1;

import ee.bcs.valiit.tasks.Lesson2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson2Test {

    @Test
    void reverseArray_standard() {
        int[] input = {1, 2, 3, 4};
        int[] expectedOutput = {4, 3, 2, 1};
        int[] output = Lesson2.reverseArray(input);
        Assertions.assertArrayEquals(expectedOutput, output);
    }
    @Test
    void reverseArray_empty() {
        int[] input = new int[0];
        int[] output = Lesson2.reverseArray(input);
        Assertions.assertArrayEquals(new int[0], output);
    }

    @Test
    void evenNumbers() {
        int[] expectedOutput = {2,4,6};
        Assertions.assertArrayEquals(expectedOutput, Lesson2.evenNumbers(3));
        int[] expectedOutput2 = {2,4,6,8,10,12};
        Assertions.assertArrayEquals(expectedOutput2, Lesson2.evenNumbers(6));
    }

    @Test
    void min() {
        int[] input = {2, 4, 5, -2, -1};
        Assertions.assertEquals(-2, Lesson2.min(input));
    }

    @Test
    void max() {
        int[] input = {2, 4, 5, -2, -1};
        Assertions.assertEquals(5, Lesson2.max(input));
    }

    @Test
    void sum() {
        int[] input = {2, 4, 5, -2, -1};
        Assertions.assertEquals(8, Lesson2.sum(input));
    }

    @Test
    void multiplyTable() {
        // TODO
    }

    @Test
    void fibonacci() {
        Assertions.assertEquals(0, Lesson2.fibonacci(0));
        Assertions.assertEquals(1, Lesson2.fibonacci(1));
        Assertions.assertEquals(1, Lesson2.fibonacci(2));
        Assertions.assertEquals(610, Lesson2.fibonacci(15));
    }

    @Test
    void sequence3n() {
        Assertions.assertEquals(20, Lesson2.sequence3n(1, 10));
        Assertions.assertEquals(125, Lesson2.sequence3n(100, 200));
        Assertions.assertEquals(89, Lesson2.sequence3n(201, 210));
        Assertions.assertEquals(174, Lesson2.sequence3n(900, 1000));
    }
}

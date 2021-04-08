package ee.bcs.valiit.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lesson2cTest {

    @Test
    void getSeqLength() {
        Assertions.assertEquals(1, Lesson2c.getSeqLength(1));
        Assertions.assertEquals(6, Lesson2c.getSeqLength(5));
        Assertions.assertEquals(4, Lesson2c.getSeqLength(3));
        Assertions.assertEquals(3, Lesson2c.getSeqLength(8));
    }

    @Test
    void nextElement() {
        Assertions.assertEquals(1, Lesson2c.nextElement(2));
        Assertions.assertEquals(10, Lesson2c.nextElement(3));
        Assertions.assertEquals(5, Lesson2c.nextElement(10));
    }

    @Test
    void sequence3n() {
        Assertions.assertEquals(20, Lesson2c.sequence3n(1, 10));
        Assertions.assertEquals(125, Lesson2c.sequence3n(100, 200));
        Assertions.assertEquals(89, Lesson2c.sequence3n(201, 210));
        Assertions.assertEquals(174, Lesson2c.sequence3n(900, 1000));
    }
}

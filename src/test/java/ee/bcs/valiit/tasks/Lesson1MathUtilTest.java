package ee.bcs.valiit.tasks;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lesson1MathUtilTest {

    @Test
    public void min_testWithPositieNumbers_returnsResult(){
        assertEquals(2, Lesson1MathUtil.min(2, 3));
        double a = 1.0;
        double b = 1.0;
        assertEquals(a, b, 0.000001);
    }
}

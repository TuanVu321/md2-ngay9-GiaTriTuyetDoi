import org.junit.jupiter.api.Test;
import org.omg.CORBA.INTERNAL;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void testFindAssolute() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAssolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAssolute2() {
        int number = 1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAssolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAssolute3() {
        int number = -1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAssolute(number);
        assertEquals(expected, result);
    }
}
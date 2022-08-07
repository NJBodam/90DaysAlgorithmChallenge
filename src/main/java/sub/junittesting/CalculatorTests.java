package sub.junittesting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTests {

    @Test
    void testMaxFirstArgGreaterThanSecondArg() {
        Calculator calculator = new Calculator();
        int result = calculator.maxOf(2, 1);
        int expected = 2;

        assertEquals(expected, result);
    }

    @Test
    void testMaxFirstArgLessThanSecondArg() {
        Calculator calculator = new Calculator();
        int result = calculator.maxOf(1, 2);
        int expected = 2;

        assertEquals(expected, result);
    }

    @Test
    void testMaxFirstArgEqualToSecondArg() {
        Calculator calculator = new Calculator();
        int result = calculator.maxOf(2, 2);
        int expected = 2;

        assertEquals(expected, result);
    }
}
package com.junit.q1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(8, calc.add(5, 3));
        assertNotEquals(10, calc.add(5, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calc.multiply(3, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        ArithmeticException ex = assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
        assertEquals("Division by zero not allowed", ex.getMessage());
    }
}

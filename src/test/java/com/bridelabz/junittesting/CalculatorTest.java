package com.bridelabz.junittesting;

import org.junit.jupiter.api.*;

// Test class to test calculator operations
public class CalculatorTest {
    // Attribute of Calculator
    private static Calculator calculator;
    // Constructor - to run before all test method
    @BeforeAll
    public static void setup() {
        // Attribute
        calculator = new Calculator();
    }

    // test method for addition
    @Test
    @DisplayName("Test Addition")
    public void testAdd() {
        Assertions.assertEquals(10, calculator.add(4, 6));

        Assertions.assertEquals(15, calculator.add(9, 6));

        System.out.println("Addition test performed successfully!!");
    }

    // test method for subtraction
    @Test
    @DisplayName("Test Subtraction")
    public void testSubtraction() {
        Assertions.assertEquals(5, calculator.subtract(7, 2));

        Assertions.assertEquals(10, calculator.subtract(5, 15));

        System.out.println("Subtraction test performed successfully!!");
    }

    // test method for multiplication
    @Test
    @DisplayName("Test Multiplication")
    public void testMultiplication() {
        Assertions.assertEquals(30, calculator.multiply(5, 6));

        Assertions.assertEquals(-25, calculator.multiply(5, -5));

        System.out.println("Multiplication test performed successfully!!");
    }

    // test method for division
    @Test
    @DisplayName("Test Division")
    public void testDivision() {
        Assertions.assertEquals(25, calculator.divide(125, 5));

        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10,0));

        System.out.println("Division test performed successfully!!");
    }
}

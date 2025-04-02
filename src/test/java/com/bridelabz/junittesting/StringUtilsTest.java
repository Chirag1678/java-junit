package com.bridelabz.junittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Test class to test string operations
public class StringUtilsTest {
    // Attribute of StringUtils
    private static StringUtils stringUtils;
    // Constructor - to run before all test method
    @BeforeAll
    public static void setup() {
        stringUtils = new StringUtils();
    }

    // test method for string reversal
    @Test
    @DisplayName("Test String Reversal")
    public void testReverse() {
        Assertions.assertEquals("!dlroW olleH", stringUtils.reverse("Hello World!"));

        Assertions.assertEquals("gnimmargorP avaJ", stringUtils.reverse("Java Programming"));

        System.out.println("String reversal test performed successfully!!");
    }

    // test method to check if a string is palindrome
    @Test
    @DisplayName("Test Palindrome String")
    public void testIsPalindrome() {
        Assertions.assertTrue(stringUtils.isPalindrome("level"));

        Assertions.assertTrue(stringUtils.isPalindrome("madam"));

        System.out.println("Palindrome String test performed successfully!!");
    }

    // test method for string conversion to uppercase
    @Test
    @DisplayName("Test String Conversion to UpperCase")
    public void testToUpperCase() {
        Assertions.assertEquals("HELLO WORLD!", stringUtils.toUpperCase("hello world!"));

        Assertions.assertEquals("JAVA PROGRAMMING", stringUtils.toUpperCase("java programming"));

        System.out.println("String conversion to uppercase test performed successfully!!");
    }
}

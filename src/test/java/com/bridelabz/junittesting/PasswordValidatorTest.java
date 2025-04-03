package com.bridelabz.junittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Test class to check password validity
public class PasswordValidatorTest {
    // Attribute of PasswordValidator
    private static PasswordValidator validator;
    // Constructor - to be called before all test methods
    @BeforeAll
    public static void setup() {
        validator = new PasswordValidator();
    }

    // test method to check if password is valid
    @Test
    @DisplayName("Test to check valid password")
    public void testIsValidPassword() {
        Assertions.assertTrue(validator.isValidPassword("Pass@1234"));
        System.out.println("Pass@1234 is Valid Password");

        Assertions.assertFalse(validator.isValidPassword("Pass@Pass"));
        System.out.println("Pass@Pass is not a Valid Password");
    }
}

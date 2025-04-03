package com.bridelabz.junittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Test class to perform user registration
public class UserRegistrationTest {
    // Attribute of UserRegistration
    private static UserRegistration registration;
    // Constructor - to be called before all test cases
    @BeforeAll
    public static void setup() {
        registration = new UserRegistration();
    }

    // method to test user registration
    @Test
    @DisplayName("Test to register user")
    public void shouldRegisterUser() {
        String username = "Chirag1708";
        String email = "chiraggarg@gmail.com";
        String password = "C@123456g";
        Assertions.assertEquals("User registered successfully!", registration.registerUser(username, email, password));
        System.out.println("User registered successfully!!");
    }

    // method to test invalid details  during registration
    @Test
    @DisplayName("Test to throw exception")
    public void shouldNotRegisterUser() {
        String username = "Chirag1708";
        String email = "chiraggarggmail.com";
        String password = "C@123456g";
        Assertions.assertThrows(IllegalArgumentException.class, () -> registration.registerUser(username, email, password));
        System.out.println("Error - Invalid values given: Values doesn't meet the validation criteria");
    }
}

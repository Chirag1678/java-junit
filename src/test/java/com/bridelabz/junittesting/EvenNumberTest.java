package com.bridelabz.junittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

// Test class to check if a number is even
public class EvenNumberTest {
    // method to check if a number is even or odd
    @ParameterizedTest
    @DisplayName("Is Number Even")
    @ValueSource(ints = {2, 4, 6, 7, 9})
    public void testIsEven(int num) {
        Assertions.assertEquals(0, num % 2, num + " is odd");
    }
}

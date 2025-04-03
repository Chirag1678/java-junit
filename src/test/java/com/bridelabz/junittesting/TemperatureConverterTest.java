package com.bridelabz.junittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Test class to test temperature conversion
public class TemperatureConverterTest {
    // Attribute of Temperature Converter
    private static TemperatureConverter converter;
    // Constructor - to be called before all test methods
    @BeforeAll
    public static void setup() {
        converter = new TemperatureConverter();
    }

    // test method to convert Celsius temperature to Fahrenheit
    @Test
    @DisplayName("Test method to convert Celsius to Fahrenheit")
    public void testCelsiusToFahrenheit() {
        double fahrenheit = converter.celsiusToFahrenheit(0);
        Assertions.assertEquals(32, fahrenheit);
        System.out.println("0 celsius is: " + fahrenheit + " fahrenheit");

        fahrenheit = converter.celsiusToFahrenheit(14.5);
        Assertions.assertEquals(58.1, fahrenheit);
        System.out.println("14.5 celsius is: " + fahrenheit + " fahrenheit");
    }

    // test method to convert Fahrenheit temperature to Celsius
    @Test
    @DisplayName("Test method to convert Fahrenheit to Celsius")
    public void testFahrenheitToCelsius() {
        double celsius = converter.fahrenheitToCelsius(32);
        Assertions.assertEquals(0, celsius);
        System.out.println("32 Fahrenheit is: " + celsius + " celsius");

        celsius = converter.fahrenheitToCelsius(55.78);
        Assertions.assertEquals(13.21, celsius);
        System.out.println("55.78 Fahrenheit is: " + celsius + " celsius");
    }
}

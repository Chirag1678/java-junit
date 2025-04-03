package com.bridelabz.junittesting;

// Class to convert temperature from Celsius to Fahrenheit and vice versa
public class TemperatureConverter {
    // method to convert temperature from Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        return Math.round(fahrenheit * 100.0) / 100.0;
    }

    // method to convert temperature from Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        return Math.round(celsius * 100.0) / 100.0;
    }
}

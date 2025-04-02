package com.bridelabz.junittesting;

// Class to do basic calculator operations
public class Calculator {
    // method to add two numbers
    public int add(int a, int b) {
        return a+b;
    }

    // method to subtract number 2  from 1
    public int subtract(int a, int b) {
        return (a>=b ? a-b : b-a);
    }

    // method to multiply two numbers
    public int multiply(int a, int b) {
        return a*b;
    }

    // method to divide two numbers
    public int divide(int a, int b) {
        return a/b;
    }
}

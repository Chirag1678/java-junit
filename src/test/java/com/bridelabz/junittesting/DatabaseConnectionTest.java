package com.bridelabz.junittesting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Test class to establish and disconnect database after each test
public class DatabaseConnectionTest {
    // method to establish connection before each test
    @BeforeEach
    @DisplayName("Establishing Connection")
    public void connect() {
        System.out.println("Connected to database!!");
    }

    // test method 1
    @Test
    @DisplayName("Test Method 1")
    public void test1() {
        System.out.println("Performing test 1");
    }

    // test method 2
    @Test
    @DisplayName("Test Method 2")
    public void test2() {
        System.out.println("Performing test 2");
    }

    // test method 3
    @Test
    @DisplayName("Test Method 3")
    public void test3() {
        System.out.println("Performing test 3");
    }

    // method to remove connection with database
    @AfterEach
    @DisplayName("Removing Connection")
    public void disconnect() {
        System.out.println("Disconnected from database!!\n");
    }
}

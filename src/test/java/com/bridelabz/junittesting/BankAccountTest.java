package com.bridelabz.junittesting;

import org.junit.jupiter.api.*;

// Test method to perform banking operations
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccountTest {
    // Attribute for BankAccount
    private static BankAccount account;
    private static double initialBalance = 0.0;
    // Constructor - to be called before all test cases
    @BeforeAll
    public static void setup() {
        account = new BankAccount(initialBalance);
    }

    // test method to add balance to bank account
    @Test
    @DisplayName("Test for balance addition")
    @Order(1)
    public void testDeposit() {
        Assertions.assertEquals(10000.50, account.deposit(10000.50));

        Assertions.assertEquals(-1, account.deposit(-10.00));
    }

    // test to withdraw from bank account
    @Test
    @DisplayName("Test for balance withdrawal")
    @Order(2)
    public void testWithdraw() {
        Assertions.assertEquals(5000.50, account.withdraw(5000));

        Assertions.assertEquals(-1, account.withdraw(6000));
    }

    // test method to get account balance
    @Test
    @DisplayName("Test to get account balance")
    @Order(3)
    public void testGetBalance() {
        Assertions.assertEquals(5000.5, account.getBalance());
    }
}

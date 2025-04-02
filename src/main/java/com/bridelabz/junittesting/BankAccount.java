package com.bridelabz.junittesting;

// Class to simulate a bank account
public class BankAccount {
    // Attributes
    private double balance;

    // Constructor
    BankAccount(double balance) {
        this.balance = balance;
    }

    // getter method for balance
    public double getBalance() {
        System.out.println("Current balance: " + balance);
        return balance;
    }

    // method to deposit to balance
    public double deposit(double amount) {
        if(amount<=0) {
            System.out.println("Invalid amount");
            return -1;
        }
        balance+=amount;
        System.out.println("Amount added successfully, New Balance: " + balance);
        return balance;
    }

    // method to withdraw balance
    public double withdraw(double amount) {
        if(amount<=0 || amount>balance) {
            System.out.println("Invalid amount");
            return -1;
        }
        balance-=amount;
        System.out.println("Balance updated, New Balance: " + balance);
        return balance;
    }
}

package org.example;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public double deposit(double amount, boolean branch) {
        return branch ? balance += amount : balance;
    }

    public double withdraw(double amount, boolean branch) throws IllegalArgumentException{
        if (amount > balance) {
            throw new IllegalArgumentException();
        }
        return branch ? balance -= amount: balance;
    }

    public double getBalance() {
        return balance;
    }
}

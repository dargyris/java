package com.example;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String fName;
    private String lName;
    private String address;
    private String phoneNumber;
    private String eMail;
    private List<Double> transactions;

    public Customer(String fName, String lName, String address, String phoneNumber, String eMail) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
        this.transactions = new ArrayList<>();
    }

    public Customer(String fName, String lName, String address) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public List<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Double> transactions) {
        this.transactions = transactions;
    }

    public int getTransactionIndex(double transaction) {
        if (!transactions.isEmpty()) {
            for (int i = 0; i < transactions.size(); i++) {
                if (transactions.get(i) == transaction) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean listTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found");
            return false;
        }

        System.out.println("\t*** Transactions ***");
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println((i + 1) + ". " + transactions.get(i));
        }
        return true;
    }

    public boolean newTransaction(double amount) {
        transactions.add(amount);   // Auto-boxing
        return true;
    }

    public boolean printBalance() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found");
            return false;
        }

        double balance = 0.;
        for (int i = 0; i < transactions.size(); i++) {
            balance += transactions.get(i);
        }
        System.out.println("Balance: " + balance);
        return true;
    }
}

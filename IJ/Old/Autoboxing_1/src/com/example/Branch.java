package com.example;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private String name;
    private List<Customer> customers;

    public Branch(String name) {
        this.name = name;
        // 
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean listCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers found");
            return false;
        }

        for (int i = 0; i < customers.size(); i++) {
            printCustomer(i);
        }
        return true;
    }

    public void printCustomer(int i) {
        System.out.println("Customer " + (i + 1) + ": " +
                customers.get(i).getfName() + " " +
                customers.get(i).getlName());
        System.out.println("Address: " + customers.get(i).getAddress());
        System.out.println("Phone No.: " + customers.get(i).getPhoneNumber());
        System.out.println("E-mail: " + customers.get(i).geteMail());
        System.out.println("Balance: " + customers.get(i).printBalance());
    }

    public int getCustomerIndex(Customer customer) {
        if (!customers.isEmpty()) {
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).getfName().equals(customer.getfName())
                        && customers.get(i).getlName().equals(customer.getlName())
                        && customers.get(i).getAddress().equals(customer.getAddress())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
        return true;
    }

    public boolean modifyCustomer(int oldCustomerIndex, Customer newCustomer) {
        customers.set(oldCustomerIndex, newCustomer);
        return true;
    }

    public boolean deleteCustomer(int customerIndex) {
        customers.remove(customerIndex);
        return true;
    }

    public boolean listTransactions(int customerIndex) {
        return customers.get(customerIndex).listTransactions();
    }

    public boolean newTransaction(int customerIndex, double amount) {
        return customers.get(customerIndex).newTransaction(amount);
    }

    public boolean printBalance(int customerIndex) {
        return customers.get(customerIndex).printBalance();
    }
}

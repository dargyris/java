package com.example;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Branch> branches;

    public Bank() {
        branches = new ArrayList<>();
    }

    public List<Branch> getBranches() {
        return branches;
    }

    // 
    public Branch getBranch(int branchIndex) {
        return branches.get(branchIndex);
    }

    public int getBranchIndex(String name) {
        if (!branches.isEmpty()) {
            for (int i = 0; i < branches.size(); i++) {
                if (branches.get(i).getName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;  // If branches is empty or name not found returns -1
    }

    public boolean addBranch(String name) {
        Branch newBranch = new Branch(name);
        branches.add(newBranch);
        return true;
    }

    public boolean modifyBranch(int existingBranchIndex, String newName) {
        Branch newBranch = new Branch(newName);
        branches.set(existingBranchIndex, newBranch);
        return true;
    }

    public boolean deleteBranch(int branchIndex) {
        branches.remove(branchIndex);
        return true;
    }

    public boolean listBranches() {
        if (branches.isEmpty()) {
            System.out.println("No branches found.");
            return false;
        }

        for (int i = 0; i < branches.size(); i++) {
            System.out.println(i + ". " + branches.get(i).getName());
        }
        return true;
    }

    public boolean listCustomers(int branchIndex) {
        return branches.get(branchIndex).listCustomers();
    }

    public boolean addCustomer(int branchIndex, Customer newCustomer) {
        return branches.get(branchIndex).addCustomer(newCustomer);
    }

    public boolean modifyCustomer(int branchIndex, int oldCustomerIndex, Customer newCustomer) {
        return branches.get(branchIndex).modifyCustomer(oldCustomerIndex, newCustomer);
    }

    public boolean deleteCustomer(int branchIndex, int customerIndex) {
        return branches.get(branchIndex).deleteCustomer(customerIndex);
    }

    public boolean printCustomer (int branchIndex, int customerIndex) {
        branches.get(branchIndex).printCustomer(customerIndex);
        return true;
    }

    public boolean listTransactions(int branchIndex, int customerIndex) {
        return branches.get(branchIndex).listTransactions(customerIndex);
    }

    public boolean newTransaction(int branchIndex, int customerIndex, double amount) {
        return branches.get(branchIndex).newTransaction(customerIndex, amount);
    }

    public boolean printBalance(int branchIndex, int customerIndex) {
        return branches.get(branchIndex).printBalance(customerIndex);
    }
}
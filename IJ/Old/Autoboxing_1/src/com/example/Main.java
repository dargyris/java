package com.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Bank bank = new Bank();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            choice = mainMenu();
            switch (choice) {
                case 0:
                    System.out.println("Goodbye!");
                    quit = true;
                    scanner.close();
                    break;
                case 1:
                    choice = customerManagementMenu();
                    if (choice < 0) {
                        quit = badInputQuit();
                        break;
                    }
                    customerManagement(choice);
                    break;
                case 2:
                    choice = branchManagementMenu();
                    if (choice < 0) {
                        quit = badInputQuit();
                        break;
                    }
                    branchManagement(choice);
                    break;
                default :
                    quit = badInputQuit();
                    break;

            }
        }
    }

    public static boolean badInputQuit() {
        System.out.println("Max number of tries reached.");
        System.out.println("Quitting...");
        scanner.close();
        return true;
    }

    public static void logo() {
        System.out.println("==============================================");
        System.out.println("\t########     ###    ##    ## ##    ##");
        System.out.println("\t##     ##   ## ##   ###   ## ##   ##");
        System.out.println("\t##     ##  ##   ##  ####  ## ##  ##");
        System.out.println("\t########  ##     ## ## ## ## #####");
        System.out.println("\t##     ## ######### ##  #### ##  ##");
        System.out.println("\t##     ## ##     ## ##   ### ##   ##");
        System.out.println("\t########  ##     ## ##    ## ##    ##");
        System.out.println("==============================================");
        System.out.println();
    }

    public static int mainMenu() {
        logo();
        final int[] CHOICES = {0, 1, 2};
        System.out.println("1. Customer Management");
        System.out.println("2. Branch Management");
        System.out.println();
        System.out.println("0. Quit Application");
        return handleInput(CHOICES);
    }

    public static int handleInput(int[] choices) {
        int answer = -1;
        boolean badInput = false;
        int triesLeft = 3;
        do {
            if (badInput) {
                triesLeft --;
                System.out.println("\tBad input. Please try again. "
                        + "(" + triesLeft + "/3)");
            }
            System.out.print("\t> ");
            try {
                answer = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                badInput = true;
                continue;
            }
            if (answer < choices[0] || answer > choices.length - 1) {
                badInput = true;
                answer = -1;
                continue;
            } else {
                break;
            }
        } while (badInput && triesLeft > 1);

        return answer;  // Returns appropriate choice for each menu
                        // Returns -1 if > 3 bad inputs were received.
    }

    public static int branchManagementMenu() {
        logo();
        final int[] CHOICES = {0, 1, 2, 3, 4};
        System.out.println("0. List Branches");
        System.out.println("1. Add Branch");
        System.out.println("2. Modify Branch");
        System.out.println("3. Delete Branch");
        System.out.println("4. Find Branch");
        return handleInput(CHOICES);
    }

    public static void branchManagement(int choice) {
        switch (choice) {
            case 0:
                listBranches();
                scanner.nextLine();
                break;
            case 1:
                if (addBranch()) {
                    System.out.println("Success");
                }
                scanner.nextLine();
                break;
            case 2:
                if (modifyBranch()) {
                    System.out.println("Success");;
                }
                scanner.nextLine();
                break;
            case 3:
                if (deleteBranch()) {
                    System.out.println("Success");
                }
                scanner.nextLine();
                break;
            case 4:
                findBranch();
                scanner.nextLine();
                break;
            default:
                System.out.println("Shouldn't be here...");
                break;
        }
    }

    public static boolean listBranches() {
        return bank.listBranches();
    }

    public static boolean addBranch() {
        System.out.print("Please enter Branch name\n\t> ");
        String branchName = scanner.nextLine();
        int branchIndex = bank.getBranchIndex(branchName);
        if (branchIndex >= 0) {
            System.out.println("Branch exists at index: " + branchIndex);
            return false;
        }
        return bank.addBranch(branchName);
    }

    public static boolean modifyBranch() {
        System.out.print("Please enter existing Branch name\n\t> ");
        String existingBranchName = scanner.nextLine();
        int existingBranchIndex = bank.getBranchIndex(existingBranchName);
        if (existingBranchIndex < 0) {
            System.out.println("Name does not exist.");
            return false;
        }
        System.out.print("Please enter new Branch name\n\t> ");
        String newBranchName = scanner.nextLine();
        int newBranchIndex = bank.getBranchIndex(newBranchName);
        if (newBranchIndex >= 0) {
            System.out.println("Entered new name exists.");
            return false;
        }
        return bank.modifyBranch(existingBranchIndex, newBranchName);
    }

    public static boolean deleteBranch() {
        System.out.print("Please enter Branch name\n\t> ");
        String branchName = scanner.nextLine();
        int branchIndex = bank.getBranchIndex(branchName);
        if (branchIndex < 0) {
            System.out.println("Branch does not exist.");
            return false;
        }
        return bank.deleteBranch(branchIndex);
    }

    public static boolean findBranch() {
        System.out.print("Please enter Branch name\n\t> ");
        String branchName = scanner.nextLine();
        int branchIndex = bank.getBranchIndex(branchName);
        if (branchIndex < 0) {
            System.out.println("Branch does not exist.");
            return false;
        } else {
            System.out.println("Branch exists at index: " + branchIndex);
            return true;
        }
    }

    public static int customerManagementMenu() {
        logo();
        final int[] CHOICES = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println("0. List Customers");
        System.out.println("1. Add Customer");
        System.out.println("2. Modify Customer");
        System.out.println("3. Delete Customer");
        System.out.println("4. Find Customer");
        System.out.println("5. List Transactions");
        System.out.println("6. New Transaction");
        System.out.println("7. Print Balance");
        return handleInput(CHOICES);
    }

    public static void customerManagement(int choice) {
        switch (choice) {
            case 0:
                listCustomers();
                scanner.nextLine();
                break;
            case 1:
                if (addCustomer()) {
                    System.out.println("Success");
                }
                scanner.nextLine();
                break;
            case 2:
                if (modifyCustomer()) {
                    System.out.println("Success");
                }
                scanner.nextLine();
                break;
            case 3:
                if (deleteCustomer()) {
                    System.out.println("Success");
                }
                scanner.nextLine();
                break;
            case 4:
                if (findCustomer()) {
                    System.out.println("Success");
                }
                scanner.nextLine();
                break;
            case 5:
                if (listTransactions()) {
                    System.out.println("Success");;
                }
                scanner.nextLine();
                break;
            case 6:
                if (newTransaction()) {
                    System.out.println("Success");
                }
                scanner.nextLine();
                break;
            case 7:
                printBalance();
                scanner.nextLine();
                break;
            default:
                System.out.println("Shouldn't be here...");
                break;
        }
    }

    public static boolean listCustomers() {
        System.out.print("Please enter Branch name\n\t> ");
        String branchName = scanner.nextLine();
        int branchIndex = bank.getBranchIndex(branchName);
        if (branchIndex < 0) {
            System.out.println("Branch does not exist.");
            return false;
        }
        return bank.listCustomers(branchIndex);
    }

    public static Customer createCustomer() {
        System.out.println("Please enter customer details");
        System.out.print("First Name\t> ");
        String fName = scanner.nextLine();
        System.out.print("Last Name\t> ");
        String lName = scanner.nextLine();
        System.out.print("Address\t> ");
        String address = scanner.nextLine();
        System.out.print("Phone Number\t> ");
        String phoneNumber = scanner.nextLine();
        System.out.print("E-mail\t> ");
        String eMail = scanner.nextLine();
        Customer newCustomer = new Customer(fName, lName, address, phoneNumber, eMail);
        return newCustomer;
    }

    public static boolean addCustomer() {
        System.out.print("Please enter Branch name: ");
        String branchName = scanner.nextLine();
        int branchIndex = bank.getBranchIndex(branchName);
        if (branchIndex < 0) {
            System.out.println("Branch " + branchName + " does not exist.");
            return false;
        }
        Customer newCustomer = createCustomer();
        int customerIndex = bank.getBranch(branchIndex).getCustomerIndex(newCustomer);
        if (customerIndex >= 0) {
            System.out.println("Can't add existing customer for branch " + branchName + ".");
            return false;
        }
        return bank.addCustomer(branchIndex, newCustomer);
    }

    public static Customer createShortCustomer() {
        System.out.println("Please enter customer details:");
        System.out.print("First name> ");
        String fName = scanner.nextLine();
        System.out.print("Last name> ");
        String lName = scanner.nextLine();
        System.out.print("Address> ");
        String address = scanner.nextLine();
        Customer newCustomer = new Customer(fName, lName, address);
        return newCustomer;
    }

    public static boolean modifyCustomer() {
        System.out.print("Please enter Branch name: ");
        String branchName = scanner.nextLine();
        int branchIndex = bank.getBranchIndex(branchName);
        if (branchIndex < 0) {
            System.out.println("Branch " + branchName + " does not exist.");
            return false;
        }
        Customer oldCustomer = createShortCustomer();
        int oldCustomerIndex = bank.getBranch(branchIndex).getCustomerIndex(oldCustomer);
        if (oldCustomerIndex < 0) {
            System.out.println("Can't modify non-existing customer for branch " + branchName);
            return false;
        }
        Customer newCustomer = createCustomer();
        int newCustomerIndex = bank.getBranch(branchIndex).getCustomerIndex(newCustomer);
        if (newCustomerIndex >= 0) {
            System.out.println("New customer already exists in branch " + branchName);
            return false;
        }
        return bank.modifyCustomer(branchIndex, oldCustomerIndex, newCustomer);
    }

    public static boolean deleteCustomer() {
        System.out.print("Please enter Branch name: ");
        String branchName = scanner.nextLine();
        int branchIndex = bank.getBranchIndex(branchName);
        if (branchIndex < 0) {
            System.out.println("Branch " + branchName + " does not exist.");
            return false;
        }
        Customer customer = createShortCustomer();
        int customerIndex = bank.getBranch(branchIndex).getCustomerIndex(customer);
        if (customerIndex < 0) {
            System.out.println("Can't delete non-existing customer for branch " + branchName);
            return false;
        }
        return bank.deleteCustomer(branchIndex, customerIndex);
    }

    public static boolean findCustomer() {
        System.out.print("Please enter Branch name: ");
        String branchName = scanner.nextLine();
        int branchIndex = bank.getBranchIndex(branchName);
        if (branchIndex < 0) {
            System.out.println("Branch " + branchName + " does not exist.");
            return false;
        }
        Customer customer = createShortCustomer();
        int customerIndex = bank.getBranch(branchIndex).getCustomerIndex(customer);
        if (customerIndex < 0) {
            System.out.println("Customer " + customer.getfName() + " " +
                    customer.getlName() + " " +
                    " was not found in branch " + branchName);
            return false;
        }
        System.out.println("Customer " + customer.getfName() + " " +
                customer.getlName() + " " +
                " was found in branch" + branchName + " :");
        return bank.printCustomer(branchIndex, customerIndex);
    }

    public static boolean listTransactions() {
        System.out.print("Please enter Branch name: ");
        String branchName = scanner.nextLine();
        int branchIndex = bank.getBranchIndex(branchName);
        if (branchIndex < 0) {
            System.out.println("Branch " + branchName + " does not exist.");
            return false;
        }
        Customer customer = createShortCustomer();
        int customerIndex = bank.getBranch(branchIndex).getCustomerIndex(customer);
        if (customerIndex < 0) {
            System.out.println("Couldn't find customer " +
                    customer.getfName() + " " +
                    customer.getlName() + " in branch "  +
                    branchName + ".");
            return false;
        }
        return bank.listTransactions(branchIndex, customerIndex);
    }

    public static boolean newTransaction() {
        System.out.print("Please enter Branch name: ");
        String branchName = scanner.nextLine();
        int branchIndex = bank.getBranchIndex(branchName);
        if (branchIndex < 0) {
            System.out.println("Branch " + branchName + " does not exist.");
            return false;
        }
        Customer customer = createShortCustomer();
        int customerIndex = bank.getBranch(branchIndex).getCustomerIndex(customer);
        if (customerIndex < 0) {
            System.out.println("Couldn't find customer " +
                    customer.getfName() + " " +
                    customer.getlName() + " in branch "  +
                    branchName + ".");
            return false;
        }
        System.out.println("Please enter amount: ");
        double amount = Integer.parseInt(scanner.nextLine());
        if (amount == 0.) {
            System.out.println("Can't make transaction with 0 amount.");
            return false;
        }
        return bank.newTransaction(branchIndex, customerIndex, amount);
    }

    public static boolean printBalance() {
        System.out.print("Please enter Branch name: ");
        String branchName = scanner.nextLine();
        int branchIndex = bank.getBranchIndex(branchName);
        if (branchIndex < 0) {
            System.out.println("Branch " + branchName + " does not exist.");
            return false;
        }
        Customer customer = createShortCustomer();
        int customerIndex = bank.getBranch(branchIndex).getCustomerIndex(customer);
        if (customerIndex < 0) {
            System.out.println("Couldn't find customer " +
                    customer.getfName() + " " +
                    customer.getlName() + " in branch "  +
                    branchName + ".");
            return false;
        }

        return bank.printBalance(branchIndex, customerIndex);
    }

}
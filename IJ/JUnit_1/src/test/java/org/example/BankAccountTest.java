package org.example;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {
    private static final String FIRST_NAME = "Diamantis";
    private static final String LAST_NAME = "Argyris";
    private static final double INIT_BALANCE = 10000.00;
    private static final double DEPOSITED_AMOUNT = 5000.00;
    private static final boolean WITH_BRANCH = true;
    private static final boolean WITHOUT_BRANCH = false;
    private static final double WITHDRAW_AMOUNT = 2000.00;
    private static final double WITHDRAW_ILLEGAL_AMOUNT = 15000.00;

    private BankAccount account;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("This executes once before any test cases.");
    }

    @Before
    public void setup() {
        System.out.println("This executes before each one test.");
        account = createAccount(FIRST_NAME, LAST_NAME, INIT_BALANCE);
    }

    private BankAccount createAccount(String firstName, String lastName, double balance) {
        return new BankAccount(firstName, lastName, balance);
    }

    @Test
    public void depositWithBranchReturnsBalancePlusDepositedAmount() {
        double actual = account.deposit(DEPOSITED_AMOUNT, WITH_BRANCH);
        double expected = INIT_BALANCE + DEPOSITED_AMOUNT;

        assertEquals(expected, actual, 0);
    }

    @Test
    public void depositWithoutBranchReturnsBalanceWithoutDepositedAmount() {
        double actual = account.deposit(DEPOSITED_AMOUNT, WITHOUT_BRANCH);
        double expected = INIT_BALANCE;

        assertEquals(expected, actual, 0);
    }

    @Test
    public void withdrawWithBranchReturnsBalanceMinusWithdrawAmount() {
        double actual = account.withdraw(WITHDRAW_AMOUNT, WITH_BRANCH);
        double expected = INIT_BALANCE - WITHDRAW_AMOUNT;

        assertEquals(expected, actual, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdrawWithBranchThrowsIllegalArgExcWhenBalanceLessThanWithdrawAmount() {
        double actual = account.withdraw(WITHDRAW_ILLEGAL_AMOUNT, WITH_BRANCH);
    }

    @Test
    public void withdrawWithoutBranchReturnsBalanceUnchanged() {
        double actual = account.withdraw(WITHDRAW_AMOUNT, WITHOUT_BRANCH);
        double expected = INIT_BALANCE;

        assertEquals(expected, actual, 0);
    }

    @Test
    public void getBalanceReturnsBalance() {
        double actual = account.getBalance();
        double expected = INIT_BALANCE;

        assertEquals(expected, actual, 0);
    }

    @After
    public void after() {
        System.out.println("This executes every time after each one test.");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("This executes once after all test cases.");
    }
}
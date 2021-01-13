package org.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountParameterizedTest {
    private static final String FIRST_NAME = "Diamantis";
    private static final String LAST_NAME = "Argyris";
    private static final double INIT_BALANCE = 10000.00;
    private static final boolean WITH_BRANCH = true;
    private static final double DEPOSITED_AMOUNT_1 = 1000.00;
    private static final double DEPOSITED_AMOUNT_2 = 2000.00;
    private static final double DEPOSITED_AMOUNT_3 = 3000.00;
    private static final double DEPOSITED_AMOUNT_4 = 4000.00;
    private static final double DEPOSITED_AMOUNT_5 = 5000.00;

    private BankAccount createAccount(String firstName, String lastName, double balance) {
        return new BankAccount(firstName, lastName, balance);
    }

    private BankAccount account;
    @Before
    public void setup() {
        System.out.println("This executes before each one test.");
        account = createAccount(FIRST_NAME, LAST_NAME, INIT_BALANCE);
    }

    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountParameterizedTest(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][] {
                {DEPOSITED_AMOUNT_1, WITH_BRANCH, INIT_BALANCE + DEPOSITED_AMOUNT_1},
                {DEPOSITED_AMOUNT_2, WITH_BRANCH, INIT_BALANCE + DEPOSITED_AMOUNT_2},
                {DEPOSITED_AMOUNT_3, WITH_BRANCH, INIT_BALANCE + DEPOSITED_AMOUNT_3},
                {DEPOSITED_AMOUNT_4, WITH_BRANCH, INIT_BALANCE + DEPOSITED_AMOUNT_4},
                {DEPOSITED_AMOUNT_5, WITH_BRANCH, INIT_BALANCE + DEPOSITED_AMOUNT_5}
        });
    }

    @Test
    public void depositWithBranchReturnsBalancePlusDepositedAmount() {
        double actual = account.deposit(amount, branch);

        assertEquals(expected, actual, 0);
    }

}

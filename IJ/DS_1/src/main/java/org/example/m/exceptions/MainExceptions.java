package org.example.m.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExceptions {
    public static void main(String[] args) {
        int x = getIntLBYL();
        System.out.println("x: " + x);
        int y = getIntEAFP();
        System.out.println("y: " + y);
    }

    private static int getIntLBYL() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        System.out.print("Please enter int: ");
        String input = scanner.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter int: ");
        String input = scanner.next();
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    private static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        }
        return 0;
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}

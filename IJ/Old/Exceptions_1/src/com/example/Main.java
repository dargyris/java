package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean quit = false;
        int x = 0;
        while (!quit) {
            try {
                x = getIntEafp();
            } catch (InputMismatchException e) {
                System.out.println("Bad input.");
                continue;
            }
            System.out.println("x is " + x);
            break;
        }

        int y = 0;
        while (!quit) {
            try {
                y = getIntEafp();
            } catch (InputMismatchException e) {
                System.out.println("Bad input.");
                continue;
            }
            System.out.println("y is " + y);
            break;
        }

        while (!quit) {
            double result = divisionEafp(x, y);
            System.out.println("Result: " + result);
            break;
        }
    }

    private static int getIntEafp() throws InputMismatchException {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        return s.nextInt();
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        while (true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                s.nextLine();
                System.out.println("Use only digits 0 - 9:");
            }
        }
    }

    private static double divisionEafp(int x, int y) {
        return (double)x / (double)y;
    }

//    private static int getIntLbyl() {
//        Scanner s = new Scanner(System.in);
//        boolean isValid = true;
//        System.out.print("Please enter an integer: ");
//        String input = s.next();
//        for (int i = 0; i < input.length(); i++) {
//            if (!Character.isDigit(input.charAt(i))) {
//                isValid = false;
//                break;
//            }
//        }
//        if(isValid) {
//            return Integer.parseInt(input);
//        }
//        return 0;
//    }

}

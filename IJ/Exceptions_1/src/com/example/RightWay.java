package com.example;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class RightWay {

    public static void main(String[] args) {
        try {
            System.out.println(divide());
        } catch(ArithmeticException | NoSuchElementException e) {   // Bitwise inclusive OR
            System.out.println(e.toString());
            System.out.println("Unable to perform division.");
        }
    }

    private static double divide() {
        int x, y;
        x = getInt();
        y = getInt();
        System.out.println("x is " + x + ", y is " + y);
        return x / y;
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

}

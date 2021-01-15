package org.example;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner scanner) {
        System.out.println("Please enter a number:");
        this.x = scanner.nextInt();
    }

    public void x() {
        for (int x = 0; x < 13; x++) {
            System.out.println(x + " x " + this.x + " = " + x * this.x);
        }
    }
}

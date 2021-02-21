package org.example.algos.recursion;

public class D_Fibonacci {
    public static void main(String[] args) {

    }

    public static void fibonacciIterative(int n) {
        int a = 0;
        int b = 1;
        while (a < n) {
            System.out.print(a + " ");
            int temp = b;
            b += a;
            a = temp;
        }
    }
}

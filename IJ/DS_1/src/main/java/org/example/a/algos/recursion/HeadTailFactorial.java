package org.example.a.algos.recursion;

public class HeadTailFactorial {
    public static void main(String[] args) {
        System.out.println("Factorial head: " + factorialHead(6));
        // The accumulator must have the sub result.
        System.out.println("Factorial tail: " + factorialTail(6, 1));
        System.out.println("Factorial while: " + factorialWhile(6));
    }

    public static int factorialHead(int n) {
        if (n <= 1) {
            return 1;
        }
        int result = factorialHead(n - 1);
        return n * result;
    }

    public static int factorialTail(int n, int accumulator) {
        if (n <= 1) {
            return accumulator;
        }
        return factorialTail(n - 1, accumulator * n);
    }

    public static int factorialWhile(int n) {
        int result = 1;
        while (n > 1) {
            result *= n;
            n--;
        }
        return result;
    }
}

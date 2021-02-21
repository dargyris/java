package org.example.a.algos.recursion;

public class HeadTailFibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci head: " + fibonacciHead(5));
        System.out.println("Fibonacci tail: " + fibonacciTail(5, 0, 1));
        System.out.print("Fibonacci iteration: ");
        fibonacciIteration(6);
    }

    public static int fibonacciHead(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int fib1 = fibonacciHead(n - 1);
        int fib2 = fibonacciHead(n - 2);
        return fib1 + fib2;
    }

    public static int fibonacciTail(int n, int accumulator1, int accumulator2) {
        if (n <= 0) {
            return accumulator1;
        }
        if (n == 1) {
            return accumulator2;
        }
        return fibonacciTail(n - 1, accumulator2, accumulator1 + accumulator2);
    }
    public static void fibonacciIteration(int n) {
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

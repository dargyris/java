package org.example;

public class Series {
    public static long nSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static long calcFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long calcFibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        long nMinus1 = 1;
        long nMinus2 = 0;
        long fibonacci = 0;
        for (int i = 1; i < n; i++) {
            fibonacci = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = fibonacci;
        }
        return fibonacci;
    }
}

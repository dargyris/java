package org.example.a.algos.recursion;

public class Sum {
    public static int sumPositiveNumbersToN(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        return sum;
    }

    public static int sumPositiveNumbersToNSmart(int n) {
        return n * (n + 1) / 2;
    }

    public static int sumPositiveNumbersToNRecursive(int n) {
        /*  Base case: n = 0 --> sum = 0;
        /   Intermediate:       n = 1 --> sum = 1 + 0;
        /                       n = 2 --> sum = 2 + 1 + 0;
        /                       n = 3 --> sum = 3 + 2 + 1 + 0;
        /   Extract Pattern:    n = 1 --> sum = 1 + sum(0);
        /                       n = 2 --> sum = 2 + sum(1);
        /                       n = 3 --> sum = 3 + sum(2);
        **/

        if (n == 0) {
            return 0;
        }
        return n + sumPositiveNumbersToNRecursive(n - 1);
    }

    /*   Recursion!
    /    1. Base Case: simple possible case. Requires explicit answer.
    /    2. Intermediate results / Visualisation of progressions.
    /    3. Find relationship between subsequent steps.
    /    4. Extract pattern
    /
    /    *. Turn the while to if. The counter becomes argument
    **/

    public static void main(String[] args) {
        System.out.println(sumPositiveNumbersToN(10));
        System.out.println(sumPositiveNumbersToNSmart(10));
        System.out.println(sumPositiveNumbersToNRecursive(10));
    }
}

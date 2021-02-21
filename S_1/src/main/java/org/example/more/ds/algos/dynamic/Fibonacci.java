package org.example.more.ds.algos.dynamic;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static int fibonacciRecursion(int n) {
        if (n <= 1) {
            return 1;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    // Top-down approach n -> 0
    public static int fibonacciMemoization(int n, Map<Integer, Integer> table) {
        if (!table.containsKey(n)) {
            table.put(n, fibonacciMemoization(n - 1, table) + fibonacciMemoization(n - 2, table));
        }
        return table.get(n);
    }

    // Bottom-up approach 0 -> n
    public static int fibonacciTabulation(int n, Map<Integer, Integer> table) {
        for (int i = 2; i <= n; i++) {
            table.put(i, table.get(i - 1) + table.get(i - 2));
        }
        return table.get(n);
    }

    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("FIBONACCI RECURSION"); // Exponential running time: 2^N
        System.out.println("5th: " + fibonacciRecursion(5));
        System.out.println("================================================");
        System.out.println("FIBONACCI MEMOIZATION"); // O(N)
        Map<Integer, Integer> fibonacciMap = new HashMap<>();
        fibonacciMap.put(0, 1);
        fibonacciMap.put(1, 1);
        System.out.println("5th: " + fibonacciMemoization(5, fibonacciMap));
        System.out.println("================================================");
        System.out.println("FIBONACCI TABULATION"); // O(N)
        System.out.println("5th: " + fibonacciTabulation(5, fibonacciMap));
        System.out.println("================================================");
    }
}

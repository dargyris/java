package org.example.a.algos.recursion;

import java.util.Stack;

public class Factorial {
    public static int factorialRecursion(int n) {
        // Base case!
        if (n == 0) {
            return 1;
        }

        return n * factorialRecursion(n - 1);
    }

    public static int factorialIteration(int n) {
        Stack<Integer> stack = new Stack<>();
        int result = 1;

        while (n >= 1) {
            stack.push(n--);
        }

        while (!stack.isEmpty()) {
            result *= stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 4: " + factorialRecursion(4));
        System.out.println("Factorial of 4: " + factorialIteration(4));
    }
}

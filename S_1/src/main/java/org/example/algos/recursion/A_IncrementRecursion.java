package org.example.algos.recursion;

public class A_IncrementRecursion {
    public static void main(String[] args) {
        System.out.print("Increment Iteration\t\t\t\t\t: ");
        incrementIteration(10);
        System.out.println("\n===============================================================");
        System.out.print("Increment Recursion Head\t\t\t: ");
        incrementRecursionHead(10);
        System.out.println("\n===============================================================");
        System.out.print("Increment Recursion Tail\t\t\t: ");
        incrementRecursionTail(10);
        System.out.println("\n===============================================================");
        System.out.print("Increment Recursion Tail Ascending\t: ");
        incrementRecursionTailAscending(0);
        System.out.println("\n===============================================================");
    }

    public static void incrementIteration(int n) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void incrementRecursionHead(int n) {
        if (n < 0) {
            return;
        }
        incrementRecursionHead(n - 1);
        System.out.print(n + " ");
    }

    public static void incrementRecursionTail(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " ");
        incrementRecursionTail(n - 1);
    }

    public static void incrementRecursionTailAscending(int n) {
        if (n > 10) {
            return;
        }
        System.out.print(n + " ");
        incrementRecursionTailAscending(n + 1);
    }
}

package org.example.a.algos.recursion;

public class HeadTail {
    public static void main(String[] args) {
        System.out.println("Head: ");
        head(5);
        System.out.println("=====================================");
        System.out.println("Tail: ");
        tail(5);
    }

    public static void head(int n) { // Pending operations AFTER the recursive call
        System.out.println("Call n: " + n);
        if (n == 0) {
            // At the backtrack phase, the functions need to print the final message and then return.
            return;
        }
        head(n-1);
        System.out.println("n: " + n);
    }

    public static void tail(int n) { // NO pending operations after the recursive call.
        System.out.println("Call n: " + n);
        if (n == 0) {
            // At the backtrack phase, the function calls just return the flow of control.
            return;
        }
        System.out.println("n: " + n);
        tail(n - 1);
    }
}

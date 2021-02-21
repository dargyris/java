package org.example.a.algos.recursion;

/*   Recursion!
/    1. Base Case: simple possible case. Requires explicit answer.
/    2. Intermediate results / Visualisation of progressions.
/    3. Find relationship between subsequent steps.
/    4. Extract pattern
/
/    *. Turn the while to if. The counter becomes argument
/   **. Recursive Leap of Faith: 5 + sum(4)
/
/     > Head recursion: STACK OVERFLOW. Transform to tail recursion.
**/

public class Recursion {
    public static void main(String[] args) {
        int number = 6;
        System.out.println("Sum of " + number + "\t\t: " + sum(number));
        System.out.println("Factorial head of " + number + "\t: " + factorial(number));
        System.out.println("Factorial tail of " + number + "\t: " + factorialAccumulator(number, 1));
        System.out.println("Fibonacci of " + number + "\t: " + fibonacci(number));
        System.out.println("===================================================");
        System.out.println("Matrix paths for 3x3 matrix: " + matrixPaths(3, 3));
        System.out.println("===================================================");
        System.out.print("Tail: ");
        tail(10);
        System.out.print("\nHead: ");
        head(10);
        System.out.println();
    }

    public static int matrixPaths(int n, int m) {
        /*  Unique paths from top left to botton right.
        /   only 1 element at a time down or right.
        /   BASE CASE: Either dimension = 1 --> result = 1.
        /   https://www.youtube.com/watch?v=ngCos392W4w
        **/
        if (m == 1 || n == 1) {
            return 1;
        }
        return matrixPaths(n, m - 1) + matrixPaths(n - 1, m);
    }

    public static int fibonacci(int n) {
        if (n < 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int factorialAccumulator(int n, int result) {
        if (n <= 0) {
            return result;
        }
        return factorialAccumulator(n - 1, n * result);
    }

    // Essentially: n + sum(n-1) --> STARTING_ARGUMENT + [ n-1 + n-2 + n-3 + ... ] + BASE_CASE
    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void tail(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " | ");
        tail(n - 1);
    }

    public static void head(int n) {
        if (n < 0) {
            return;
        }
        head(n - 1);
        System.out.print(n + " | ");
    }

}

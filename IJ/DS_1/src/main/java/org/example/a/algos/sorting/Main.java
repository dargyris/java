package org.example.a.algos.sorting;

/*  Puts elements of an array in a certain order
/   Numbers -> Numerical ordering. Strings, chars -> alphabetical ordering
/   Comparison based (bubble sort, insertion, selection, merge, quicksort) / Non-comparison based (radix, bucket)
/   Time Complexity / In place / Recursive / Stable
**/

/*  Merge / Quick sort
/   Can have recursive implementations.
/   Divide and conquer approach
**/

/*  Adaptive Sorting Algos
/   Adaptive algos change their behavior based on info available at runtime!
/   Takes advantage of existing order to improve O(NlogN) to O(N)
**/

public class Main {
    public static void main(String[] args) {
        bogoSort();
        sleepSort();
        bubbleSort();
        selectionSort();
        insertionSort();
        shellSort();
    }

    public static void bogoSort() {
        System.out.println("1. BOGO SORT");
        System.out.println("Bogo sort (Aka permutation sort or shotgun sort):");
        System.out.println("O(n+1)! time complexity.");
        System.out.println("1. Deterministic version");
        System.out.println("2. Randomized version");
        System.out.println("Logic: Very ineffective. Keeps generating permutations of its input until it finds one that is sorted.");
        System.out.println("Very efficient for Quantum computing.");
        System.out.println("=================================================================\n");
    }

    public static void sleepSort() {
        System.out.println("2. SLEEP SORT");
        System.out.println("Sleep sort can only be used for numbers. Not for chars or strings.");
        System.out.println("Logic: Assignes a distinct thread to every single number.");
        System.out.println("Each thread sleeps for the time of the number contained in each bucket.");
        System.out.println("=================================================================\n");
    }

    public static void bubbleSort() {
        System.out.println("3. BUBBLE SORT");
        System.out.println("In-place, O(N^2), stable.");
        System.out.println("For graphics, for \"Almost sorted arrays\", provide fixes at O(N).");
        System.out.println("=================================================================\n");
    }

    public static void selectionSort() {
        System.out.println("4. SELECTION SORT");
        System.out.println("In-place, O(N^2), unstable");
        System.out.println("Used when memory is limited.");
        System.out.println("Recursive sorting algos switch to insertion or selection sort for small subarrays.");
        System.out.println("Logic: Uses Index to SELECT the index of largest item and swaps once.");
        System.out.println("=================================================================\n");
    }

    public static void insertionSort() {
        System.out.println("5. INSERTION SORT - Requires more writes than selection.");
        System.out.println("In-place, O(N^2), stable.");
        System.out.println("Adaptive, on-line: sorts real-time");
        System.out.println("Recursive sorting algos switch to insertion or selection sort for small subarrays.");
        System.out.println("Merge and quick sort switch to insertion for small sub-arrays (10 - 20 items).");
        System.out.println("Logic: INSERTS item in sorted part of the array. For almost sorted arrays very efficient.");
        System.out.println("When I (human) am looking for insertion of a number in an array, I use divide and conquer at the sorted array part.");
        System.out.println("=================================================================\n");
    }

    public static void shellSort() {
        System.out.println("6. SHELL SORT - Insertion sort variant");
        System.out.println("In-place, O(N^2), unstable.");
        System.out.println("Adaptive (relies on insertion)");
        System.out.println("Logic: Uses a decreasing gap.");
        System.out.println("The elements are checked one-by-one only once at the last iteration.");
        System.out.println("h-sorted arrays: When every h-th element is sorted.");
    }
}

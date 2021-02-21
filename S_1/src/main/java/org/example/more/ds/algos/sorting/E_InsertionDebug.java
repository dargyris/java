package org.example.more.ds.algos.sorting;

/*  INSERTION SORT
> Requires more writes than selection.
Recursive sorting algos switch to insertion or selection sort for small subarrays.
Merge and Quicksort switch to insertion for small sub-arrays. (10-20 items).
When I (human) am looking for insertion of a number in an array I use divide and conquer at the sorted array part
to find its correct placement position.
> In-place, O(N^2), stable. Adaptive. Online: sorts real-time.
> Inserts item in its rightful place in the sorted part of the array. For almost sorted arrays very efficient.
 */

import java.util.Arrays;

public class E_InsertionDebug {
    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 0, -10, -5, 10, 100};
        insertionSort(nums.clone());
        insertionSortTesting(nums.clone());
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void insertionSort(int[] nums) {
        System.out.println("INSERTION SORT");
        System.out.println("Array: " + Arrays.toString(nums) + "\n");
        int iterations = 0;
        for (int i = 1; i < nums.length; i++) {
            System.out.println("for: " + Arrays.toString(nums));
            int j = i;
            boolean iterationLatch = false;
            iterations++;
            while (j > 0 && nums[j - 1] < nums[j]) {
                iterationLatch = true;
                swap(nums, j - 1, j);
                --j;
                System.out.println("\twhile: " + Arrays.toString(nums));
                iterations++;
            }
            if (iterationLatch) {
                iterations--;
            }
        }
        System.out.println("Sorted: " + Arrays.toString(nums));
        System.out.println("Iterations: " + iterations);
        System.out.println("=====================================================");
    }

    public static void insertionSortTesting(int[] nums) {
        System.out.println("INSERTION SORT TESTING");
        System.out.println("Array: " + Arrays.toString(nums));
        int iterations = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i;
            while (j >= 0 && nums[j] < nums[j + 1]) {
                swap(nums, j, j + 1);
                --j;
                iterations++;
            }
        }
        System.out.println("Sorted: " + Arrays.toString(nums));
        System.out.println("Iterations: " + iterations);
        System.out.println("=====================================================");
    }
}

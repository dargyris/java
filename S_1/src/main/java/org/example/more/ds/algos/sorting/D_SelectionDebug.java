package org.example.more.ds.algos.sorting;

/*  SELECTION SORT
> Used when memory is limited, or to limit write events.
Recursive sorting algos switch to insertion or selection sort for small subarrays.
> In-place, O(N^2), unstable
> Selects the index of the largest item in the unsorted partition and only swaps once to put it in place.
 */

import java.util.Arrays;

public class D_SelectionDebug {
    public static void main(String[] args) {
        int[] nums = {3, 6, 0, -5, 5, 7, 2, 1};

        selectionSort(nums.clone());
        selectionSortWithoutIndex(nums.clone());
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void selectionSort(int[] nums) {
        System.out.println("SELECTION SORT");
        System.out.println("Array: " + Arrays.toString(nums));
        int iterations = 0;
        int writes = 0;
        for (int i = 0; i < nums.length; i++) {
            int index = i;
            for (int j = i + 1; j < nums.length; j++) {
                iterations++;
                if (nums[j] > nums[index]) {
                    index = j;
                }
            }
            if (index != i) {
                swap(nums, i, index);
                writes++;
            }
        }
        System.out.println("Sorted: " + Arrays.toString(nums));
        System.out.println("Iterations: " + iterations + "\tWrites: " + writes);
        System.out.println("===================================================================");
    }

    public static void selectionSortWithoutIndex(int[] nums) {
        System.out.println("SELECTION SORT WITHOUT INDEX");
        System.out.println("Array: " + Arrays.toString(nums));
        int iterations = 0;
        int writes = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                iterations++;
                if (nums[j] > nums[i]) {
                    swap(nums, i, j);
                    writes++;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(nums));
        System.out.println("Iterations: " + iterations + "\tWrites: " + writes);
        System.out.println("===================================================================");
    }
}

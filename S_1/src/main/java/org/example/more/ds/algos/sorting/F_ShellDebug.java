package org.example.more.ds.algos.sorting;

/*  SHELL SORT
> Insertion sort variant.
h-sorted arrays: when every h-th element is sorted, shell sort is ideal.
> In-place, O(N^2), unstable, adaptive (relies on insertion)
> Uses a decreasing gap. Elements are checked one-by-one only once at the last iteration.
 */

import java.util.Arrays;

public class F_ShellDebug {
    public static void main(String[] args) {
        int nums[] = {-1, 0, 3, 6, 2, 1, 0, 5, 6, 7, 8, -50, 100};
        shellSort(nums.clone());
        insertionSort(nums.clone());
        shellSortTest(nums.clone());
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void shellSort(int[] nums) {
        System.out.println("SHELL SORT");
        System.out.println("Array: " + Arrays.toString(nums));
        int iterations = 0;
        for (int gap = nums.length / 2; gap > 0; gap /= 2) {
            System.out.println("1st for: " + Arrays.toString(nums) + "\tgap: " + gap);
            for (int i = gap; i < nums.length; i++) {
                iterations++;
                System.out.println("\t2nd for: " + Arrays.toString(nums));
                int j = i;
                boolean iterationLatch = false;
                while ((j >= gap) && nums[j - gap] < nums[j]) {
                    iterationLatch = true;
                    swap(nums, j, j - gap);
                    j = j - gap;
                    iterations++;
                    System.out.println("\t\tWhile: " + Arrays.toString(nums));
                }
                if (iterationLatch) {
                    iterations--;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(nums));
        System.out.println("Iterations: " + iterations);
        System.out.println("====================================================");
    }

    public static void insertionSort(int[] nums) {
        System.out.println("INSERTION SORT");
        System.out.println("Array: " + Arrays.toString(nums));
        int iterations = 0;
        for (int i = 1; i < nums.length; i++) {
            iterations++;
            boolean iterationLatch = false;
            int j = i;
            while (j > 0 && nums[j - 1] < nums[j]) {
                iterationLatch = true;
                swap(nums, j - 1, j);
                --j;
                iterations++;
            }
            if (iterationLatch) {
                iterations--;
            }
        }
        System.out.println("Sorted: " + Arrays.toString(nums));
        System.out.println("Iterations: " + iterations);
        System.out.println("====================================================");
    }

    public static void shellSortTest(int[] nums) {
        System.out.println("SHELL SORT TEST");
        System.out.println("Array: " + Arrays.toString(nums));
        int iterations = 0;
        for (int gap = nums.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < nums.length; i++) {
                iterations++;
                boolean iterationLatch = false;
                while ((i >= gap) && nums[i - gap] < nums[i]) {
                    iterationLatch = true;
                    swap(nums, i, i - gap);
                    i=i-gap;
                    iterations++;
                }
                if (iterationLatch) {
                    iterations--;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(nums));
        System.out.println("Iterations: " + iterations);
        System.out.println("====================================================");
    }
}

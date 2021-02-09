package org.example.a.algos.sorting;

import java.util.Arrays;

public class Shell {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 6, 2, 1, 0, 5, 6, 7, 8, -50, 100};
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
            for (int i = gap; i < nums.length; i++) {
                int j = i;
                while ((j >= gap) && nums[j - gap] < nums[j]) {
                    swap(nums, j, j - gap);
                    j = j - gap;
                    iterations++;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(nums));
        System.out.println("Iterations: " + iterations);
        System.out.println("================================================\n");
    }

    public static void insertionSort(int[] nums) {
        System.out.println("INSERTION SORT");
        System.out.println("Array: " + Arrays.toString(nums));
        int iterations = 0;
        for (int i = 1; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] < nums[j]) {
                swap(nums, j - 1, j);
                --j;
                iterations++;
            }
        }
        System.out.println("Sorted: " + Arrays.toString(nums));
        System.out.println("Iterations: " + iterations);
        System.out.println("================================================\n");
    }

    public static void shellSortTest(int[] nums) {
        System.out.println("SHELL SORT TEST");
        System.out.println("Array: " + Arrays.toString(nums));
        int iterations = 0;
        for (int gap = nums.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < nums.length; i++) {
                while ((i >= gap) && nums[i - gap] < nums[i]) {
                    swap(nums, i, i - gap);
                    i = i - gap;
                    iterations++;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(nums));
        System.out.println("Iterations: " + iterations);
        System.out.println("================================================\n");
    }
}

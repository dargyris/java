package org.example.a.algos.sorting;

import java.util.Arrays;

public class Insertion {
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
        System.out.println("Insertion Sort");
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
        System.out.println("=====================================================\n");
    }

    public static void insertionSortTesting(int[] nums) {
        System.out.println("Insertion Sort Testing...");
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
        System.out.println("=====================================================\n");
    }
}

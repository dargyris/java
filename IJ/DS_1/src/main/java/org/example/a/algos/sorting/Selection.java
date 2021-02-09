package org.example.a.algos.sorting;


import java.util.Arrays;

public class Selection {
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
        System.out.println("Selection sort");
        System.out.println("Array: " + Arrays.toString(nums));
        int iterations = 0;
        int writes = 0;
        for (int i = 0; i < nums.length - 1; i++) {
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
        System.out.print("===========================================\n");
    }

    public static void selectionSortWithoutIndex(int[] nums) {
        System.out.println("Selection sort without index!");
        System.out.println("Array: " + Arrays.toString(nums));
        int counter = 0;
        int writes = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                counter++;
                if (nums[j] > nums[i]) {
                    swap(nums, i, j);
                    writes++;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(nums));
        System.out.println("Iterations: " + counter + "\tWrites: " + writes);
        System.out.print("===========================================\n");
    }
}
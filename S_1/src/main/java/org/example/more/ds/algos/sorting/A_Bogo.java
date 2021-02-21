package org.example.more.ds.algos.sorting;

import java.util.Arrays;

public class A_Bogo {
    public static void main(String[] args) {
        int[] nums = {12, -4, 56, 0, 3, 8, 2, 1};
        bogoSortAscending(nums.clone());
        bogoSortDescending(nums.clone());
    }

    public static void bogoSortAscending(int[] nums) {
        int iterations = 0;
        while (!isSortedAscending(nums)) {
            iterations++;
            fisherYates(nums);
//            System.out.println(Arrays.toString(nums));
        }
        System.out.println("Ascending array: " + Arrays.toString(nums));
        System.out.println("Sorted in " + iterations + " iterations.");
    }

    public static boolean isSortedAscending(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void fisherYates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = (int) (Math.random() * i);
            swap(nums, i, j);
        }
    }

    public static void bogoSortDescending(int[] nums) {
        int iterations = 0;
        while (!isSortedDescending(nums)) {
            iterations++;
            fisherYates(nums);
//            System.out.println(Arrays.toString(nums));
        }
        System.out.println("Descending array: " + Arrays.toString(nums));
        System.out.println("Sorted in " + iterations + " iterations.");    }

    public static boolean isSortedDescending(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
package org.example.a.algos.sorting;

public class Bogo {

    public static void main(String[] args) {
        int[] nums = {12, -4, 56, 0, 3, 8, 2, 1};
        int counter = 0;
        while (!isSorted(nums)) {
            ++counter;
            shuffle(nums);
            printArray(nums);
        }
        System.out.println("\nSolved in " + counter + " steps.");
    }

    public static void shuffle(int[] nums) {
        // Fisher - Yates algo to shuffle the elements of the array
        for (int i = nums.length - 1; i >= 0; --i) {
            int j = (int) (Math.random() * i);
            swap(nums, i, j);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] nums) {
        System.out.print("{ ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.print("}\t\t");
    }
}

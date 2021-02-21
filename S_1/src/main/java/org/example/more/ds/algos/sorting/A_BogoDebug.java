package org.example.more.ds.algos.sorting;

import java.util.Arrays;

/*  BOGO SORT
> Bogo sort - aka permutation sort or shotgun sort. Deterministic version / Randomized version
> O(n+1)! time complexity, in-place. Very inefficient. But, efficient for Quantum computing.
All permutations are checked in one cycle.
> Keeps generating permutations until it finds one that is sorted.
 */

public class A_BogoDebug {
    public static void main(String[] args) {
        int[] nums = {12, -4, 56, 0, 3, 8, 2, 1};
        bogoSort(nums);
    }

    public static void bogoSort(int[] nums) {
        int counter = 0;
        while (!isSorted(nums)) {
            ++counter;
            shuffle(nums);
            printArray(nums);
        }
        System.out.println("\nSolved in " + counter + " steps.");
    }

    //Fisher - Yates shuffling algo
    public static void shuffle(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
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
        System.out.println(Arrays.toString(nums));
    }
}

package org.example.more.ds.algos.sorting;

import java.util.Arrays;

/*  BUBBLE SORT
> In-place, O(N^2), stable
> For graphics, for "Almost sorted arrays", privides fixes at O(N).
 */

public class C_BubbleDebug {
    public static void main(String[] args) {
        int[] nums = {12, 8, -5, 88, -77, 102};
        bubbleSort(nums.clone());
        bubbleSortDiamantis(nums.clone());
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void bubbleSort(int[] nums) {
        System.out.println("Bubble sort");
        System.out.println("Array: " + Arrays.toString(nums) + "\n");
        int iterations = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                iterations++;
                if (nums[j] < nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
                System.out.println("\tj_pass: " + j + " -> " + Arrays.toString(nums));
            }
            System.out.println("i_pass: " + i + " -> " + Arrays.toString(nums));
        }
        System.out.println("Sorted: " + Arrays.toString(nums));
        System.out.println("Iterations: " + iterations);
        System.out.println("=================================================================");
    }

    public static void bubbleSortDiamantis(int[] nums) {
        System.out.println("MY bubble sort");
        System.out.println("Array: " + Arrays.toString(nums));
        int iterations = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                iterations++;
                if (nums[i] < nums[j]) {
                    swap(nums, i, j);
                }
                System.out.println("\tj_pass: " + j + " -> " + Arrays.toString(nums));
            }
            System.out.println("i_pass: " + i + " -> " + Arrays.toString(nums));
        }
        System.out.println("Sorted: " + Arrays.toString(nums));
        System.out.println("Iterations: " + iterations);
        System.out.println("=================================================================");
    }
}

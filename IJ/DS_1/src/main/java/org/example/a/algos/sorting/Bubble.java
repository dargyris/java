package org.example.a.algos.sorting;

/*  Bubble Sort
/   O(N^2)
/   Graphics fix almost sorted arrays at O(N)
**/

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] nums = {12, 7, -5, -77, 102};
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
        System.out.print("Array: " + Arrays.toString(nums) + "\n");
        int iterations = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                iterations++;
                if (nums[j] < nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
        System.out.print("Sorted: " + Arrays.toString(nums) + "\n");
        System.out.println("Iterations: " + iterations);
        System.out.print("=========================================\n");
    }

    public static void bubbleSortDiamantis(int[] nums) {
        System.out.println("MY bubble sort...");
        System.out.print("Array: " + Arrays.toString(nums) + "\n");
        int iterations = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                iterations++;
                if (nums[i] < nums[j]) {
                    swap(nums, i, j);
                }
            }
        }
        System.out.print("Sorted: " + Arrays.toString(nums) + "\n");
        System.out.println("Iterations: " + iterations);
        System.out.print("=========================================\n");
    }
}

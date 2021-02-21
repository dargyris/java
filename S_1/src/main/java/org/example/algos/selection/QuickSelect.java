package org.example.algos.selection;

/*Quickselect: Tony Hoare: k-th smallest / largest element in unordered array
> O(N) - O(N^2){bad pivot choice}, in-place
> random pivot, partition array: all smaller elements than pivot to left and larger to right.
recursion on one part instead of both (quicksort).
> partition: random pivot -> swap with last element -> compare against all elements -> place smaller to left partition
-> swap with last index value
*/

import java.util.Arrays;
import java.util.Random;

public class QuickSelect {
    private static int[] nums = {1, -5, 10, 55, 55, 55, 2, 3, -7, 7, 11, 100};

    public static int selectKthSmallest(int position) {
        return quickSelectKthSmallest(0, nums.length - 1, position - 1);
    }

    private static int quickSelectKthSmallest(int first, int last, int position) {
        int pivot = partitionKthSmallest(first, last);
        if (pivot < position) {
            return quickSelectKthSmallest(pivot + 1, last, position);
        }
        if (pivot > position) {
            return quickSelectKthSmallest(first, pivot - 1, position);
        }
        return nums[pivot];
    }


    // In methods: swap(hi, lo) think "put hi --> lo" from left to right.
    private static int partitionKthSmallest(int lo, int hi) {
        int pivot = new Random().nextInt(hi - lo + 1) + lo;
        System.out.printf("f: %d\tl: %d\tr: %d\t--> %d\tp: %d\n", lo, hi, (hi - lo + 1), (pivot - lo), (pivot));
        swap(pivot, hi);
        for (int i = lo; i < hi; ++i) {
            if (nums[i] < nums[hi]) {
                swap(i, lo);
                lo++;
            }
        }
        swap(hi, lo);
        return lo; // becomes the pivot
    }

    private static void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int selectKthLargest(int position) {
        return quickSelectKthLargest(0, nums.length - 1, position - 1);
    }

    private static int quickSelectKthLargest(int first, int last, int position) {
        int pivot = partitionKthLargest(first, last);
        if (pivot < position) {
            return quickSelectKthLargest(pivot + 1, last, position);
        }
        if (pivot > position) {
            return quickSelectKthLargest(first, pivot - 1, position);
        }
        return nums[pivot];
    }

    private static int partitionKthLargest(int lo, int hi) {
        int pivot = new Random().nextInt(hi - lo + 1) + lo;
        System.out.printf("f: %d\tl: %d\tr: %d\t--> %d\tp: %d\n", lo, hi, (hi - lo + 1), (pivot - lo), (pivot));
        swap(pivot, hi);
        for (int i = lo; i < hi; ++i) {
            if (nums[i] > nums[hi]) {
                swap(i, lo);
                lo++;
            }
        }
        swap(hi, lo);
        return lo;
    }

    /*  QuickSort
    > O(NlogN) - O(N^2), in-place, unstable
    > primitive types: quicksort. Reference types: merge sort.
     */
    private static void quickSortAscending(int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int pivot = partitionKthSmallest(lo, hi);
        quickSortAscending(lo, pivot - 1);
        quickSortAscending(pivot + 1, hi);
    }

    private static void quickSortDescending(int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int pivot = partitionKthLargest(lo, hi);
        quickSortDescending(lo, pivot - 1);
        quickSortDescending(pivot + 1, hi);
    }

    public static void main(String[] args) {
        System.out.println("Input array: " + Arrays.toString(nums));
        System.out.println("===================================================================");
        System.out.println("2nd smallest element: " + selectKthSmallest(2));
        System.out.println("After select Kth smallest: " + Arrays.toString(nums));
        System.out.println("===================================================================");
        System.out.println("After select Kth largest: " + Arrays.toString(nums));
        System.out.println("2nd largest element: " + selectKthLargest(2));
        System.out.println("===================================================================");
        quickSortAscending(0, nums.length - 1);
        System.out.println("Quicksort Ascending: " + Arrays.toString(nums));
        System.out.println("===================================================================");
        quickSortDescending(0, nums.length - 1);
        System.out.println("Quicksort Descending:" + Arrays.toString(nums));
        System.out.println("===================================================================");
    }

}

package org.example.more.ds.algos.sorting;

import java.util.Arrays;
import java.util.Random;

/*  QUICK SORT
> O(NlogN) - O(N^2), in-place, unstable
> primitive types: quicksort. Reference types: merge sort.
 */

public class G_QuicksortDebug {
    private static int[] nums = {1, -5, 10, 55, 55, 55, 2, 3, -7, 7, 11, 100};

    public static void main(String[] args) {
        System.out.println("QUICK SORT ASCENDING");
        quickSortAscending(0, nums.length - 1);
        System.out.println("Sorted: " + Arrays.toString(nums));
        System.out.println("============================================================");
        System.out.println("QUICK SORT DESCENDING");
        quickSortDescending(0, nums.length - 1);
        System.out.println("Sorted: " + Arrays.toString(nums));
        System.out.println("============================================================");
    }

    public static void quickSortAscending(int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int pivot = partitionKthSmallest(lo, hi);
        quickSortAscending(lo, pivot - 1);
        quickSortAscending(pivot + 1, hi);
    }

    public static int partitionKthSmallest(int lo, int hi) {
        int pivot = new Random().nextInt(hi - lo + 1) + lo;
        System.out.printf("lo: %d\thi: %d\trange: %d\trandom --> %d\tpivot: %d\n", lo, hi, (hi - lo + 1), (pivot - lo), pivot);
        swap(pivot, hi);
        for (int i = lo; i < hi; ++i) {
            if (nums[i] < nums[hi]) {
                swap(i, lo);
                lo++;
            }
        }
        swap(hi, lo);
        return lo;
    }

    public static void quickSortDescending(int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int pivot = partitionKthLargest(lo, hi);
        quickSortDescending(lo, pivot - 1);
        quickSortDescending(pivot + 1, hi);
    }

    public static int partitionKthLargest(int lo, int hi) {
        int pivot = new Random().nextInt(hi - lo + 1) + lo;
        System.out.printf("lo: %d\thi: %d\trange: %d\trandom --> %d\tpivot: %d\n", lo, hi, (hi - lo + 1), (pivot - lo), pivot);
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

    public static void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

package org.example.more.ds.algos.selection;

/* QUICK SELECT
> Tony Hoare: k-th smallest / largest element in unsorted array
> O(N) - O(N^2){bad pivot choice}, in-place
> random pivot, partition array, all smaller elements than pivot to left and larger to right.
Recursion on one part instead of both (quicksort)
Partition -> random pivot -> swap with last element -> compare against all elements -> place smaller to left
partition -> swap with last index value.
 */

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

    private static int partitionKthSmallest(int lo, int hi) {
        int pivot = new Random().nextInt(hi - lo + 1) + lo;
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

    private static void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void sort() {
        for (int i = 1; i < nums.length + 1; ++i) {
            System.out.print(selectKthSmallest(i) + " ");
        }
    }

    public static void main(String[] args) {
        sort();
    }
}

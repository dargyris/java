package org.example.a.algos.searching;

/*  Find position in a sorted list.
/   O(logN) worst case.
**/

public class BinarySearch {
    public static int find(int[] array, int item, int left, int right) {
        if (right < left) {
            return -1;
        }
        int middleIndex = (left + right) / 2;
        if (array[middleIndex] == item) {
            return middleIndex;
        }
        if (array[middleIndex] < item) {
            return find(array, item, middleIndex + 1, right);
        }
        return find(array, item, left, middleIndex - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(find(nums, 3, 0, nums.length));
    }
}

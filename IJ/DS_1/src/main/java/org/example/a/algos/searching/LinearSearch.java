package org.example.a.algos.searching;

/*  Linear or Sequential Search
/   Plain old element-by-element search in a list.
/   Method to find item in an unsorted list.
/   Worst case: N comparisons O(N). Not efficient.
/   O(logN) -> Binary search, or even O(1) -> Hashtables can be achieved.
**/

public class LinearSearch {
    public static int findLinear(int[] array, int item) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public static int findRecursive(int[] array, int item, int index) {
        if (index >= array.length) {
            return -1;
        }
        if (array[index] == item) {
            return index;
        }
        return findRecursive(array, item, index + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, -5, 3, 10, 100};
        System.out.println("Linear find: " + findLinear(nums, 10));
        System.out.println("Recursive find: " + findRecursive(nums, 10, 0));
    }
}

package org.example.arrays;

public class XReverseArrayInPlace {
    public static int[] reverseArray(int[] nums) {
        //pointer to first item
        int startIndex = 0;
        //pointer to last item
        int endIndex = nums.length - 1;

        while (endIndex > startIndex) {
            swap(nums, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
        return nums;
    }

    private static void swap(int[] nums, int index1, int index2) {
        int tmp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tmp;
    }
}

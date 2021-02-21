package org.example.more.ds.arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 6, -2, 34, -76, 1};
        printIndex(nums);
    }

    public static void printIndex(int[] nums) {
        System.out.println("nums contains " + nums.length + " elements.");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i: " + i + "\t->\t" + nums[i]);
        }
        System.out.println("for (int i = 0; i < nums.length; i++) will run from 0 to " + (nums.length - 1));
    }
}

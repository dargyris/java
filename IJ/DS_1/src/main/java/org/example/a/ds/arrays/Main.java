package org.example.a.ds.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        reverseArrayInPlace();
        checkIfAnagram();
        findDuplicates();
        reservoirSampling();
    }

    public static void reverseArrayInPlace() {
        /* 1. Reverse Array in-place
        / Probably the most important interview questions re Arrays.
        / O(N)
        **/
        Questions.ReverseArray reverse = new Questions().new ReverseArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Reversed: " + Arrays.toString(reverse.reverseArrayInPlace(nums)));
        System.out.println("===============================================");
    }

    public static void checkIfAnagram() {
        /* Checks if two input strings are anagrms of one another.
        /eg. restful, fluster
        /sort: O(NlogN), compare char arrays: O(N)
        / O(NlogN) + O(N) = O(NlogN): The slowest
        **/
        Questions.Anagrams anagrams = new Questions().new Anagrams();
        String string1 = "restful";
        String string2 = "fluster";
        System.out.println(string1 + " and " + string2 + " anagrams?\t>" + anagrams.areStringsAnagrams(string1, string2));
        System.out.println("===============================================");
    }

    public static void findDuplicates() {
        /* Find duplicates int a 1-D array of ints when they are smaller than the length of the array.
        / 1. Brute force: O(N^2): comparing all items against all
        / 2. hashMaps: Insert with value as key. if item can't be inserted, it's a duplicate. Not in-place!
        / 3. Using absolute values: O(N) and in-place.
        **/
        Questions.Duplicates duplicates = new Questions().new Duplicates();
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(Arrays.toString(nums) + " includes following duplicates:");
        duplicates.findDuplicates(nums);
        System.out.println("===============================================");
    }

    public static void reservoirSampling() {
        /* Reservoir sampling is a family of randomized algos for randomly choosing a sample of k items
        /  from a list S containing n items, where n is either a very large or unknown number.
        /  Simple if I know the size of the array. But not without knowing the bound.
        /  O(N)
        **/
        Questions.Reservoir reservoir = new Questions().new Reservoir();
        int[] nums = {13, 65, 46, 11, 71, 50, 12, 5, 81, 97, 28, 74, 87, 68, 42, 31, 40, 37, 43, 25};
        int k = 5;
        System.out.println("nums array:");
        System.out.println(Arrays.toString(nums));
        reservoir.reservoirSampling(nums, k);
    }
}

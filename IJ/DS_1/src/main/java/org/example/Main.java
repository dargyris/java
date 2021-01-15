package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* 1. Reverse Array in Place:
        / Probably the most important interview question re. Arrays.
        / O(N)
        **/
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(ReverseArrayInPlace.reverseArray(nums)));

        /* 2. Check if anagrams:
        / Checks if two input strings are anagrams of one another.
        / eg. restful, fluster
        / sort: O(NlogN), compare char arrays: O(N)
        / O(NlogN) + O(N) = O(NlogN): The slowest
        **/
        String string1 = "restful";
        String string2 = "fluster";
        System.out.println(AnagramProblem.checkIfAnagrams(string1, string2));

        /* 3. Find duplicates in a 1-D Array of ints when they are smaller than the
        / length of the array.
        / 1. Brute-force: O(N^2): comparing all items against all
        / 2. hashMaps: Insert with value as key. If item can't be inserted, it's a duplicate. Not in-place
        / 3. Using absolute values: O(N) and in-place
        **/
        int[] array = {2, 3, 1, 2, 4, 3};
        FindDuplicates.solve(array);

        /* 4. Reservoir Sampling Problem
        / Reservoir sampling is a family of randomized algos for randomly choosing
        / a sample of k items from a list S containing n items, where n is either
        / a very large or unknown number.
        / Simple if I know the size of the array. But not without knowing the bound.
        / O(N)
        **/
        int[] numbers = {13, 65, 46, 11, 71, 50, 12, 5, 81, 97, 28, 74, 87, 68, 42, 31, 40, 37, 43, 25};
        int k = 5;
        ReservoirSampling reservoir = new ReservoirSampling();
        reservoir.solve(numbers, k);
    }
}

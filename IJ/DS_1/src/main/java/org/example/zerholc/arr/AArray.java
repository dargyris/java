package org.example.zerholc.arr;

import java.util.ArrayList;
import java.util.List;

public class AArray {
    public static void main(String[] args) {
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; ++i) {
            nums[i] = i;
        }

        // O(1) - Random indexing
        int num = nums[0];
        System.out.println(num);

        // O(N) - Linear Search --> BST O(logN) --> hashtables O(1)
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 4) {
                System.out.println("Index found: " + i);
            }
        }

        List<String> list = new ArrayList<>();
        list.add("Adam");
        list.add("Joe");
        list.add("Kevin");

        Object[] array = list.toArray();

        for (Object s : array) {
            System.out.println(s);
        }
    }
}

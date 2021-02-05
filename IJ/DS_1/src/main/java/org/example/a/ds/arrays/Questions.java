package org.example.a.ds.arrays;

import java.util.Arrays;
import java.util.Random;

public class Questions {
    class ReverseArray {
        public int[] reverseArrayInPlace(int[] nums) {
            int startIndex = 0;
            int endIndex = nums.length - 1;
            while (endIndex > startIndex) {
                swap(nums, startIndex, endIndex);
                startIndex++;
                endIndex--;
            }
            return nums;
        }

        private void swap(int[] nums, int index1, int index2) {
            int tmp = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = tmp;
        }
    }

    class Anagrams {
        public boolean areStringsAnagrams(String str1, String str2) {
            char[] s1 = str1.toCharArray();
            char[] s2 = str2.toCharArray();
            if (s1.length != s2.length) {
                return false;
            }

            // O(NlogN) for the sort
            Arrays.sort(s1);
            Arrays.sort(s2);

            // O(N): Check letters 1 by 1
            for (int i = 0; i < s1.length; i++) {
                if (s1[i] != s2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    class Duplicates {
        public void findDuplicates(int[] nums) {
            for (int i = 0; i < nums.length; ++i) {
                if (nums[Math.abs(nums[i])] > 0) {
                    nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
                } else {
                    System.out.println(Math.abs(nums[i]) + " is a repetition!");
                }
            }
        }
    }

    class Reservoir {
        public void reservoirSampling(int[] nums, int k) {
            Random random = new Random();
            int[] reservoir = new int[k];

            //Copy the first k items from the original array
            for (int i = 0; i < reservoir.length; i++) {
                reservoir[i] = nums[i];
            }

            //The i-th item is chosen to be included in the reservoir with probability k/i
            for (int i = k + 1; i < nums.length; i++) {
                int j = random.nextInt(i) + 1;
                if (j < k) {
                    reservoir[j] = nums[i];
                }
            }
            //Show the k random items;
            for (int i = 0; i < reservoir.length; i++) {
                System.out.print(reservoir[i] + " ");
            }
        }
    }
}

package org.example.arrays;

import java.util.Random;

public class XReservoirSampling {
    private Random random;

    public XReservoirSampling() {
        this.random = new Random();
    }

    //O(N) algo to get k items at random from array nums
    public void solve(int[] nums, int k) {
        int[] reservoir = new int[k];

        // Copy the first k items from the original array
        for (int i = 0; i < reservoir.length; i++) {
            reservoir[i] = nums[i];
        }

        // The i-th item is chosen to be included in the reservoir with probability k/i
        for (int i = k + 1; i < nums.length; i++) {
            int j = random.nextInt(i) + 1;
            if (j < k) reservoir[j] = nums[i];
        }

        // Show the k random items.
        for (int i = 0; i < reservoir.length; i++) {
            System.out.println(reservoir[i] + " ");
        }
    }
}

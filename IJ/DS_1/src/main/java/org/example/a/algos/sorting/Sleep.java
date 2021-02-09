package org.example.a.algos.sorting;

import java.util.concurrent.CountDownLatch;

public class Sleep {
    public static void sleepSort(int[] nums) {
        CountDownLatch countLatch = new CountDownLatch(nums.length);

        System.out.print("{ ");
        for (Integer num : nums) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    countLatch.countDown();
                    try {
                        countLatch.await();
                        Thread.sleep(num * 100);
                        System.out.print(num + " ");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        System.out.print(" }\n");
    }

    public static void sleepSortStringBuilder(int[] nums) {
        CountDownLatch countLatch = new CountDownLatch(nums.length);

        StringBuilder s = new StringBuilder();
        s.append("{ ");
        for (Integer num : nums) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    countLatch.countDown();
                    try {
                        countLatch.await();
                        Thread.sleep(num * 100);
                        s.append(num + " ");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        s.append(" }\n");
        System.out.println(s.toString());
    }



    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 6, 8, 5, 6, 9};
        sleepSort(nums);
        sleepSortStringBuilder(nums);
    }
}

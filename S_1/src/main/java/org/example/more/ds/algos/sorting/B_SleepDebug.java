package org.example.more.ds.algos.sorting;

import java.util.concurrent.CountDownLatch;

/*  SLEEP SORT
> Only for numbers. Not for chars Strings or objects.
> Very inefficient.
> The thread sleeps for each number * 100 before printing. The result is that each number gets printed in order.
 */

public class B_SleepDebug {
    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 5, 3, 10, 2, 9};
        sleepSort(nums);
        sleepSortStringBuilder(nums);
    }

    public static void sleepSort(int[] nums) {
        CountDownLatch countDownLatch = new CountDownLatch(nums.length);
        for (Integer num : nums) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    countDownLatch.countDown();
                    try {
                        countDownLatch.await();
                        Thread.sleep(num * 100);
                        System.out.print(num + " ");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public static void sleepSortStringBuilder(int[] nums) {
        CountDownLatch countDownLatch = new CountDownLatch(nums.length);
        StringBuilder s = new StringBuilder();
        for (Integer num : nums) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    countDownLatch.countDown();
                    try {
                        countDownLatch.await();
                        Thread.sleep(num * 100);
                        s.append(num + " ");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        System.out.print(s.toString());
    }
}

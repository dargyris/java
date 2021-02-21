package org.example.ds.general;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayMaxSequence {
    private static final int[] array = {10, 8, 15, 29, -100, 0, 0, 0, 35, 300, -40, 1, -2};

    public static int findMaxSequence(int[] array) {
        Queue<Integer> resultQueue = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer lhs, Integer rhs) {
                if (lhs < rhs) return +1;
                if (lhs.equals(rhs)) return 0;
                return -1;
            }
        });
        int index = 0;
        int counter = 1;
        while (index < array.length - 1) {
            if (array[index] <= array[index + 1]) {
                counter++;
            }
            if (array[index] > array[index + 1]) {
                resultQueue.add(counter);
                counter = 1;
            }
            index++;
        }
        return resultQueue.poll();
    }

    public static void main(String[] args) {
        System.out.println(findMaxSequence(array) + " consequent increasing elements.");
    }
}

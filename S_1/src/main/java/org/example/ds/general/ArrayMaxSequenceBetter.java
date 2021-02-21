package org.example.ds.general;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayMaxSequenceBetter {
    private static final int[] array = {10, 8, 15, 29, -100, 0, 0, 0, 35, 300, -40, 1, -2};

    public static int findMaxSequence(int[] array) {
        Queue<Integer> resultQueue = new PriorityQueue<>();
        int counter = -1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                counter--;
            } else {
                resultQueue.add(counter);
                counter = -1;
            }
        }
        return -resultQueue.poll();
    }

    public static void main(String[] args) {
        System.out.println(findMaxSequence(array) + " consequent increasing elements.");
    }
}

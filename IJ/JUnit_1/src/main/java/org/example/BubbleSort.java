package org.example;

import java.util.Arrays;

public class BubbleSort {

    private static final int[] ints = {0, -100, 95, 47, 29, 140, 20, -4, 12, 93, 24, 75};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ints));
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints.length; j++) {
                boolean jElementIsBigger = ints[j] > ints[i];
                if (jElementIsBigger) {
                    swap(i, j);
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }

    public static void swap(int i, int j) {
        int tmp = ints[i];
        ints[i] = ints[j];
        ints[j] = tmp;
    }
}

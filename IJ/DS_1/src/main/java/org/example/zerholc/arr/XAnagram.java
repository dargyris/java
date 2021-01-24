package org.example.zerholc.arr;

import java.util.Arrays;

public class XAnagram { //Checks if two char arrays are anagrams of one another.

    public static boolean checkIfAnagrams(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        if (s1.length != s2.length) {
            return false;
        }

        // O(NlogN) for sort
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

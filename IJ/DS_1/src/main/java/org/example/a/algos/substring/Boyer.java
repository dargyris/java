package org.example.a.algos.substring;

import java.util.HashMap;
import java.util.Map;

public class Boyer {
    public static void main(String[] args) {
        String text = "This is a text to test. To test!";
        String pattern = "test";
        boyerMoore(text, pattern);
    }

    public static Map<Character, Integer> createMismatchTable(String pattern) {
        Map<Character, Integer> mismatchShiftTable = new HashMap<>();
        int lengthOfPattern = pattern.length();
        for (int i = 0; i < lengthOfPattern; i++) {
            mismatchShiftTable.put(pattern.charAt(i), Math.max(1, lengthOfPattern - i - 1));
        }

        return new HashMap<>(mismatchShiftTable);
    }

    public static void boyerMoore(String text, String pattern) {
        Integer lengthOfPattern = pattern.length();
        Map<Character, Integer> mismatchShiftTable = createMismatchTable(pattern);
        Integer numOfShifts;
        int matchPosition = -1;
        for (int i = 0; i <= (Integer) text.length() - lengthOfPattern; i += numOfShifts) {
            numOfShifts = 0;
            for (int j = lengthOfPattern - 1; j >= 0; j--) {
                if (pattern.charAt(j) == text.charAt(i + j)) {
                    continue;
                }
                numOfShifts = mismatchShiftTable.get(text.charAt(i + j));
                if (numOfShifts == null) {
                    numOfShifts = lengthOfPattern;
                    break;
                } else {
                    break;
                }
            }
            if (numOfShifts == 0) {
                matchPosition = i;
                System.out.println("Match at: " + matchPosition);
                numOfShifts = lengthOfPattern;
            }
        }
        if (matchPosition == -1) {
            System.out.println("No match found.");
        }
    }
}

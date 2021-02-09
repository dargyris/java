package org.example.a.algos.substring;

public class Brute {
    public static void main(String[] args) {
        String text ="This is just a test! Just a just a test.";
        String pattern ="just";

        bruteForce(text, pattern);
    }

    public static void bruteForce(String text, String pattern) {
        System.out.println("Finding pattern in substring with Brute Force.");
        System.out.println("Input text: " + text);
        System.out.println("Pattern: " + pattern);
        int lengthText = text.length();
        int lengthPattern = pattern.length();
        int matchPosition = -1;

        for (int i = 0; i < lengthText; i++) {
            int j;
            for (j = 0; j < lengthPattern; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == lengthPattern) {
                matchPosition = i;
                System.out.println("Match position at: " + matchPosition);
            }
        }
        if (matchPosition < 0) {
            System.out.println("\nNo match found.");
        }
        System.out.println("============================================\n");
    }
}

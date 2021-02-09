package org.example.a.algos.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Questions {
    public static void main(String[] args) {
        reverseString();
        getSuffixes();
        getPrefixes();
        longestCommonPrefix();
        longestRepeatedSubstring();
    }

    public static void reverseString() {
        System.out.print("Reversing string: ");
        String text = "My name is Diamantis!";
        System.out.print(text + "\n");

        int lengthOfText = text.length();
        StringBuilder reversedString = new StringBuilder();
        for (int i = lengthOfText - 1; i >= 0; i--) {   // O(N)
            reversedString.append(text.charAt(i));      // O(1)
        }
        System.out.println(reversedString.toString());
        System.out.println("======================================\n");
    }

    public static void getSuffixes() {
        System.out.print("Getting Suffixes: ");
        String text = "GATAGA";
        System.out.print(text + "\n");
        int lengthOfText = text.length();       //O(1)
        List<String> suffixesList = new ArrayList<>();
        for (int i = 0; i < lengthOfText; ++i) {
            suffixesList.add(text.substring(i, lengthOfText)); //O(1). With StringBuilder O(N)!
        }
        suffixesList.forEach(suffix -> System.out.print(suffix + " "));
        System.out.println("\n======================================\n");
    }

    public static void getPrefixes() {
        System.out.print("Getting Prefixes: ");
        String text = "GATAGA";
        System.out.print(text + "\n");
        int lengthOfText = text.length();       //O(1)
        List<String> prefixesList = new ArrayList<>();
        for (int i = 1; i <= lengthOfText; i++) {
            prefixesList.add(text.substring(0, i)); //O(1). With StringBuilder O(N)!
        }
        prefixesList.forEach(suffix -> System.out.print(suffix + " "));
        System.out.println("\n======================================\n");
    }

    public static void longestCommonPrefix() {
        System.out.println("Longest common Prefix: ");
        String string1 = "GATAGA";
        String string2 = "GATACTAGA";
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);
        int commonLength = Math.min(string1.length(), string2.length());

        int indexOfLastMatch = -1;
        for (int i = 0; i < commonLength; ++i) {
            if (string1.charAt(i) != string2.charAt(i)) {
                break;
            }
            indexOfLastMatch = i;
        }

        System.out.println(indexOfLastMatch == -1 ? "No match." : string1.substring(0, indexOfLastMatch + 1));
        System.out.println("======================================\n");
    }

    public static String longestCommonPrefix(String string1, String string2) {
//        System.out.println("String 1: " + string1 + "\tString 2: " + string2);
        int commonLength = Math.min(string1.length(), string2.length());
        for (int i = 0; i < commonLength; i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
//                System.out.println(">" + string1.substring(0, i));
                return string1.substring(0, i);
            }
        }
//        System.out.println(">>" + string1.substring(0, commonLength));
        return string1.substring(0, commonLength);
    }

    public static List<String> getSuffixes(String text) {
        int lengthOfText = text.length();
        List<String> suffixesList = new ArrayList<>();
        for (int i = 0; i < lengthOfText; ++i) {
            suffixesList.add(text.substring(i, lengthOfText));
        }
        return suffixesList;
    }

    public static void longestRepeatedSubstring() {
        System.out.println("Longest Repeated Substirng");
        String text = "TACAGATTAGATTATTTTAGAGATACATACA";
        System.out.print("Text: " + text + "\n");

        int lengthOfText = text.length();
        List<String> suffixesList = getSuffixes(text);
        Collections.sort(suffixesList); // Mergesort for reference types (Strings, Custom objects) O(NlogN). For primitives quicksort.
//        suffixesList.forEach(suffix -> System.out.println(suffix));

        String longestSubstring = "";
        for (int i = 0; i < lengthOfText - 1; i++) {
            String tempString = longestCommonPrefix(suffixesList.get(i), suffixesList.get(i + 1));
            if (tempString.length() > longestSubstring.length()) {
                longestSubstring = tempString;
            }
        }
        System.out.println("Longest Substring: " + longestSubstring);
        System.out.println("======================================\n");
    }
}
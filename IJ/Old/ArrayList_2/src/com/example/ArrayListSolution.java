package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSolution {

    private static final Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // ====================== GET No OF LINES ======================
        list.add(new ArrayList<>());
        list.get(0).add(Integer.parseInt(s.nextLine()));
        int numberOfLines = list.get(0).get(0);
        int lineStartIndex = 1;
        int lineEndIndex = numberOfLines + 1;

        // ======================= POPULATE LINES ======================
        for (int i = lineStartIndex; i < lineEndIndex; i++) {
            list.add(new ArrayList<>());
            list.get(i).add(s.nextInt());
            int maxLineElements = list.get(i).get(0);

            for (int j = 1; j <= maxLineElements; j++ ) {
                list.get(i).add(s.nextInt());
            }
        }
        s.nextLine();

        // ===================== GET No OF QUERIES =====================
        list.add(new ArrayList<>());
        list.get(list.size() - 1).add(Integer.parseInt(s.nextLine()));
        int numberOfQueries = list.get(list.size() - 1).get(0);
        int queryStartIndex = list.size();
        int queryEndIndex = list.size() + numberOfQueries;
        // ====================== POPULATE QUERIES =====================

        for (int i = queryStartIndex; i < queryEndIndex; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) { // Get line and column number
                list.get(i).add(s.nextInt());
            }
        }
        s.nextLine();

        // PRINT HELPER
//        for (int k = 0; k < list.size(); k++) {
//            System.out.println(k + ": " + list.get(k));
//        }

        // ========================= GET NUMBERS =======================
        for (int i = queryStartIndex; i < list.size(); i++) {
            int lineNumber = list.get(i).get(0);
            int columnNumber = list.get(i).get(1);

            if (lineNumber < 1) {   // The 0th line contains the number of lines.
                System.out.println("ERROR!");
                continue;
            }

            if (columnNumber < 1) {   // The elements of the 0th column contain how many numbers a line will have.
                System.out.println("ERROR!");
                continue;
            }

            if (lineNumber > lineEndIndex) {    // Should not check beyond the end of lines to check.
                System.out.println("ERROR!");
                continue;
            }

            if (columnNumber > list.get(lineNumber).get(0)) {   // Should not check beyond the last element of a line.
                System.out.println("ERROR!");
                continue;
            }

            System.out.println(list.get(lineNumber).get(columnNumber));
        }

    }
}
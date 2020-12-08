package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();

        int[] lines = new int[1];
        System.out.print("Enter number of lines\t> ");
        lines[0] = Integer.parseInt(s.nextLine());
        list.add(lines);
        // Index of line start is always 1

        for (int i = 1; i <= lines[0]; i++) {
            System.out.print("Enter number of elements for line " + i + "\t> ");
            int elements = Integer.parseInt(s.nextLine());
            int[] line = new int[elements + 1];
            line[0] = elements;
            System.out.print("Enter elements:\n");
            for (int j = 1; j <= elements; j++) {
                System.out.print("\t> ");
                line[j] = Integer.parseInt(s.nextLine());
            }
            list.add(line);
        }
        // Index of line end is list.size() - 1 after finishing input
        int lineEndIndex = list.size() - 1;

        // ====================  PRINT LIST HELPER =====================
//        System.out.println("Number of lines: " + Arrays.toString(list.get(0)));
//        for (int i = 1; i <= lineEndIndex; i++) {
//            System.out.println("Line " + i + ": " + Arrays.toString(list.get(i)));
//        }
        // ====================  ================= =====================

        int[] queries = new int[1];
        System.out.print("Enter number of queries\t> ");
        queries[0] = Integer.parseInt(s.nextLine());
        list.add(queries);
        // Index of Query start is list.size()
        int queryStartIndex = list.size();

        for (int i = 0; i < queries[0]; i++) {
            int[] query = new int[2];
            System.out.print("Enter query line\t> ");
            query[0] = Integer.parseInt(s.nextLine());
            System.out.print("Enter query column\t> ");
            query[1] = Integer.parseInt(s.nextLine());
            list.add(query);
            System.out.println();
        }

        // Index of Query end is list.size() - 1
        int queryEndIndex = list.size() - 1;

        // ====================  PRINT FULL LIST =====================
        System.out.println("Number of lines: " + Arrays.toString(list.get(0)));
        for (int i = 1; i <= lineEndIndex; i++) {
            System.out.println("\tLine " + i + ": " + Arrays.toString(list.get(i)));
        }
        System.out.println("Number of queries: " + Arrays.toString(list.get(queryStartIndex - 1)));
        int queryCounter = 1;
        for (int i = queryStartIndex; i <= queryEndIndex; i++) {
            System.out.println("\tQuery " + (queryCounter++) + ": " + Arrays.toString(list.get(i)));
        }
        // ====================  =============== =====================

        for (int i = queryStartIndex; i <= queryEndIndex; i++) {
            int lineNumber = list.get(i)[0];
            int columnNumber = list.get(i)[1];

            if (lineNumber < 1 || columnNumber < 1) {
                System.out.println("ERROR!");
                continue;
            }

            if (lineNumber > lineEndIndex) {
                System.out.println("ERROR!");
                continue;
            }

            if (columnNumber > list.get(lineNumber)[0]) {
                System.out.println("ERROR!");
                continue;
            }

            System.out.println(list.get(lineNumber)[columnNumber]);
        }



    }
}
package com.example;

import java.util.Scanner;

public class Main {
    public static final Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        String string = s.nextLine();
        string = string.trim();
        String[] splitString = string.split("(^[ !,?._'@]+)|([ !,?._'@]+)", 0);
        try {
            if (splitString[0].equals("")) {
                splitString = new String[0];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            splitString = new String[0];
        }
        System.out.println(splitString.length);
        for (String str : splitString) {
            System.out.println(str);
        }

        s.close();
    }
}


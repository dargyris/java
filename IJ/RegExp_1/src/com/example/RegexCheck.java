package com.example;

import java.util.Scanner;
import java.util.regex.*;

public class RegexCheck {
    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int testCases = Integer.parseInt(s.nextLine());
        while(testCases>0){
            String input = s.nextLine();
            try {
                Pattern pattern = Pattern.compile(input);
                System.out.println(pattern);
                System.out.println("Valid");
            } catch(PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}




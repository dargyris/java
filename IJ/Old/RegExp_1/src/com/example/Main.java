package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    public static final String groupA = "^([0-9]\\.|[0-9][0-9]\\.|[0-1][0-9][0-9]\\.|[0-2][0-4][0-9]\\.|[0-2][5][0-5]\\.){3}";
    public static final String groupB = "([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[0-2][0-4][0-9]|[0-2][0-5][0-5])$";
    public static final String pattern = groupA + groupB;

    public MyRegex() {}

}
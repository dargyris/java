package org.example;

public class Main {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("{ ");
        for (int i = 0; i <= 10; i++) {
            s.append(Series.nSum(i) + " ");
        }
        s.append("}");
        System.out.println(s.toString());

        s = new StringBuilder();
        s.append("{ ");
        for (int i = 0; i <= 10; i++) {
            s.append(Series.calcFactorial(i) + " ");
        }
        s.append("}");
        System.out.println(s.toString());

        s = new StringBuilder();
        s.append("{ ");
        for (int i = 0; i <= 10; i++) {
            s.append(Series.calcFibonacci(i) + " ");
        }
        s.append("}");
        System.out.println(s.toString());
    }

}

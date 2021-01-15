package org.example;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter("Diamantis");
        counter.increment();
        System.out.println(counter.getCounter());
        System.out.println(counter.toString());
    }
}

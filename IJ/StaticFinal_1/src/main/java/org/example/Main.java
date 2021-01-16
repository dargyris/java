package org.example;

public class Main {
    public static void main(String[] args) {
//        ExternalClass one = new ExternalClass("one");
//        ExternalClass two = new ExternalClass("two");
//        ExternalClass three = new ExternalClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());

        System.out.println("In main.");
        SIB test = new SIB();
        test.method();
        System.out.println("Owner: " + SIB.owner);
    }
}

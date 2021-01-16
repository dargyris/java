package org.example;

// Static Initialization Blocks Demo
public class SIB {
    public static final String owner;

    static {
        owner = "Diamantis";
        System.out.println("Static Init. Block 1 called.");
    }

    public SIB() {
        System.out.println("SIB Constructor called.");
    }

    static {
        System.out.println("Static Init. Block 2 called.");
    }

    public void method() {
        System.out.println("Some method called.");
    }
}

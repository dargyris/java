package com.example;

public class StaticTest {
    private static int numInstances = 0;
    private int numInst = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
        numInst++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public int getNumInst() {
        return numInst;
    }

    public String getName() {
        return name;
    }
}

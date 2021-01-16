package org.example;

public class ExternalClass {
    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    public ExternalClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance: " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}

package org.example;

public abstract class A_Animal {
    private String name;

    public A_Animal(String name) {
        this.name = name;
    }

    public abstract void breathe();
    public abstract void eat();

    public String getName() {
        return name;
    }
}

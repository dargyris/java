package org.example;

public class A_Dog extends A_Animal {
    public A_Dog(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println("Breathes.");
    }

    @Override
    public void eat() {
        System.out.println("Eating.");
    }
}

package org.example;

public class Human {
    private String name;
    private int age;
    private int height;
    private String eyeColor;

    public Human(String name, int age, int height, String eyeColor) {
        super();
        this.name = name;
        this.age = age;
        this.height = height;
        this.eyeColor = eyeColor;
    }

    public void speak() {
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I am " + height + " inches tall.");
        System.out.println("I am " + age + " years old.");
        System.out.println("My eye color is " + eyeColor + ".");
    }

    public void eat() {
        System.out.println("I am eating.");
    }

    public void walk() {
        System.out.println("I am walking.");
    }

    public void work() {
        System.out.println("I am working.");
    }
}

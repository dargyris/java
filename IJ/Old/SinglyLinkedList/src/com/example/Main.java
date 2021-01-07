package com.example;

public class Main {

    public static void main(String[] args) {
        Employee vladimir = new Employee("Vladimir", "Putin", 98);
        Employee bill = new Employee("Bill", "Clinton", 79);
        Employee diana = new Employee("Dirty", "Diana", 37);
        Employee cavaliere = new Employee("Silvio", "Berlusconi", 89);

        SLinkedList list = new SLinkedList();
        list.add(vladimir);
        list.add(bill);
        list.add(diana, 2);
        list.add(cavaliere, 2);
    }
}

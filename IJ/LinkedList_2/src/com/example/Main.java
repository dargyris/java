package com.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee lynda = new Employee("Lynda", "Green", 29);
        Employee harry = new Employee("Harry", "Potter", 32);
        Employee larry = new Employee("Larry", "Page", 29);
        Employee andrew = new Employee("Andrew", "Knife", 39);
        Employee gandalf = new Employee("Gandalf", "Genious", 49);

        AListSize<Employee> list = new AListSize<>();

        System.out.println(list.addFirst(lynda) ? "Success" : "Fail");
        System.out.println(list.addLast(lynda) ? "Success" : "Fail");
        System.out.println(list.addFirst(harry) ? "Success" : "Fail");
        System.out.println(list.addLast(harry) ? "Success" : "Fail");
        System.out.println(list.addFirst(larry) ? "Success" : "Fail");
        System.out.println(list.addLast(larry) ? "Success" : "Fail");
        System.out.println(list.addFirst(andrew) ? "Success" : "Fail");
        System.out.println(list.addLast(andrew) ? "Success" : "Fail");
        System.out.println(list.addFirst(gandalf) ? "Success" : "Fail");
        System.out.println(list.addLast(gandalf) ? "Success" : "Fail");
        System.out.println();

        list.forEach(employee -> System.out.println(employee));
        System.out.println(list.toString());
        System.out.println();

        System.out.println("Gandalf exists? " + list.contains(gandalf) + ", position: " + list.indexOf(gandalf));
        System.out.println();

        System.out.println("Remove first:\t" + list.removeFirst());
        System.out.println("Remove last :\t" + list.removeLast());
        System.out.println();

        System.out.println(list.add(gandalf, 4) ? "Success" : "Fail");
        System.out.println(list.add(gandalf, 5) ? "Success" : "Fail");
        list.forEach(employee -> System.out.println(employee));
        System.out.println(list.toString());
        System.out.println();

        System.out.println(list.remove(2));
        System.out.println(list.remove(6));
        System.out.println();
        list.forEach(employee -> System.out.println(employee));
        System.out.println(list.toString());
        System.out.println();

        list.push(gandalf);
        System.out.println(list.pop());
        System.out.println(list.dequeue());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
    }

}

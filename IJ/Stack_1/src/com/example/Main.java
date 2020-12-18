package com.example;

import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println("*** STACKS / LIFO ***");
        System.out.println("* NOT HOW items are stored -> Abstract Data Type");
        System.out.println("* What operations are allowed on the items.");
        System.out.println("* LinkedList implementation is ideal.");
        System.out.println("* Arrays can also be used.");
        System.out.println("* PEEK - PUSH - POP");
        System.out.println("* Class Stack exists in java.util");
        System.out.println("* Recommended class that implements Deque interface");
        System.out.println("* eg. Deque<Integer> stack = new ArrayDeque<>();");
        System.out.println("* eg. List<Integer> stack = new LinkedList<>();");
        System.out.println("* It's good practice to wrap the LinkedList and hide irrelevant methods.");
        System.out.println();

        Employee bill = new Employee("Bill", "Clinton", 3);
        Employee monica = new Employee("Monica", "Lewinski", 18);
        Employee silvio = new Employee("Silvio", "Berlusconi", 29);
        Employee vladimir = new Employee("Vladimir", "Poutin", 44);

        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push(vladimir);
        arrayStack.push(monica);
        arrayStack.push(silvio);
        arrayStack.push(bill);

        System.out.println(arrayStack.toString());
        arrayStack.printStack();
        System.out.println();

        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(vladimir);
        linkedStack.push(monica);
        linkedStack.push(silvio);
        linkedStack.push(bill);

        linkedStack.printStack();
        System.out.println();
    }
}

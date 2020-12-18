package com.example;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedStack {
    private Deque<Employee> stack;

    public LinkedStack() {
        stack = new LinkedList<>();
    }

    private boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(Employee emmployee) {
        stack.push(emmployee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public int size() {
        return stack.size();
    }

    public void printStack() {
        stack.forEach(employee -> System.out.println(employee.toString()));
    }
}

package com.example;

import java.util.NoSuchElementException;

public class SLinkedList {
    EmployeeNode head;

    public Employee peek(){
        return head.getData();
    }

    public boolean push(Employee e) {
        EmployeeNode n = new EmployeeNode(e);
        n.setNext(head);
        head = n;
        return true;
    }

    public boolean add(Employee e) {
        return push(e);
    }

    public boolean add(Employee e, int index) {
        if (head == null) {
            push(e);
        }

        EmployeeNode n = new EmployeeNode(e);
        EmployeeNode current = head;
        EmployeeNode prev = head;
        for (int i = 0; i < index; i++) {
            if (current.hasNext()) {
                prev = current;
                current = current.getNext();
                continue;
            } else {
                return false;
            }
        }
        n.setNext(current);
        prev.setNext(n);
        return true;
    }

    public Employee remove() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        Employee e = head.getData();
        head = head.getNext();
        return e;
    }

    public void printList() {
        if (head == null) {
            return;
        }

        EmployeeNode current = head;
        while (current != null) {
            System.out.println(current);
        }
    }
}

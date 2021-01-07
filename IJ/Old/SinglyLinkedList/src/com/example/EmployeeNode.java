package com.example;

public class EmployeeNode {
    private Employee e;
    private EmployeeNode next;

    public EmployeeNode(Employee e) {
        this.e = e;
    }

    public Employee getData() {
        return e;
    }

    public void setData(Employee e) {
        this.e = e;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public String toString() {
        return e.toString();
    }
}

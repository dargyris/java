package com.example;

public class Main {

    public static void main(String[] args) {
        Employee lynda = new Employee("Lynda", "Green", 29);
        Employee harry = new Employee("Harry", "Potter", 32);
        Employee larry = new Employee("Larry", "Page", 29);
        Employee andrew = new Employee("Andrew", "Haska", 39);
        Employee gandalf = new Employee("Gandalf", "Genious", 49);

        LList<Employee> list = new LList<>();
//        list.addFirst(lynda);
//        list.addFirst(harry);
//        list.addFirst(larry);
//        list.addFirst(andrew);
//        list.addFirst(gandalf);
//
//        if (list.add(gandalf, 0)) {
//            System.out.println("Success");
//        } else {
//            System.out.println("Fail");
//        }
//        if (list.add(gandalf, 2)) {
//            System.out.println("Success");
//        } else {
//            System.out.println("Fail");
//        }
//        if (list.add(gandalf, 8)) {
//            System.out.println("Success");
//        } else {
//            System.out.println("Fail");
//        }
//        if (list.add(harry, 0)) {
//            System.out.println("Success");
//        } else {
//            System.out.println("Fail");
//        }
        if (list.addLast(larry)) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
        System.out.println("========================\n");

        list.printAll();
        System.out.println("========================\n");

        System.out.println(list.getFirst().getData());
        System.out.println(list.getLast().getData());
        System.out.println("========================\n");

        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println("========================\n");

        System.out.println(list.peek());
        System.out.println("========================\n");

        list.printAll();
        System.out.println("========================\n");

        for (Employee e : list) {

        }
    }

}

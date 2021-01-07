package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee silvio = new Employee("Silvio", "Berlusconi", 17);
        Employee vladimir = new Employee("Vladimir", "Putin", 29);
        Employee milosevic = new Employee("Slobodan", "Milosevic", 26);
        Employee bill = new Employee("Bill", "Clinton", 38);
        Employee monica = new Employee("Monica", "Lewinski", 22);

//      ========================================================================
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(silvio);
        employeeList.add(vladimir);
        employeeList.add(milosevic);
        employeeList.add(bill);
        employeeList.add(monica);

        employeeList.forEach(employee -> System.out.println(employee.toString()));
        System.out.println();

//      ========================================================================

        PArrayList<Employee> employees = new PArrayList<>();

        employees.add(silvio);
        employees.add(vladimir);
        employees.add(milosevic);
        employees.add(bill);
        employees.add(monica, 2);

        employees.forEach(employee -> System.out.println(employee.toString()));
        System.out.println();

        employees.remove(0);
        employees.remove(3);
        employees.forEach(employee -> System.out.println(employee.toString()));
        System.out.println();

        System.out.println(employees.contains(vladimir));
        System.out.println(employees.indexOf(monica));
    }
}

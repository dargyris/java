package com.example;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;

    public Student() {}
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();

        while (testCases > 0) {

            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        sortStudents(studentList);

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }

    public static void sortStudents(List<Student> students) {
        int size = students.size();
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (students.get(j).getCgpa() > students.get(i).getCgpa()) {
                    swapStudents(students, i, j);
                } else if (students.get(j).getCgpa() == students.get(i).getCgpa()) {
                    if (students.get(j).getFname().compareTo(students.get(i).getFname()) < 0) {
                        swapStudents(students, i, j);
                    } else if (students.get(j).getFname().compareTo(students.get(i).getFname()) == 0) {
                        if (students.get(j).getId() > students.get(i).getId()) {
                            swapStudents(students, i, j);
                        }
                    }
                }
            }
        }
    }

    public static void swapStudents(List<Student> students, int a, int b) {
        Student tempStudent = students.get(a);
        students.set(a, students.get(b));
        students.set(b, tempStudent);
    }

}


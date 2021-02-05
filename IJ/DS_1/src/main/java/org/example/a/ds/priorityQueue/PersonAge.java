package org.example.a.ds.priorityQueue;

// I need to specify with the Comparable that I want the priority based on Age
public class PersonAge implements Comparable<PersonAge> {
    private String name;
    private int age;

    public PersonAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age;
    }

    //Priority based on age is ascending. With a - becomes descending.
    @Override
    public int compareTo(PersonAge other) {
        return Integer.compare(age, other.getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

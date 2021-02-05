package org.example.a.ds.priorityQueue;

public class PersonName implements Comparable<PersonName> {
    private String name;
    private int age;

    public PersonName(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age;
    }

    @Override
    public int compareTo(PersonName other) {
        return name.compareTo(other.getName());
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

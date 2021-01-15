package org.example;

public class Counter {
    String name;
    int counter;

    public Counter(String name) {
        this.name = name;
        this.counter = 0;
    }


    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(name + ": " + counter);
        return s.toString();
    }
}

package org.example.a.ds.stacks;

public interface MyStack<T> extends Iterable<T> {
    int size();
    boolean isEmpty();
    boolean push(T obj);
    T peek();
    T pop();
}

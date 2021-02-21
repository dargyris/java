package org.example.more.ds.stacks;

public interface MyStack<T> {
    int size();
    boolean isEmpty();
    boolean push(T obj);
    T peek();
    T pop();
}

package org.example.zerholc.stk;

public interface MyStack<T> extends Iterable<T> {
    int size();
    boolean isEmpty();
    boolean push(T obj);
    T peek();
    T pop();
}

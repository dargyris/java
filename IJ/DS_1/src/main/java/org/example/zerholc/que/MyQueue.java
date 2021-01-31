package org.example.zerholc.que;

public interface MyQueue<T> extends Iterable<T> {
    int size();
    boolean isEmpty();
    boolean enqueue(T obj);
    T peek();
    T dequeue();
}

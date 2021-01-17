package org.example.Hbst;

public interface ITree<T> {
    void traversal();
    void insert(T data);
    void delete(T data);
    T getMax();
    T getMin();
}
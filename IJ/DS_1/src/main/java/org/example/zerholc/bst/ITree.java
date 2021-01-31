package org.example.zerholc.bst;

public interface ITree<T> {
    void inOrderTraversal();
    void insert(T data);
    void delete(T data);
    T getMaxValue();
    T getMinValue();
}

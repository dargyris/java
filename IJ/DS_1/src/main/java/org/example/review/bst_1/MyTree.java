package org.example.review.bst_1;

public interface MyTree<T> {
    void insert(T data);
    T getMax();
    T getMin();
    void inOrderTraversal();
    void delete(T data);
}

package org.example.b.ds.bst;

public interface Tree<T extends Comparable<T>> {
    TreeNode<T> getRoot();
    void insert(T data);
    T getMax();
    T getMin();
    void preOrderTraversal();
    void inOrderTraversal();
    void postOrderTraversal();
    void delete(T data);
}

package org.example.a.ds.bst;

public interface MyTree<T> {
    TreeNode<T> getRoot();
    void insert(T data);
    T getMax();
    T getMin();
    void delete(T data);
    void inOrderTraversal();
}

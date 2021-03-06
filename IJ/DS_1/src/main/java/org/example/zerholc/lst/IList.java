package org.example.zerholc.lst;

public interface IList<T extends Comparable<T>> {
    void insert(T data);
    void remove(T data);
    void traverseList();
    int size();
    LNode<T> getMiddleNode();
    void reverse();
}

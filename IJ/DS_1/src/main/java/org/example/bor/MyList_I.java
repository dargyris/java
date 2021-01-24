package org.example.bor;

public interface MyList_I<T extends Comparable<T>> {
    int size();
    boolean isEmpty();
    boolean addFirst();
    boolean addLast();
    boolean add(T object, int position);
    T removeFirst();
    T removeLast();
    T remove(int position);
    int indexOf();
    boolean contains(T object);
    boolean push(T object);
    T pop();
    T peekFirst();
    T peekLast();
}

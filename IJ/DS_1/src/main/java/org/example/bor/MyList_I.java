package org.example.bor;

public interface MyList_I<T> extends Iterable<T> {
    int size();
    boolean isEmpty();
    boolean addFirst(T obj);
    boolean addLast(T obj);
    boolean add(T obj, int position);
    T removeFirst();
    T removeLast();
    T remove(int position);
    int indexOf(T obj);
    boolean contains(T obj);
    boolean push(T obj);
    T pop();
    T dequeue();
    T peekFirst();
    T peekLast();
}

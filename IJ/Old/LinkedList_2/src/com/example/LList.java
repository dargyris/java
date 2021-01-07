package com.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LList<E> implements Iterable<E> {
    class Node<E> {
        private E data;
        private Node next;

        public Node(E obj) {
            data = obj;
            next = null;
        }

        private boolean hasNext() {
            return next != null;
        }
    }

    private Node<E> head;

    public LList() {
        head = null;
    }

    @Override
    public Iterator<E> iterator() {
        return new IteratorHelper();
    }

    class IteratorHelper implements Iterator<E> {
        private Node<E> index;

        public IteratorHelper() {
            index = head;
        }

        @Override
        public boolean hasNext() {
            return index != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E val = index.data;
            index = index.next;
            return val;
        }
    }

    private int size() {
        int index = 1;
        Node<E> tmp = head;
        while (tmp.hasNext()) {
            index++;
            tmp = tmp.next;
        }
        return index;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("size: " + size());
        return s.toString();
    }

    public boolean addFirst(E obj) {
        Node<E> node = new Node<>(obj);
        node.next = head;
        head = node;
        return true;
    }

    public boolean addLast(E obj) {
        if (head == null) {
            return addFirst(obj);
        }
        Node<E> node = new Node<>(obj);
        Node<E> tmp = head;
        while (tmp.hasNext()) {
            tmp = tmp.next;
        }
        tmp.next = node;
        return true;
    }

    public boolean add(E obj, int position) {
        if (position < 0) {
            return false;
        }
        int size = size();
        if (position >= size) {
            return false;
        }
        if (position == 0) {
            return addFirst(obj);
        }
        if (position == size) {
            return addLast(obj);
        }

        Node<E> node = new Node<>(obj);
        Node<E> tmp = head;
        Node<E> prev = null;
        int index = 0;
        while (index < position) {
            prev = tmp;
            tmp = tmp.next;
            index++;
        }
        prev.next = node;
        node.next = tmp;
        return true;
    }

    public E removeFirst() {
        if (head == null) {
            return null;
        }
        E val = head.data;
        head = head.next;
        return val;
    }

    public E removeLast() {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return removeFirst();
        }

        Node<E> tmp = head;
        Node<E> prev = null;
        while (tmp.hasNext()) {
            prev = tmp;
            tmp = tmp.next;
        }
        E val = tmp.data;
        prev.next = null;
        return val;
    }

    public E remove(int position) {
        if (position < 0) {
            return null;
        }
        int size = size();
        if (position >= size) {
            return null;
        }
        if (position == 0) {
            return removeFirst();
        }
        if (position == size) {
            return removeLast();
        }

        Node<E> tmp = head;
        Node<E> prev = null;
        int index = 0;
        while (index < position) {
            prev = tmp;
            tmp = tmp.next;
            index++;
        }
        E val = tmp.data;
        prev.next = tmp.next;
        tmp.next = null;
        return val;
    }

    public int indexOf(E obj) {
        Node<E> tmp = head;
        int index = 0;
        while (index < size()) {
            if (((Comparable<E>) obj).compareTo(tmp.data) == 0) {
                return index;
            }
            tmp = tmp.next;
            index++;
        }
        return -1;
    }

    public boolean contains(E obj) {
        return indexOf(obj) >= 0;
    }

    public boolean push(E obj) {
        return addFirst(obj);
    }

    public E pop() {
        return removeFirst();
    }

    public E dequeue() {
        return removeLast();
    }

    public E peekFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    public E peekLast() {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return peekFirst();
        }
        Node<E> tmp = head;
        while (tmp.hasNext()) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

}

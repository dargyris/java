package com.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LList<E> {
    class Node<E> {
        private E data;
        private Node next;

        public Node(E obj) {
            data = obj;
            next = null;
        }

        public boolean hasNext() {
            return next != null;
        }

        public E getData() {
            return data;
        }
    }

    class IteratorHelper implements Iterator<E> {
        Node<E> index;

        public IteratorHelper() {
            index = head;
        }

        public boolean hasNext() {
            return index != null;
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            E val = index.data;
            index = index.next;
            return val;
        }

    }

    private Node<E> head;

    //  LLIST CONSTRUCTOR =================================
    public LList() {
        head = null;
    }

    //  LLIST FUNCTIONS ===================================
    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }

        Node<E> tmp = head;
        int size = 1;
        while (tmp.hasNext()) {
            tmp = tmp.next;
            size++;
        }
        return size;
    }

    public Node<E> getFirst() {
        return head;
    }

    public Node<E> peek() {
        return getFirst();
    }

    public Node<E> getLast() {
        if (isEmpty()) {
            return null;
        }

        Node<E> tmp = head;
        while (tmp.hasNext()) {
            tmp = tmp.next;
        }
        return tmp;
    }

    public boolean addFirst(E obj) {
        Node<E> node = new Node<>(obj);
        node.next = head;
        head = node;
        return true;
    }

    public boolean push(E obj) {
        return addFirst(obj);
    }

    public boolean addLast(E obj) {
        if (isEmpty()) {
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

    public boolean add(E obj, int index) {
        if (index == 0) {
            return addFirst(obj);
        }

        Node<E> tmp = head;
        Node<E> pre = null;
        for (int i = 0; i < index; i++) {
            if (tmp == null) {
                return false;
            }
            pre = tmp;
            tmp = tmp.next;
        }

        Node<E> node = new Node<>(obj);
        pre.next = node;
        node.next = tmp;
        return true;
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }

        Node<E> tmp = head;
        head = head.next;
        return tmp.getData();
    }

    public E pop() {
        return removeFirst();
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }

        Node<E> tmp = head;
        Node<E> pre = null;
        while (tmp.hasNext()) {
            pre = tmp;
            tmp = tmp.next;
        }
        pre.next = null;
        return tmp.getData();
    }

    public void printAll() {
        if (isEmpty()) {
            return;
        }

        Node<E> tmp = head;
        System.out.println(tmp.data);
        while (tmp.hasNext()) {
            tmp = tmp.next;
            System.out.println(tmp.data);
        }
    }

}

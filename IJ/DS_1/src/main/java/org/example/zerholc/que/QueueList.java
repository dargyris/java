package org.example.zerholc.que;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class QueueList<T extends Comparable<T>> implements MyQueue<T>, Iterable<T> {
    private Node<T> head;
    private int size;

    public QueueList() {
        head = null;
        size = 0;
    }

    class Node<T extends Comparable<T>> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return this.data.toString();
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    class IteratorHelper implements Iterator<T> {
        private Node<T> current;

        public IteratorHelper() {
            current = head;
        }

        @Override
        public boolean hasNext() {
            try {
                return current != null;
            } catch (NullPointerException e) {
                return false;
            }
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T obj = current.getData();
            current = current.getNext();
            return obj;
        }
    }

    public Iterator<T> iterator() {
        return new IteratorHelper();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean enqueue(T obj) {
        Node<T> node = new Node<>(obj);
        node.next = head;
        head = node;
        size++;
        return true;
    }

    public T peek() {
        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current.getData();
    }

    public T dequeue() {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            T obj = head.getData();
            head = null;
            size--;
            return obj;
        }
        Node<T> current = head;
        Node<T> prev = null;
        while (current.getNext() != null) {
            prev = current;
            current = current.getNext();
        }
        T obj = current.getData();
        prev.next = null;
        size--;
        return obj;
    }
}
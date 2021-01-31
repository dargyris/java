package org.example.a.ds.queues;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListQueue<T extends Comparable<T>> implements MyQueue<T>, Iterable<T> {
    private QueueNode<T> head;
    private int size;

    public ListQueue() {
        head = null;
        size = 0;
    }

    class QueueNode<T extends Comparable<T>> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public QueueNode<T> getNext() {
            return next;
        }

        public void setNext(QueueNode<T> next) {
            this.next = next;
        }
    }

    class IteratorHelper implements Iterator<T> {
        private QueueNode<T> current;

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

    @Override
    public Iterator<T> iterator() {
        return new IteratorHelper();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean enqueue(T obj) {
        QueueNode<T> node = new QueueNode<>(obj);
        node.next = head;
        head = node;
        size++;
        return true;
    }

    @Override
    public T peek() {
        QueueNode<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current.getData();
    }

    @Override
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
        QueueNode<T> current = head;
        QueueNode<T> prev = null;
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

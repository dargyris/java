package org.example.a.ds.stacks;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListStack<T extends Comparable<T>> implements MyStack<T>, Iterable<T> {
    private StackNode<T> head;
    private int size;

    public ListStack() {
        head = null;
        size = 0;
    }

    class StackNode<T extends Comparable<T>> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
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

        public StackNode<T> getNext() {
            return next;
        }

        public void setNext(StackNode<T> next) {
            this.next = next;
        }
    }

    class IteratorHelper implements Iterator<T> {
        private StackNode<T> current;

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
    public boolean push(T obj) {
        size++;
        if (head == null) {
            head = new StackNode<>(obj);
            return true;
        }
        StackNode<T> current = head;
        head = new StackNode<>(obj);
        head.setNext(current);
        return true;
    }

    @Override
    public T peek() {
        if (head == null) {
            return null;
        }
        return head.getData();
    }

    @Override
    public T pop() {
        if (head == null) {
            return null;
        }

        T obj = head.getData();
        head = head.getNext();
        size--;
        return obj;
    }
}

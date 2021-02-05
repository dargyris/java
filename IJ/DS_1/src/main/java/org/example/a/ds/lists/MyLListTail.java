package org.example.a.ds.lists;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLListTail<T extends Comparable<T>> implements MyList<T>, Iterable<T> {
    private ListNode<T> head;
    private ListNode<T> tail;
    private int size;

    public MyLListTail() {
        head = null;
        tail = null;
        size = 0;
    }

    class ListNode<T extends Comparable<T>> {
        private T data;
        private ListNode<T> next;

        public ListNode(T data) {
            this.data = data;
            next = null;
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

        public ListNode<T> getNext() {
            return next;
        }

        public void setNext(ListNode<T> next) {
            this.next = next;
        }

        public boolean hasNext() {
            return next != null;
        }
    }

    class IteratorHelper implements Iterator<T> {
        private ListNode<T> current;

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
        return head==null;
    }

    @Override
    public boolean addFirst(T obj) {
        ListNode<T> node = new ListNode<>(obj);
        if (head == null) {
            head = tail = node;
            size++;
            return true;
        }
        node.next = head;
        head = node;
        size++;
        return true;
    }

    @Override
    public boolean addLast(T obj) {
        if (head == null) {
            return addFirst(obj);
        }
        ListNode<T> node = new ListNode<>(obj);
        tail.next = node;
        tail = node;
        size++;
        return true;
    }

    @Override
    public boolean add(T obj, int position) {
        if (position < 0 || position > size) {
            return false;
        }
        if (position == 0) {
            return addFirst(obj);
        }
        if (position == size) {
            return addLast(obj);
        }
        ListNode<T> node = new ListNode<>(obj);
        ListNode<T> current = head;
        ListNode<T> prev = null;
        int index = 0;
        while (index < position) {
            prev = current;
            current = current.next;
            index++;
        }
        node.next = current;
        prev.next = node;
        size++;
        return true;
    }

    @Override
    public T removeFirst() {
        if (head == null) {
            return null;
        }
        T val = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
        return val;
    }

    @Override
    public T removeLast() {
        if (head == null || head == tail) {
            return removeFirst();
        }
        ListNode<T> current = head;
        ListNode<T> prev = null;
        while (current.hasNext()) {
            prev = current;
            current = current.next;
        }
        T val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    @Override
    public T remove(int position) {
        if (position < 0 || position >= size) {
            return null;
        }
        if (position == 0) {
            return removeFirst();
        }
        ListNode<T> current = head;
        ListNode<T> prev = null;
        int index = 0;
        while (index < position) {
            prev = current;
            current = current.next;
            index++;
        }
        T val = current.data;
        prev.next = current.next;
        current.next = null;
        size--;
        return val;
    }

    @Override
    public int indexOf(T obj) {
        ListNode<T> current = head;
        int index = 0;
        while (current != null) {
            if (((Comparable<T>) obj).compareTo(current.data) == 0) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public boolean contains(T obj) {
        return indexOf(obj) >= 0;
    }

    @Override
    public boolean push(T obj) {
        return addFirst(obj);
    }

    @Override
    public T pop() {
        return removeFirst();
    }

    @Override
    public T dequeue() {
        return removeLast();
    }

    @Override
    public T peekFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    @Override
    public T peekLast() {
        if (tail == null) {
            return null;
        }
        return tail.data;
    }

    @Override
    public T get(int position) {
        if (position < 0 || position >= size) {
            return null;
        }
        if (head == null) {
            return null;
        }
        int index = 0;
        ListNode<T> current = head;
        while (index < position) {
            current = current.next;
            index++;
        }
        return current.data;
    }
}

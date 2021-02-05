package org.example.a.ds.lists;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class MyLListD<T extends Comparable<T>> implements MyList<T>, Iterable<T> {
    private ListNode<T> head;
    private ListNode<T> tail;
    private int size;

    public MyLListD() {
        head = null;
        tail = null;
        size = 0;
    }

    class ListNode<T extends Comparable<T>> {
        private T data;
        private ListNode next;
        private ListNode prev;

        public ListNode(T data) {
            this.data = data;
            next = null;
            prev = null;
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

        public ListNode<T> getPrev() {
            return prev;
        }

        public void setPrev(ListNode<T> prev) {
            this.prev = prev;
        }

        public boolean hasNext() {
            return next != null;
        }

        public boolean hasPrev() {
            return prev != null;
        }
    }

    class ListIteratorHelper implements ListIterator<T> {
        private ListNode<T> first;
        private ListNode<T> last;
        T editedData;
        private int index;

        public ListIteratorHelper() {
            first = head;
            last = tail;
            editedData = null;
            index = 0;
        }

        @Override
        public boolean hasNext() {
            try {
                return first != null;
            } catch (NullPointerException e) {
                return false;
            }
        }

        @Override
        public boolean hasPrevious() {
            try {
                return last != null;
            } catch (NullPointerException e) {
                return false;
            }
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            editedData = first.getData();
            first = first.getNext();
            index++;
            return editedData;
        }

        @Override
        public T previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            editedData = first.getData();
            first = first.getPrev();
            index--;
            return editedData;
        }

        @Override
        public void remove() {
            if (editedData == null) {
                return;
            }
            ListNode<T> current = head;
            ListNode<T> prev = null;
            if (((Comparable<T>) editedData).compareTo(current.getData()) == 0) {
                prev.next = current.next;
                current.next.prev = prev;
                current.next = current.prev = null;
                size--;
            }
            while (current.hasNext()) {
                prev = current;
                current = current.next;
                if (((Comparable<T>) editedData).compareTo(current.getData()) == 0) {
                    prev.next = current.next;
                    current.next.prev = prev;
                    current.next = current.prev = null;
                    size--;
                }            }
        }

        @Override
        public int nextIndex() {
            if (!first.hasNext()) {
                return size;
            }
            return index + 1;
        }

        @Override
        public int previousIndex() {
            if (!first.hasPrev()) {
                return 0;
            }
            return index - 1;
        }

        @Override
        public void set(T obj) {
            if (editedData == null) {
                return;
            }
            ListNode<T> current = head;
            ListNode<T> prev = null;
            if (((Comparable<T>) editedData).compareTo(current.getData()) == 0) {
                current.setData(obj);
            }
            while (current.hasNext()) {
                prev = current;
                current = current.next;
                if (((Comparable<T>) editedData).compareTo(current.getData()) == 0) {
                    current.setData(obj);
                }}
        }

        @Override
        public void add(T obj) {
            ListNode<T> node = new ListNode<>(obj);
            if (head == null) {
                head = tail = node;
                size++;
            }
            node.next = head;
            head = node;
            size++;
        }
    }

    @Override
    public ListIterator<T> iterator() {
        return new ListIteratorHelper();
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
    public boolean addFirst(T obj) {
        ListNode<T> node = new ListNode<>(obj);
        if (head == null) {
            head = tail = node;
            size++;
            return true;
        }
        node.next = head;
        head.prev = node;
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
        node.prev = tail;
        tail.next = node;
        tail = node;
        size++;
        return true;
    }

    @Override
    public boolean add(T obj, int position) {
        if (position < 0 || position >= size) {
            return false;
        }
        if (position == 0) {
            return addFirst(obj);
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
        node.prev = prev;
        current.prev = node;
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
        T val = tail.data;
        tail = tail.prev;
        tail.next = null;
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
        current.next.prev = prev;
        current.next = current.prev = null;
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

package org.example.a.ds.lists;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyAList<T> implements MyList<T>, Iterable<T> {
    private T[] array;

    public MyAList() {
        array = (T[]) new Object[10];
    }

    public MyAList(int capacity) {
        array = capacity <= 10 ? (T[]) new Object[10] : (T[]) new Object[capacity];
    }

    class IteratorHelper implements Iterator<T> {
        private int index;

        public IteratorHelper() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            try {
                return index < size();
            } catch (NullPointerException e) {
                return false;
            }
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return array[index++];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorHelper();
    }

    @Override
    public int size() {
        int index = 0;
        while (array[index] != null) {
            index++;
        }
        return index;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    private boolean arrayDouble() {
        int capacity = array.length;
        if (size() > 2 * capacity / 3) {
            T[] newArray = (T[]) new Object[capacity * 2];
            System.arraycopy(array, 0, newArray, 0, capacity);
            array = newArray;
            return true;
        }
        return false;
    }

    private boolean arrayReduce() {
        int capacity = array.length;
        int size = size();
        if (size < capacity / 4 && size >= 10) {
            T[] newArray = (T[]) new Object[capacity / 2];
            System.arraycopy(array, 0, newArray, 0, newArray.length);
            array = newArray;
            return true;
        }
        return false;
    }

    @Override
    public boolean addFirst(T obj) {
        int index = size();
        while (index >= 0) {
            array[index + 1] = array[index];
            index--;
        }
        arrayDouble();
        array[0] = obj;
        return true;
    }

    @Override
    public boolean addLast(T obj) {
        array[size()] = obj;
        arrayDouble();
        return true;
    }

    @Override
    public boolean add(T obj, int position) {
        if (position < 0 || position > size()) {
            return false;
        }

        int index = size() - 1;
        while (index >= position) {
            array[index + 1] = array[index];
            index--;
        }
        array[position] = obj;
        arrayDouble();
        return true;
    }

    @Override
    public T removeFirst() {
        try {
            int index = 0;
            T obj = array[0];
            while (index < size()) {
                array[index] = array[index + 1];
                index++;
            }
            arrayReduce();
            return obj;
        } catch (NullPointerException e) {
            return null;
        }
    }

    @Override
    public T removeLast() {
        try {
            int index = size() - 1;
            T obj = array[index];
            array[index] = null;
            arrayReduce();
            return obj;
        } catch (NullPointerException e) {
            return null;
        }
    }

    @Override
    public T remove(int position) {
        if (position < 0 || position >= size()) {
            return null;
        }
        T obj = array[position];
        int index = position;
        while (index < size()) {
            array[index] = array[index + 1];
            index++;
        }
        arrayReduce();
        return obj;
    }

    @Override
    public int indexOf(T obj) {
        int index = 0;
        while (index < size()) {
            if (((Comparable<T>) obj).compareTo(array[index]) == 0) {
                return index;
            }
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
        try {
            return array[0];
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    @Override
    public T peekLast() {
        try {
            return array[size() - 1];
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    @Override
    public T get(int position) {
        if (position < 0 || position >= size()) {
            return null;
        }
        return array[position];
    }
}

package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class AList<T> implements Iterable<T> {
    private T[] array;

    public AList() {
        array = (T[]) new Object[10];
    }

    public AList(int capacity) {
        if (capacity <= 10) {
            array = (T[]) new Object[10];
        } else {
            array = (T[]) new Object[capacity];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorHelper();
    }

    class IteratorHelper implements Iterator<T> {
        private int index;

        public IteratorHelper() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            try {
                if (array[index] != null) {
                    return true;
                }
                return false;
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

    private void swap(int i, int j) {
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("size / capacity: " + size() + '/' + array.length + "\n{  ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                s.append("****  ");
            } else {
                s.append("NULL  ");
            }
        }
        s.append("}");
        return s.toString();
    }

    private int size() {
        int index = 0;
        while (array[index] != null) {
            index++;
        }
        return index;
    }

    private boolean arrayDouble() {
        if (size() > (2 * array.length) / 3) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
            return true;
        }
        return false;
    }

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

    public boolean addLast(T obj) {
        int index = size();
        array[index] = obj;
        arrayDouble();
        return true;
    }

    public boolean add(T obj, int position) {
        if (position < 0 || position >= size()) {
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

    private boolean arrayReduce() {
        if (size() < array.length / 2) {
            T[] newArray = (T[]) new Object[array.length / 2];
            System.arraycopy(array, 0, newArray, 0, newArray.length);
            array = newArray;
            return true;
        }
        return false;
    }

    public T removeFirst() {
        try {
            int index = 0;
            T val = array[0];
            while (index < size()) {
                array[index] = array[index + 1];
                index++;
            }
            arrayReduce();
            return val;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public T removeLast() {
        try {
            int index = size() - 1;
            T val = array[index];
            array[index] = null;
            arrayReduce();
            return val;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public T remove(int position) {
        if (position < 0 || position >= size()) {
            return null;
        }

        T val = array[position];
        int index = position;
        while (index < size()) {
            array[index] = array[index + 1];
            index++;
        }
        arrayReduce();
        return val;
    }

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

    public boolean contains(T obj) {
        return indexOf(obj) >= 0;
    }

    public boolean push(T obj) {
        return addFirst(obj);
    }

    public T pop() {
        return removeFirst();
    }

    public T dequeue() {
        return removeLast();
    }

    public T peekFirst() {
        try {
            return array[0];
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public T peekLast() {
        try {
            return array[size() - 1];
        } catch (NoSuchElementException e) {
            return null;
        }
    }
}

package org.example.bor;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<T> implements MyList_I<T>, Iterable<T> {
    private T[] array;

    public MyArrayList() {
        array = (T[]) new Object[10];
    }

    public MyArrayList(int capacity) {
        array = capacity < 10 ? (T[]) new Object[10] : (T[]) new Object[capacity];
    }

    class IteratorHelper implements Iterator<T> {
        private int index;

        public IteratorHelper() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            try {
                return array[index] != null;
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
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("size / capacity: " + size() + '/' + array.length + "\n{ ");
        for (T element : array) {
            s.append(element == null ? "NULL  " : "****  ");
        }
        s.append("}");
        return s.toString();
    }

    private boolean arrayDouble() {
        if (size() > 2 * array.length / 3) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
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
        int index = size();
        array[index] = obj;
        arrayDouble();
        return true;
    }

    @Override
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

    @Override
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

    @Override
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

    @Override
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
        } catch (NoSuchElementException | ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }
}

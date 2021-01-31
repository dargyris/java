package org.example.a.ds.queues;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayLastQueue<T> implements MyQueue<T>, Iterable<T> {
    private T[] array;
    private int size;

    public ArrayLastQueue() {
        array = (T[]) new Object[10];
        size = 0;
    }

    public ArrayLastQueue(int capacity) {
        array = capacity <= 10 ? (T[]) new Object[10] : (T[]) new Object[capacity];
        size = 0;
    }

    class IteratorHelper implements Iterator<T> {
        private int index;

        public IteratorHelper() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            try {
                return index < size;
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
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private boolean arrayDouble() {
        int capacity = array.length;
        if (size > 2 * capacity / 3) {
            T[] newArray = (T[]) new Object[capacity * 2];
            System.arraycopy(array, 0, newArray, 0, capacity);
            array = newArray;
            return true;
        }
        return false;
    }

    private boolean arrayReduce() {
        int capacity = array.length;
        if (size < capacity / 4 && size >= 10) {
            T[] newArray = (T[]) new Object[capacity / 2];
            System.arraycopy(array,0,newArray,0,newArray.length);
            array = newArray;
            return true;
        }
        return false;
    }

    @Override
    public boolean enqueue(T obj) {
        arrayDouble();
        array[size] = obj;
        size++;
        return true;
    }

    @Override
    public T peek() {
        try {
            return array[0];
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    @Override
    public T dequeue() {
        try {
            arrayReduce();
            T obj = array[0];
            int index = 0;
            while (index < size - 1) {
                array[index] = array[index + 1];
                index++;
            }
            size--;
            return obj;
        } catch (NullPointerException e) {
            return null;
        }
    }
}

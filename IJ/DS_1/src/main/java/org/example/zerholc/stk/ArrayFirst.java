package org.example.zerholc.stk.arrayFirst;

import java.util.NoSuchElementException;

public class ArrayFirst<T> {
    private T[] array;
    private int size;

    public ArrayFirst() {
        array = (T[]) new Object[10];
        size = 0;
    }

    public ArrayFirst(int capacity) {
        array = capacity <= 10 ? (T[]) new Object[10] : (T[]) new Object[capacity];
        size = 0;
    }

    private boolean arrayDouble() {
        if (size > 2 * array.length / 3) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
            return true;
        }
        return false;
    }

    private boolean arrayReduce() {
        if (size < array.length / 4) {
            T[] newArray = (T[]) new Object[array.length / 2];
            System.arraycopy(array, 0, newArray, 0, newArray.length);
            array = newArray;
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean push(T obj) {
        int index = size();
        while (index >= 0) {
            array[index + 1] = array[index];
            index--;
        }
        arrayDouble();
        array[0] = obj;
        size++;
        return true;
    }


    public T peek() {
        try {
            return array[0];
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public T pop() {
        try {
            int index = 0;
            T obj = array[0];
            while (index < size) {
                array[index] = array[index + 1];
                index++;
            }
            arrayReduce();
            size--;
            return obj;
        } catch (NullPointerException e) {
            return null;
        }
    }

}

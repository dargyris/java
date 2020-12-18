package com.example;

import java.util.*;

public class PArrayList<T> extends AbstractList {
    private Employee[] array;
    private int size;

    public PArrayList() {
        array = new Employee[10];
        size = 0;
    }

    public PArrayList(int capacity) {
        if (capacity < 10) {
            array = new Employee[10];
        } else {
            array = new Employee[capacity];
        }
        size = 0;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public int size() {
        return size;
    }

    public Object set(Employee e, int index) {
        if (index < 0 || index >= size) {
            throw new NoSuchElementException();
        }

        Object temp = array[index];
        array[index] = e;
        return temp;
    }

    public boolean add(Employee e) {
        if (array.length == size) {
            Object[] oldArray = array;
            array = new Employee[2 * array.length];
            System.arraycopy(oldArray, 0, array, 0, oldArray.length);
        }

        array[size++] = e;
        return true;
    }

    public boolean add(Employee e, int index) {
        if (index < 0 || index >= size) {
            throw new NoSuchElementException();
        }

        if (array.length == size) {
            Object[] oldArray = array;
            array = new Employee[2 * array.length];
            System.arraycopy(oldArray, 0, array, 0, oldArray.length);
        }

        Employee temp = array[index];
        array[index] = e;
        size++;
        for (int i = index + 1; i < size; i++) {
            Employee next = array[i];
            array[i] = temp;
            temp = next;
        }
        return true;
    }

    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new NoSuchElementException();
        }

        Employee removed = array[index];

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;

        return removed;
    }

    public boolean contains(Employee employee) {
        for (Employee e: array) {
            if (employee.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Employee employee) {
        for (int i = 0; i < size; i++) {
            if (employee.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

}

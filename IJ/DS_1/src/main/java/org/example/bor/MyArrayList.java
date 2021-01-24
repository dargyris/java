//package org.example.r;
//
//import java.util.Iterator;
//import java.util.NoSuchElementException;
//
//public class MyArrayList<T extends Comparable<T>> implements MyList_I<T>, Iterable<T> {
//    private T[] array;
//
//    public MyArrayList() {
//        array = (T[]) new Object[10];
//    }
//
//    public MyArrayList(int capacity) {
//        array = capacity < 10 ? (T[]) new Object[10] : (T[]) new Object[capacity];
//    }
//
//    class IteratorHelper implements Iterator<T> {
//        private int index;
//
//        public IteratorHelper() {
//            index = 0;
//        }
//
//        @Override
//        public boolean hasNext() {
//            try {
//                return array[index] != null;
//            } catch (NullPointerException e) {
//                return false;
//            }
//        }
//
//        @Override
//        public T next() {
//            if (!hasNext()) {
//                throw new NoSuchElementException();
//            }
//
//            return array[index++];
//        }
//    }
//
//    @Override
//    public Iterator<T> iterator() {
//        return new IteratorHelper();
//    }
//
//    @Override
//    public int size() {
//        int index = 0;
//        while (array[index] != null) {
//            index++;
//        }
//        return index;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder s = new StringBuilder();
//        s.append("size / capacity: " + size() + '/' + array.length + "\n{ ");
//        for (T element : array) {
//            s.append(element == null ? "NULL  " : "****  ");
//        }
//        s.append("}");
//        return s.toString();
//    }
//}

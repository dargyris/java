package org.example.a._iterable;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterableStringClass implements Iterable<Character> {
    private String str;

    public IterableStringClass(String str) {
        this.str = str;
    }

    // =============== Implement Iterator ================
    class IteratorHelper implements Iterator<Character> {
        private int index;

        public IteratorHelper() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            try {
                return index < str.length();
            } catch (NullPointerException e) {
                return false;
            }
        }

        @Override
        public Character next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return Character.valueOf(str.charAt(index++));
        }
    }

    // =============== Implement Iterable ================
    public Iterator<Character> iterator() {
        return new IteratorHelper();
    }

    public static void main(String[] args) {
        IterableStringClass s = new IterableStringClass("Testing.");
        printForEach(s);
        printForEach(s);
        printFor(s);
        printFor(s);
    }

    public static void printForEach(IterableStringClass s) {
        s.forEach(ch -> System.out.print(ch + " "));
        System.out.println("\n*\t*\t*\t*\t*\t*");
    }

    public static void printFor(IterableStringClass s) {
        for (char ch : s) {
            System.out.print(ch + " ");
        }
        System.out.println("\n*\t*\t*\t*\t*\t*");
    }
}

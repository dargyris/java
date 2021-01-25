package org.example.a._iterable;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterableString implements Iterable<Character>, Iterator<Character> {
    private String str;
    private int count;

    public IterableString(String str) {
        this.str = str;
        count = 0;
    }

    // =============== Implement Iterator ================
    public boolean hasNext() {
        if (count < str.length()) {
            return true;
        }
        return false;
    }

    public Character next() {
        if (count == str.length()) {
            throw new NoSuchElementException();
        }
        count++;
        return str.charAt(count - 1);
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public void reset() {
        count = 0;
    }

    // =============== Implement Iterable ================
    public Iterator<Character> iterator() {
        return this;
    }

    public static void main(String[] args) {
        IterableString s = new IterableString("Testing.");
        printForEach(s);
        s.reset();
        printForEach(s);
        s.reset();
        printFor(s);
        s.reset();
        printFor(s);
    }

    public static void printForEach(IterableString s) {
        s.forEach(ch -> System.out.print(ch + " "));
        System.out.println("\n*\t*\t*\t*\t*\t*");
    }
    public static void printFor(IterableString s) {
        for (char ch : s) {
            System.out.print(ch + " ");
        }
        System.out.println("\n*\t*\t*\t*\t*\t*");
    }
}

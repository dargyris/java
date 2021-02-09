package org.example.a.ds.maps;

import java.util.NoSuchElementException;

public class HashChainInt {
    private HashItem[] hashTable;

    public HashChainInt() {
        this.hashTable = new HashItem[10];
    }

    public HashChainInt(int capacity) {
        this.hashTable = capacity <= 10 ? new HashItem[10] : new HashItem[capacity];
    }

    class HashItem {
        private HashItem next;
        private int key;
        private int value;

        public HashItem(int key, int value) {
            next = null;
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public HashItem getNext() {
            return next;
        }

        public void setNext(HashItem next) {
            this.next = next;
        }
    }

    private int hash(int key) {
//        return key % hashTable.length;
        return 1;
    }

    public void put(int key, int value) {
        //Calculate hash array index
        int index = hash(key);
        if (hashTable[index] == null) {
            hashTable[index] = new HashItem(key, value);
        } else { //Collision
            System.out.println("Collision!");
            HashItem current = hashTable[index];
            while (current.next != null) {
                current = current.next;
            }
            current.setNext(new HashItem(key, value));
        }
    }

    public int get(int key) {
        int index = hash(key);
        if (hashTable[index] == null) {
            throw new NoSuchElementException();
        }
        HashItem current = hashTable[index];
        while (current != null && current.getKey() != key) {
            current = current.getNext();
        }
        if (current == null) {
            throw new NoSuchElementException();
        }
        return current.getValue();
    }
}

package com.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ChainHash<K,V> {
    class HashElement<K,V> implements Comparable<HashElement<K, V>> {
        K key;
        V value;
        public HashElement(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public int compareTo(HashElement<K,V> o) {
            return (((Comparable<K>)this.key).compareTo(o.key));
        }
    }

    class IteratorHelper<T> implements Iterator<T> {
        T[] keys;
        int position;

        public IteratorHelper() {
            keys = (T[]) new Object[numElements];
            int p = 0;
            for (int i = 0; i < tableSize; i++) {
                List<HashElement<K, V>> list = harray[i];
                for (HashElement<K, V> h : list) {
                    keys[p++] = (T)h.key;
                }
            }
            position = 0;
        }

        public boolean hasNext() {
            return position < keys.length;
        }

        public T next() {
            if (!hasNext()) {
                return null;
            }
            return keys[position++];
        }

    }


    int numElements;
    int tableSize;
    double maxLoadFactor;
    List<HashElement<K, V>>[] harray;

    public ChainHash(int tableSize) {
        this.tableSize = tableSize;
        harray = (LinkedList<HashElement<K, V>>[]) new LinkedList[tableSize];
        for (int i = 0; i < tableSize; i++) {
            harray[i] = new LinkedList<HashElement<K, V>>();
        }
        maxLoadFactor = 0.75;
        numElements = 0;
    }

    private double loadFactor() {
        return (double) numElements / (double) tableSize;
    }

    public V getValue(K key) {
        int hashVal = key.hashCode();
        hashVal = hashVal&0x7FFFFFFF;
        hashVal = hashVal%tableSize;
        for (HashElement<K, V> he : harray[hashVal]) {
            if (((Comparable<K>)key).compareTo(he.key) == 0) {
                return he.value;
            }
        }
        return null;
    }

    private void resize(int newSize) {
        LinkedList<HashElement<K, V>>[] newArray = (LinkedList<HashElement<K, V>>[]) new LinkedList[newSize];
        for (int i = 0; i < newSize; i++) {
            newArray[i] = new LinkedList<HashElement<K, V>>();
        }
        for (K key : harray.) {
            V val = getValue(key);
            HashElement<K, V> he = new HashElement<>(key, val);
            int hashVal = (key.hashCode()&0x7FFFFFFF)%newSize;
            newArray[hashVal].add(he);
        }
        harray = newArray;
        tableSize = newSize;
    }

    public boolean add(K key, V value) {
        if (loadFactor() > maxLoadFactor) {
            resize(tableSize * 2);
        }
        HashElement<K, V> he = new HashElement(key, value);
        int hashVal = key.hashCode();
        hashVal = hashVal&0x7FFFFFFF;
        hashVal = hashVal%tableSize;
        harray[hashVal].add(he);
        numElements++;
        return true;
    }
}

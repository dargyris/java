package org.example.a.ds.priorityQueue;

public interface MyPriorityQueue<K extends Comparable<K>, V> {
    void add(K priority, V data);
    V peek();
    V poll();
}

package org.example.a.ds.priorityQueue;

public class MyIntHeap {
    private int[] heap;
    private int heapSize;

    public MyIntHeap() {
        heap = new int[10];
        heapSize = 0;
    }

    public MyIntHeap(int capacity) {
        heap = capacity <= 10 ? new int[10] : new int[capacity];
        heapSize = 0;
    }

    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    private boolean isHeapFull() {
        return heapSize == heap.length;
    }

    public void insert(int item) {
        if (isHeapFull()) {
            throw new RuntimeException("Heap is full.");
        }
        heap[heapSize] = item;
        heapSize++;
        fixUp(heapSize - 1);
    }

    private void fixUp(int index) {
        int parentIndex = (index - 1) / 2;
        if (index > 0 && heap[index] > heap[parentIndex]) {
            swap(index, parentIndex);
            fixUp(parentIndex);
        }
    }

    //peek()
    public int getMax() {
        return heap[0];
    }

    public int poll() {
        int max = getMax();
        swap(0, heapSize - 1);
        heapSize--;
        fixDown(0);
        return max;
    }

    private void fixDown(int index) {
        int indexLeft = 2 * index + 1;
        int indexRight = 2 * index + 2;
        int indexLargest = index;
        if (indexLeft < heapSize && heap[indexLeft] > heap[indexLargest]) {
            indexLargest = indexLeft;
        }
        if (indexRight < heapSize && heap[indexRight] > heap[indexLargest]) {
            indexLargest = indexRight;
        }
        if (index != indexLargest) {
            swap(index, indexLargest);
            fixDown(indexLargest);
        }
    }

    public void heapSort() {
        int size = heapSize;
        for (int i = 0; i < size; ++i) {
            int max = poll();
            System.out.print(max + " ");
        }
    }
}

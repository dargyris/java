package org.example;

public class MyStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long j) {
        top++;
        stackArray[top] = j;
    }

    public long pop() {
        int oldTop = top;
        top--;
        return stackArray[oldTop];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }
}

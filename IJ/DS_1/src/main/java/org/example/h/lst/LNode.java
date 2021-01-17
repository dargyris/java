package org.example.Hlists;

public class LNode<T extends Comparable<T>> {
    private T data;
    private LNode<T> nextNode;


    public LNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(LNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
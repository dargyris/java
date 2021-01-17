package org.example.Hbst;

public class TNode<T> {
    private T data;
    private TNode<T> left;
    private TNode<T> right;

    public TNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TNode<T> getLeft() {
        return left;
    }

    public void setLeft(TNode<T> left) {
        this.left = left;
    }

    public TNode<T> getRight() {
        return right;
    }

    public void setRight(TNode<T> right) {
        this.right = right;
    }
}

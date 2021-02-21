package org.example.b.ds.bst;

public class TreeNode<T extends Comparable<T>> {
    private T data;
    private TreeNode<T> right;
    private TreeNode<T> left;

    public TreeNode(T data) {
        this.data = data;
        left = right = null;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }
}

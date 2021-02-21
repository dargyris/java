package org.example.b.ds.bst;

public class BstHelpers<T extends Comparable<T>> implements Tree<T> {
    private TreeNode<T> root;

    @Override
    public TreeNode<T> getRoot() {
        return root;
    }

    @Override
    public void insert(T data) {
        if (root == null) {
            root = new TreeNode<>(data);
        } else {
            insertHelper(root, data);
        }
    }

    private void insertHelper(TreeNode<T> node, T data) {
        if (data.compareTo(node.getData()) < 0) {
            if (node.getLeft() == null) {
                node.setLeft(new TreeNode<>(data));
            } else {
                insertHelper(node.getLeft(), data);
            }
        } else {
            if (node.getRight() == null) {
                node.setRight(new TreeNode<>(data));
            } else {
                insertHelper(node.getRight(), data);
            }
        }
    }

    @Override
    public T getMax() {
        if (root == null) {
            return null;
        }
        return getMaxRecursive(root).getData();
    }

    private TreeNode<T> getMaxWhile(TreeNode<T> node) {
        while (node.getRight() != null) {
            node = node.getRight();
        }
        return node;
    }

    private TreeNode<T> getMaxRecursive(TreeNode<T> node) {
        if (node.getRight() != null) {
            return getMaxRecursive(node.getRight());
        }
        return node;
    }

    @Override
    public T getMin() {
        if (root == null) {
            return null;
        }
        return getMinRecursive(root).getData();
    }

    private TreeNode<T> getMinWhile(TreeNode<T> node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

    private TreeNode<T> getMinRecursive(TreeNode<T> node) {
        if (node.getLeft() != null) {
            return getMinRecursive(node.getLeft());
        }
        return node;
    }

    @Override
    public void preOrderTraversal() {

    }

    @Override
    public void inOrderTraversal() {
        if (root != null) {
            inOrderTraversalHelper(root);
        }
    }

    private void inOrderTraversalHelper(TreeNode<T> node) {
        if (node.getLeft() != null) {
            inOrderTraversalHelper(node.getLeft());
        }
        System.out.println(node + " | ");
        if (node.getRight() != null) {
            inOrderTraversalHelper(node.getRight());
        }
    }

    @Override
    public void postOrderTraversal() {

    }

    @Override
    public void delete(T data) {

    }
}

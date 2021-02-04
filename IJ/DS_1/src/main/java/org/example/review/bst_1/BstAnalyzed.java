package org.example.review.bst_1;

public class BstAnalyzed<T extends Comparable<T>> implements MyTree<T> {
    private TreeNode<T> root;

    @Override
    public void insert(T data) {
        if (root == null) {
            root = new TreeNode<>(data);
            return;
        }
        insertIfRootExists(root, data);
    }

    private void insertIfRootExists(TreeNode<T> node, T data) {
        if (data.compareTo(node.getData()) < 0) {
            if (node.getLeft() == null) {
                node.setLeft(new TreeNode<>(data));
                return;
            }
            insertIfRootExists(node.getLeft(), data);
            return;
        }

        if (node.getRight() == null) {
            node.setRight(new TreeNode<>(data));
            return;
        }
        insertIfRootExists(node.getRight(), data);
        return;
    }

    @Override
    public T getMax() {
        if (root == null) {
            return null;
        }
        return getRightmostLeaf(root).getData();
    }

    private TreeNode<T> getRightmostLeaf(TreeNode<T> node) {
        if (node.getRight() != null) {
            return getRightmostLeaf(node.getRight());
        }
        return node;
    }

    @Override
    public T getMin() {
        if (root == null) {
            return null;
        }
        return getLeftmostLeaf(root).getData();
    }

    private TreeNode<T> getLeftmostLeaf(TreeNode<T> node) {
        if (node.getLeft() != null) {
            return getLeftmostLeaf(node.getLeft());
        }
        return node;
    }

    @Override
    public void inOrderTraversal() {
        if (root != null) {
            inOrderTraversalHelper(root);
        }
        System.out.println();
    }

    private void inOrderTraversalHelper(TreeNode<T> node) {
        if (node.getLeft() != null) {
            inOrderTraversalHelper(node.getLeft());
        }
        System.out.println(node + " --> ");
        if (node.getRight() != null) {
            inOrderTraversalHelper(node.getRight());
        }
    }

    @Override
    public void delete(T data) {
        if (root != null) {
            root = deleteHelper(root, data);
        }
    }

    private TreeNode<T> deleteHelper(TreeNode<T> node, T data) {
        return node;
    }
}

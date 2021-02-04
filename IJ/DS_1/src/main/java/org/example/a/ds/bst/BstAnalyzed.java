package org.example.a.ds.bst;

public class BstAnalyzed<T extends Comparable<T>> implements MyTree<T> {
    private TreeNode<T> root;

    public TreeNode<T> getRoot() {
        return this.root;
    }

    @Override
    public void insert(T data) {
        if (root == null) {
            root = new TreeNode<>(data);
            return;
        }
        insertIfRootExists(data, root);
    }

    private void insertIfRootExists(T data, TreeNode<T> node) {
        if (data.compareTo(node.getData()) < 0) {
            if (node.getLeft() == null) {
                node.setLeft(new TreeNode<>(data));
                return;
            }
            insertIfRootExists(data, node.getLeft());
            return;
        }

        if (node.getRight() == null) {
            node.setRight(new TreeNode<>(data));
            return;
        }
        insertIfRootExists(data, node.getRight());
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

//    private TreeNode<T> getRightmostLeaf(TreeNode<T> node) {
//        while (node.getRight() != null) {
//            node = node.getRight();
//            System.out.print("*");
//        }
//        return node;
//    }

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

//    private TreeNode<T> getLeftmostLeaf(TreeNode<T> node) {
//        while (node.getLeft() != null) {
//            node = node.getLeft();
//            System.out.print("*");
//        }
//        return node;
//    }

    @Override
    public void delete(T data) {
        if (root != null) {
            root = deleteHelper(root, data);
        }
    }

    private TreeNode<T> deleteHelper(TreeNode<T> node, T data) {
        if (node == null) {
            return null;
        }

        if (data.compareTo(node.getData()) < 0) {
            node.setLeft(deleteHelper(node.getLeft(), data));
            return node;
        }

        if (data.compareTo(node.getData()) > 0) {
            node.setRight(deleteHelper(node.getRight(), data));
            return node;
        }

        if (node.getLeft() == null && node.getRight() == null) {
            return null;
        }

        if (node.getLeft() == null) {
            TreeNode<T> temp = node.getRight();
            node = null;
            return temp;
        }

        if (node.getRight() == null) {
            TreeNode<T> temp = node.getRight();
            node = null;
            return temp;
        }

        TreeNode<T> predecessor = getPredecessor(node.getLeft());
        node.setData(predecessor.getData());
        node.setLeft(deleteHelper(node.getLeft(), predecessor.getData()));
        return node;
    }

    private TreeNode<T> getPredecessor(TreeNode<T> node) {
        if (node.getRight() != null) {
            return getPredecessor(node.getRight());
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
        System.out.print(node + " --> ");
        if (node.getRight() != null) {
            inOrderTraversalHelper(node.getRight());
        }
    }
}

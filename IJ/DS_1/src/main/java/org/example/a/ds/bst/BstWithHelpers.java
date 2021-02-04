package org.example.a.ds.bst;

public class BstWithHelpers<T extends Comparable<T>> implements MyTree<T> {
    private TreeNode<T> root;

    public TreeNode<T> getRoot() {
        return this.root;
    }

    @Override
    public void insert(T data) {
        if (root == null) {
            root = new TreeNode<>(data);
        } else {
            insertIfRootExists(data, root);
        }
    }

    private void insertIfRootExists(T data, TreeNode<T> node) {
        if (data.compareTo(node.getData()) < 0) {
            if (node.getLeft() != null) {
                insertIfRootExists(data, node.getLeft());
            } else {
                node.setLeft(new TreeNode<>(data));
            }
        } else {
            if (node.getRight() != null) {
                insertIfRootExists(data, node.getRight());
            } else {
                node.setRight(new TreeNode<>(data));
            }
        }
    }

    @Override
    public T getMax() {
        if (root == null) {
            return null;
        }
        return getRightmostLeaf(root);
    }

    private T getRightmostLeaf(TreeNode<T> node) {
        if (node.getRight() != null) {
            return getRightmostLeaf(node.getRight());
        }
        return node.getData();
    }

    @Override
    public T getMin() {
        if (root == null) {
            return null;
        }
        return getLeftmostLeaf(root);
    }

    private T getLeftmostLeaf(TreeNode<T> node) {
        if (node.getLeft() != null) {
            return getLeftmostLeaf(node.getLeft());
        }
        return node.getData();
    }

    @Override
    public void delete(T data) {
        if (root != null) {
            root = deleteHelper(root, data);
        }
    }

    private TreeNode<T> deleteHelper(TreeNode<T> node, T data) {
        if (node == null) {
            return node;
        }
        //Leaf node
        if (data.compareTo(node.getData()) < 0) {
            node.setLeft(deleteHelper(node.getLeft(), data));
        } else if (data.compareTo(node.getData()) > 0) {
            node.setRight(deleteHelper(node.getRight(), data));
        } else {
            //Single child
            //I found the node I want to remove
            if (node.getLeft() == null && node.getRight() == null) {
                return null;
            }
            if (node.getLeft() == null) {
                TreeNode<T> temp = node.getRight();
                node = null;
                return temp;
            } else if (node.getRight() == null) {
                TreeNode<T> temp = node.getLeft();
                node = null;
                return temp;
            }
            TreeNode<T> temp = getPredecessor(node.getLeft());
            node.setData(temp.getData());
            node.setLeft(deleteHelper(node.getLeft(), temp.getData()));
        }
        return node;
    }

    //Getting the max item from the left subtree: predecessor
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

package org.example.zerholc.bst;

public class BST<T extends Comparable<T>> implements ITree<T> {
    private TreeNode<T> root;

    @Override
    public void insert(T data) {
        if (root == null) {
            root = new TreeNode<>(data);
        } else {
            insertNode(data, root);
        }
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
        System.out.print(node + " --> ");
        if (node.getRight() != null) {
            inOrderTraversalHelper(node.getRight());
        }
    }

//@Override
//    public void insertNode(T data, TreeNode<T> node) {
//        if (((Comparable<T>) data).compareTo(node.getData()) < 0) {
//
//        }
//    }


    private void insertNode(T data, TreeNode<T> node) {
        if (data.compareTo(node.getData()) < 0) {
            if (node.getLeft() != null) {
                insertNode(data, node.getLeft());
            } else {
                node.setLeft(new TreeNode<>(data));
            }
        } else {
            if (node.getRight() != null) {
                insertNode(data, node.getRight());
            } else {
                node.setRight(new TreeNode<>(data));
            }
        }
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
                System.out.println("Removing leaf node...");
                return null;
            }
            if (node.getLeft() == null) {
                System.out.println("Removing single right child...");
                TreeNode<T> temp = node.getRight();
                node = null;
                return temp;
            } else if (node.getRight() == null) {
                System.out.println("Removing single left child...");
                TreeNode<T> temp = node.getLeft();
                node = null;
                return temp;
            }
            System.out.println("Removing item with two children.");
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
        System.out.println("Predecessor: " + node);
        return node;
    }

    @Override
    public T getMaxValue() {
        if (root == null) {
            return null;
        }
        return getMax(root);
    }

    private T getMax(TreeNode<T> node) {
        if (node.getRight() != null) {
            return getMax(node.getRight());
        }
        return node.getData();
    }

    @Override
    public T getMinValue() {
        if (root == null) {
            return null;
        }
        return getMin(root);
    }

    private T getMin(TreeNode<T> node) {
        if (node.getLeft() != null) {
            return getMin(node.getLeft());
        }
        return node.getData();
    }
}

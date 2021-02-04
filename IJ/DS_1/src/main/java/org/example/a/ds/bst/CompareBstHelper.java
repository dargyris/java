package org.example.a.ds.bst;

public class CompareBstHelper<T extends Comparable<T>> {
    public boolean areTreesEqual(TreeNode<T> node1, TreeNode<T> node2) {
        if (node1 == null || node2 == null) {
            return node1 == node2;
        }

        if (node1.getData().compareTo(node2.getData()) != 0) {
            return false;
        }

        return areTreesEqual(node1.getLeft(), node2.getLeft()) && areTreesEqual(node1.getRight(), node2.getRight());
    }
}

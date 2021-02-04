package org.example.a.ds.bst;

//  k-th smallest or largest item in a bst. In-place algo.

public class Questions<T extends Comparable<T>> {
    public boolean areTreesEqual(TreeNode<T> node1, TreeNode<T> node2) {
        if (node1 == null || node2 == null) {
            return node1 == node2;
        }

        if (node1.getData().compareTo(node2.getData()) != 0) {
            return false;
        }

        return areTreesEqual(node1.getLeft(), node2.getLeft()) && areTreesEqual(node1.getRight(), node2.getRight());
    }

    // =============================================================================================================
    public TreeNode<T> getKthSmallestItem(TreeNode<T> node, int k) {
        int n = treeSize(node.getLeft())+1;
        if (n == k) {
            return node;
        }

        if (n > k) {
            return getKthSmallestItem(node.getLeft(), k);
        }

        if (n < k) {
            return getKthSmallestItem(node.getRight(), k - n);
        }

        return null;
    }

    public int treeSize(TreeNode<T> node) {
        if (node == null) {
            return 0;
        }
        return treeSize(node.getLeft()) + treeSize(node.getRight()) + 1;
    }
    // =============================================================================================================

    // Post order traversal to sum from leaves up
    public int sumNodes(TreeNode<T> node) {
        System.out.println("Processing node: " + node);
        int sum = 0;
        int leftSum = 0;
        int rightSum = 0;

        if (node == null) {
            return 0;
        }
        leftSum = sumNodes(node.getLeft());
        rightSum = sumNodes(node.getRight());

        System.out.println("Processing node: " + node + ". Total so far: " + (((Person) node.getData()).getAge() + leftSum + rightSum));
        sum = ((Person) node.getData()).getAge() + leftSum + rightSum;
        return sum;
    }
}

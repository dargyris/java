package org.example.a.ds.bst;

import java.util.Stack;

public class StackTraversal<T> {
    class Node<T> {
        T data;
        Node left, right;

        public Node(T data) {
            this.data = data;
            left = right = null;
        }
    }

    class BST {
        Node root;

        void inOrderTraversal() {
            if (root == null) {
                return;
            }

            Stack<Node> stack = new Stack<>();
            Node current = root;
            while (current != null || stack.size() > 0) {
                while (current != null) {
                    stack.push(current);
                    current = current.left;
                }
                current = stack.pop();
                System.out.print(current.data + " | ");
                current = current.right;
            }
        }
    }

    public static void main(String[] args) {
        StackTraversal.BST tree = new StackTraversal().new BST();
        tree.root = new StackTraversal().new Node(4);
        tree.root.left = new StackTraversal().new Node(2);
        tree.root.right = new StackTraversal().new Node(6);
        tree.root.left.left = new StackTraversal().new Node(1);
        tree.root.left.right = new StackTraversal().new Node(3);
        tree.root.right.left = new StackTraversal().new Node(5);
        tree.root.right.right = new StackTraversal().new Node(7);
        tree.inOrderTraversal();
    }
}

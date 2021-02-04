package org.example.a.algos.recursion;

public class ReverseLList<T extends Comparable<T>> {
    private Node<T> head;

    public ReverseLList() {
        head = null;
    }

    class Node<T extends Comparable<T>> {
        private Node<T> next;
        private T data;

        public Node(T data) {
            next = null;
            this.data = data;
        }

    }

    public boolean add(T obj) {
        Node<T> node = new Node<>(obj);
        node.next = head;
        head = node;
        return true;
    }

    public void printReversedLinkedList(Node<Integer> node) {
        if (node == null) {
            return;
        }
        printReversedLinkedList(node.next);
        System.out.print(node.data + (node.data != 5 ? " <-- " : ""));
    }

    public static void main(String[] args) {
        ReverseLList<Integer> list = new ReverseLList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printReversedLinkedList(list.head);
        System.out.printf("\nHead: %d", list.head.data);
    }

}

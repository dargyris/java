package org.example.zerholc.stk.list;

public class StackList<T extends Comparable<T>> {
    private Node<T> head;
    private int size;

    public StackList() {
        head = null;
        size = 0;
    }

    class Node<T extends Comparable<T>> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return this.data.toString();
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    public boolean push(T obj) {
        size++;
        if (head == null) {
            head = new Node<>(obj);
            return true;
        }

        Node<T> current = head;
        head = new Node<>(obj);
        head.setNext(current);
        return true;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public T peek() {
        return head.getData();
    }

    public T pop() {
        if (head == null) {
            return null;
        }

        T obj = head.getData();
        head = head.getNext();
        size--;
        return obj;
    }

}

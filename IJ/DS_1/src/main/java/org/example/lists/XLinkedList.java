package org.example.lists;

public class XLinkedList<T extends Comparable<T>> implements IList<T> {

    private LNode<T> root;
    private int sizeOfList;

    @Override
    public void insert(T data) {
        ++this.sizeOfList;
        if (root == null) {
            this.root = new LNode<>(data);
        } else {
            insertDataAtBeginning(data);
        }
    }

    private void insertDataAtBeginning(T data) {
        LNode<T> newNode = new LNode<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }

    private void insertDataAtEnd(T data, LNode<T> node) {
        if (node.getNextNode() != null) {
            insertDataAtEnd(data, node.getNextNode());
        } else {
            LNode<T> newNode = new LNode<>(data);
            node.setNextNode(newNode);
        }
    }

    private void insertDataAtEndWhile(T data, LNode<T> node) {
        LNode<T> currentNode = node;
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }
        LNode<T> newNode = new LNode<>(data);
        currentNode.setNextNode(newNode);
    }

    @Override
    public void remove(T data) {
        if (this.root == null) {
            return;
        }
        --this.sizeOfList;
        if (this.root.getData().compareTo(data) == 0) {
            this.root = this.root.getNextNode();
        } else {
            remove(data, root, root.getNextNode());
        }
    }

    private void remove(T dataToRemove, LNode<T> previousNode, LNode<T> actualNode) {
        while (actualNode != null) {
            if (actualNode.getData().compareTo(dataToRemove) == 0) {
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public void traverseList() {
        if (this.root == null) {
            return;
        }
        LNode<T> actualNode = this.root;
        while (actualNode != null) {
            System.out.print(actualNode + " * ");
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.sizeOfList;
    }

    @Override
    public LNode<T> getMiddleNode() {
        LNode<T> fastPtr = this.root;
        LNode<T> slowPtr = this.root;

        while (fastPtr.getNextNode() != null
                && fastPtr.getNextNode().getNextNode()!=null) {
            fastPtr = fastPtr.getNextNode().getNextNode();
            slowPtr = slowPtr.getNextNode();
        }
        return slowPtr;
    }

    @Override
    public void reverse() {
        LNode<T> current = this.root;
        LNode<T> previous = null;
        LNode<T> next = null;

        while (current != null) {
            next = current.getNextNode();
            current.setNextNode(previous);
            previous = current;
            current = next;
        }
        this.root = previous;
    }
}

package org.example.more.ds.lists;

public class Questions<T extends Comparable<T>> extends MyLListD<T> {
    public ListNode<T> getMiddleElement(MyLListD<T> list) {
        ListNode<T> fastPtr = list.getHead();
        ListNode<T> slowPtr = list.getHead();

        while (fastPtr.getNext() != null && fastPtr.getNext().getNext() != null) {
            fastPtr = fastPtr.getNext().getNext();
            slowPtr = slowPtr.getNext();
        }
        return slowPtr;
    }

    public void reverseList(MyLListD<T> list) {
        ListNode<T> current = list.getHead();
        ListNode<T> prev = null;
        ListNode<T> next = null;

        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        list.setHead(prev);
    }
}

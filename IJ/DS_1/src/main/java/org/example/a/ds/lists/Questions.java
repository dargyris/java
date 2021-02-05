package org.example.a.ds.lists;

public class Questions<T extends Comparable<T>> extends MyLListSize<T> {
    class MiddleElement {
        public ListNode<T> getMiddleElement(MyLListSize<T> list) {
            ListNode<T> fastPtr = list.getHead();
            ListNode<T> slowPtr = list.getHead();

            while (fastPtr.getNext() != null && fastPtr.getNext().getNext() != null) {
                fastPtr = fastPtr.getNext().getNext();
                slowPtr = slowPtr.getNext();
            }
            return slowPtr;
        }
    }

    class ReverseList {
        public void reverseList(MyLListSize<T> list) {
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

}

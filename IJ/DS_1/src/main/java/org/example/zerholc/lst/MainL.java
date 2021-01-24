package org.example.zerholc.lst;

public class MainL {
    public static void main(String[] args) {
        /* 1. Middle node in a linked list.
        / -> Naive solution: Iterate through the list to get the size. Traverse again to the middle node.
        / -> Using two ptr: 1st ptr traverse 1 node at a time. 2nd ptr traverse 2 nodes at a time.
        / When the fast pointer is at the end, the slow is in the middle!
        / Solution should be in-place and O(N)
        **/
        IList<Integer> list = new XLinkedList<>();
        list.insert(10);
        list.insert(2);
        list.insert(5);
        list.insert(1);
        System.out.println(list.getMiddleNode());

        /* 2. Reverse a linked list in-place and O(N)
        / -> Naive: traverse all nodes one by one, construct other list.
        / Not in place.
        / -> Pointers: O(N) and in-place.
        **/
        list.traverseList();
        System.out.println();
        list.reverse();
        list.traverseList();
    }
}

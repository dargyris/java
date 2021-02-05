package org.example.a.ds.lists;

/* Practical applications of the List Interface
/ 1. Low level memory management: C -> malloc(), free()
/ for allocating or freeing memory on the heap.
/ char* char_ptr = (char*) malloc(30);
/ https://wiki.syslinux.org/wiki/index.php?title=Memory_Map_(General)

/ 2. The heap memory is represented as a doubly linked list.

/ 3. Windows: Alt-Tab: Active tabs layout

/ 4. Photo viewer: Next / Previous photo

/ 5. Blockchains (BitCoin)
/ A blockchain is a linked list where blocks are cryptographically linked together.
**/

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        aList();
        aListSize();
        llist();
        llistSize();
        llistTailSize();
        doublyLlist();
        getMiddleElement();
        reverseList();
    }

    public static void reverseList() {
        System.out.println("Reverse elements in list:");
        MyLListSize<Integer> intList = new MyLListSize<>();
        intList.addFirst(1);
        intList.addFirst(2);
        intList.addFirst(3);
        intList.addFirst(4);
        intList.addFirst(5);
        printIntList(intList);
        Questions.ReverseList reverse = new Questions().new ReverseList();
        reverse.reverseList(intList);
        printIntList(intList);
        System.out.println("=====================================\n");
    }

    public static void getMiddleElement() {
        System.out.println("Middle element of list:");
        MyLListSize<Integer> intList = new MyLListSize<>();
        intList.addFirst(1);
        intList.addFirst(2);
        intList.addFirst(3);
        intList.addFirst(4);
        intList.addFirst(5);
        printIntList(intList);
        Questions.MiddleElement middle = new Questions().new MiddleElement();
        System.out.println(middle.getMiddleElement(intList));
        System.out.println("=====================================\n");
    }
    public static void aList() {
        System.out.println("ArrayList no size:");
        MyList<String> stringList = new MyAList<>();
        System.out.println("List initial size: " + stringList.size());
        loadList(stringList);
        System.out.println("List size after adding 6 elements: " + stringList.size());
        System.out.println("Peek first: " + stringList.peekFirst());
        System.out.println("Peek last: " + stringList.peekLast());
        printListWhile(stringList);
        printListForeach(stringList);
        printListLambda(stringList);
        System.out.println("=====================================\n");
    }

    public static void aListSize() {
        System.out.println("ArrayList with size:");
        MyList<String> stringList = new MyAListSize<>();
        System.out.println("List initial size: " + stringList.size());
        loadList(stringList);
        System.out.println("List size after adding 6 elements: " + stringList.size());
        System.out.println("Peek first: " + stringList.peekFirst());
        System.out.println("Peek last: " + stringList.peekLast());
        printListWhile(stringList);
        printListForeach(stringList);
        printListLambda(stringList);
        System.out.println("=====================================\n");
    }

    public static void llist() {
        System.out.println("Linked List without Size:");
        MyList<String> stringList = new MyLList<>();
        System.out.println("List initial size: " + stringList.size());
        loadList(stringList);
        System.out.println("List size after adding 6 elements: " + stringList.size());
        System.out.println("Peek first: " + stringList.peekFirst());
        System.out.println("Peek last: " + stringList.peekLast());
        printListWhile(stringList);
        printListForeach(stringList);
        printListLambda(stringList);
        System.out.println("=====================================\n");
    }

    public static void llistSize() {
        System.out.println("Linked List with Size:");
        MyList<String> stringList = new MyLListSize<>();
        System.out.println("List initial size: " + stringList.size());
        loadList(stringList);
        System.out.println("List size after adding 6 elements: " + stringList.size());
        System.out.println("Peek first: " + stringList.peekFirst());
        System.out.println("Peek last: " + stringList.peekLast());
        printListWhile(stringList);
        printListForeach(stringList);
        printListLambda(stringList);
        System.out.println("=====================================\n");
    }

    public static void llistTailSize() {
        System.out.println("Linked List with Tail and Size:");
        MyList<String> stringList = new MyLListTail<>();
        System.out.println("List initial size: " + stringList.size());
        loadList(stringList);
        System.out.println("List size after adding 6 elements: " + stringList.size());
        System.out.println("Peek first: " + stringList.peekFirst());
        System.out.println("Peek last: " + stringList.peekLast());
        printListWhile(stringList);
        printListForeach(stringList);
        printListLambda(stringList);
        System.out.println("=====================================\n");
    }

    public static void doublyLlist() {
        System.out.println("Doubly Linked List with Tail and Size:");
        MyList<String> stringList = new MyLListD<>();
        System.out.println("List initial size: " + stringList.size());
        loadList(stringList);
        System.out.println("List size after adding 6 elements: " + stringList.size());
        System.out.println("Peek first: " + stringList.peekFirst());
        System.out.println("Peek last: " + stringList.peekLast());
        printListWhile(stringList);
        printListForeach(stringList);
        printListLambda(stringList);
        ListIterator<String> iterator = (ListIterator<String>) stringList.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
        System.out.println(iterator.previous());
        System.out.println(iterator.previousIndex());
        System.out.println(iterator.nextIndex());
        System.out.println(iterator.nextIndex());
        System.out.println(iterator.previousIndex());
        System.out.println("=====================================\n");
    }

    public static void loadList(MyList<String> list) {
        list.addFirst("Added First 1");
        list.addFirst("Added First 2");
        list.addLast("Added Last 1");
        list.addLast("Added Last 2");
        list.add("Added @ 2", 2);
        list.add("Added @ 3", 3);
    }

    public static void printListWhile(MyList<String> list) {
        System.out.print("While\t: | ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " | ");
        }
        System.out.print("\n");
    }

    public static void printListForeach(MyList<String> list) {
        System.out.print("For(:)\t: | ");
        for (String s : list) {
            System.out.print(s + " | ");
        }
        System.out.print("\n");
    }

    public static void printListLambda(MyList<String> list) {
        System.out.print("Lambda\t: | ");
        list.forEach(element -> System.out.print(element + " | "));
        System.out.print("\n");
    }

    public static void printIntList(MyList<Integer> list) {
        System.out.print("Lambda\t: | ");
        list.forEach(element -> System.out.print(element + " | "));
        System.out.print("\n");
    }
}

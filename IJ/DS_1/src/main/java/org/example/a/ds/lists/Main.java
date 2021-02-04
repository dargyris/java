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

public class Main {
    public static void main(String[] args) {
        arrayListNoSize();
        arrayListSize();
        linkedList();
    }

    public static void arrayListNoSize() {
        System.out.println("ArrayList no size:");
        MyList<String> stringList = new MyArrayList<>();
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

    public static void arrayListSize() {
        System.out.println("ArrayList with size:");
        MyList<String> stringList = new MyArrayListSize<>();
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

    public static void linkedList() {
        System.out.println("LinkedList:");
        MyList<String> stringList = new MyLinkedList<>();
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
}

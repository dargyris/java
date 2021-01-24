package org.example.zerholc.lst;

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

public class AppL {
    public static void main(String[] args) {
        IList<Person> list = new XLinkedList<>();
        Person adam = new Person("Adam", 10);
        list.insert(adam);
        list.insert(new Person("Joe", 22));
        list.insert(new Person("Kevin", 1));
        list.insert(new Person("Michael", 45));

        list.traverseList();
        System.out.println();
        list.remove(adam);
        System.out.println();
        list.traverseList();
    }
}

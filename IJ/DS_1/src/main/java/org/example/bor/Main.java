package org.example.bor;

public class Main {

    public static void main(String[] args) {
        MyList_I<Integer> list = new MyArrayList<>();

        getListStatus(list);

        list.addFirst(0);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);

        getListStatus(list);
        printList(list);
        printList(list);

    }

    public static void getListStatus(MyList_I<Integer> list) {
        System.out.println("Size\t: " + list.size());
        System.out.println("Empty\t: " + list.isEmpty());
        System.out.println("PeekF\t: " + list.peekFirst());
        System.out.println("PeekL\t: " + list.peekLast());
        System.out.println();
    }

    public static void printList(MyList_I<Integer> list) {
        StringBuilder s = new StringBuilder();
        s.append("{  ");
        for (Integer i : list) {
            s.append(i + "  ");
        }
        s.append("}");
        System.out.println(s.toString());
    }

}

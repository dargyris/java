package org.example.a.algos.theory;

public class Main {
    public static void main(String[] args) {
        stackHeapMemory();
    }

    public static void stackHeapMemory() {
        System.out.println("\tStack\t\t\t\t\t\t\t\t|\tHeap");
        System.out.println("Small size\t\t\t\t\t\t\t\t| large");
        System.out.println("Fast access\t\t\t\t\t\t\t\t| slow");
        System.out.println("Stores function calls and local vars\t| Stores objects");
        System.out.println("No fragmentation\t\t\t\t\t\t| May become fragmented");
    }
}

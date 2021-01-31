package org.example.zerholc.stk.list;

public class Main {
    public static void main(String[] args) {
        StackList<Integer> intStack = new StackList<>();
        System.out.println("Stack initial size: " + intStack.size());
        intStack.push(0);
        intStack.push(5);
        intStack.push(10);
        intStack.push(15);
        intStack.push(20);
        System.out.println("Stack size after adding 5 elements: " + intStack.size());
        System.out.println("Peek: " + intStack.peek());
        System.out.println();

        while (!intStack.isEmpty()) {
            System.out.println(intStack.pop());
        }
    }
}

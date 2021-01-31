package org.example.a.ds.stacks;

/*  Applications
/   1. Web browser back
/   2. Undo
/   3. Stack memory: local variables and function calls
/   4. DFS
**/

public class Main {
    public static void main(String[] args) {
        listStack();
        arrayFirstStack();
        arrayLastStack();

        ShuntingYard yard = new ShuntingYard();
        yard.interpretExpression("( ( 4 - 1 ) * ( 2 + 1 ) ) / ( 2 + 1 )");
        System.out.println(yard.result());
    }

    public static void listStack() {
        System.out.println("> List Stack");
        MyStack<Integer> intStack = new ListStack<>();
        System.out.println("Stack initial size: " + intStack.size());
        loadStack(intStack);
        System.out.println("Stack size after adding 5 elements: " + intStack.size());
        System.out.println("Peek: " + intStack.peek());
        printStackWhile(intStack);
        loadStack(intStack);
        printStackForeach(intStack);
        printStackLambda(intStack);
        System.out.println("=====================================\n");
    }

    public static void arrayFirstStack() {
        System.out.println("> Array First Stack");
        MyStack<Integer> intStack = new ArrayFirstStack<>();
        System.out.println("Stack initial size: " + intStack.size());
        loadStack(intStack);
        System.out.println("Stack size after adding 5 elements: " + intStack.size());
        System.out.println("Peek: " + intStack.peek());
        printStackWhile(intStack);
        loadStack(intStack);
        printStackForeach(intStack);
        printStackLambda(intStack);
        System.out.println("=====================================\n");
    }

    public static void arrayLastStack() {
        System.out.println("> Array Last Stack");
        MyStack<Integer> intStack = new ArrayLastStack<>();
        System.out.println("Stack initial size: " + intStack.size());
        loadStack(intStack);
        System.out.println("Stack size after adding 5 elements: " + intStack.size());
        System.out.println("Peek: " + intStack.peek());
        printStackWhile(intStack);
        loadStack(intStack);
        printStackForeach(intStack);
        printStackLambda(intStack);
        System.out.println("=====================================\n");    }

    public static void loadStack(MyStack<Integer> stack) {
        stack.push(0);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
    }

    public static void printStackWhile(MyStack<Integer> stack) {
        System.out.print("While\t: { ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.print("}\n");
    }

    public static void printStackForeach(MyStack<Integer> stack) {
        System.out.print("For(:)\t: { ");
        for (Integer i : stack) {
            System.out.print(i + " ");
        }
        System.out.print("}\n");
    }

    public static void printStackLambda(MyStack<Integer> stack) {
        System.out.print("Lambda\t: { ");
        stack.forEach(element -> System.out.print(element + " "));
        System.out.print("}\n");
    }
}

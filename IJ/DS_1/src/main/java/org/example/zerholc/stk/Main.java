package org.example.zerholc.stk;

/*  Applications
/   1. Web browser back
/   2. Undo
/   3. Stack memory: local variables and function calls
/   4. DFS
**/

public class Main {
    public static void main(String[] args) {
        stackList();
        System.out.println("==================");
        System.out.println();

        arrayFirst();
        System.out.println("==================");
        System.out.println();

        ShuntingYard yard = new ShuntingYard();
        yard.interpretExpression("( ( 4 - 1 ) * ( 2 + 1 ) ) / ( 2 + 1 )");
        yard.result();
        System.out.println("==================");
        System.out.println();
    }

    public static void stackList() {
        MyStack<Integer> intStack = new StackList<>();
        System.out.println("Stack initial size: " + intStack.size());
        loadStack(intStack);
        System.out.println("Stack size after adding 5 elements: " + intStack.size());
        System.out.println("Peek: " + intStack.peek());
        printStackWhile(intStack);

        loadStack(intStack);
        printStackForeach(intStack);
    }

    public static void arrayFirst() {
        MyStack<Integer> intStack = new ArrayFirst<>();
        System.out.println("Stack initial size: " + intStack.size());
        loadStack(intStack);
        System.out.println("Stack size after adding 5 elements: " + intStack.size());
        System.out.println("Peek: " + intStack.peek());
        System.out.println();

        printStackWhile(intStack);
        loadStack(intStack);
        printStackForeach(intStack);
    }

    public static void loadStack(MyStack<Integer> stack) {
        stack.push(0);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
    }

    public static void printStackWhile(MyStack<Integer> stack) {
        System.out.print("While print\t: { ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.print("}\n");
    }

    public static void printStackForeach(MyStack<Integer> stack) {
        System.out.print("Foreach print\t: { ");
        stack.forEach(element -> System.out.print(element + " "));
        //        for (Integer i : stack) {
//            System.out.print(i + " ");
//        }
        System.out.print("}\n");
    }
}

package org.example.zerholc.que;

/*  Applications
/   1. Consumers - threads
/   2. CPU scheduling
/   3. Asynchronous data transfer
/   4. IO buffers: Android OS for processes
/   5. BFS
**/

public class Main {

    public static void main(String[] args) {
        linkedQueue();
        System.out.println("==================");
        System.out.println();
    }

    public static void linkedQueue() {
        MyQueue<Integer> intQueue = new QueueList<>();
        System.out.println("Queue initial size: " + intQueue.size());
        loadQueue(intQueue);
        System.out.println("Queue size after adding 5 elements: " + intQueue.size());
        System.out.println("Peek: " + intQueue.peek());
        printQueueWhile(intQueue);

        loadQueue(intQueue);
        printQueueForeach(intQueue);
    }

    public static void loadQueue(MyQueue<Integer> queue) {
        queue.enqueue(0);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
    }

    public static void printQueueWhile(MyQueue<Integer> queue) {
        System.out.print("{ ");
        while (queue.size() > 0) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.print("}\n");
    }

    public static void printQueueForeach(MyQueue<Integer> queue) {
        System.out.print("{ ");
        for (Integer i: queue) {
            System.out.print(i + " ");
        }
        System.out.print("}\n");
    }
}



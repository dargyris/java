package org.example.a.ds.queues;

/*  Applications
/   1. Consumers - threads
/   2. CPU scheduling
/   3. Asynchronous data transfer
/   4. IO buffers: Android OS for processes
/   5. BFS
**/

public class Main {
    public static void main(String[] args) {
        listQueue();
        arrayFirstQueue();
        arrayLastQueue();
    }

    public static void listQueue() {
        System.out.println("> List Queue");
        MyQueue<Integer> intQueue = new ListQueue<>();
        System.out.println("Queue initial size: " + intQueue.size());
        loadQueue(intQueue);
        System.out.println("Queue size after adding 5 elements: " + intQueue.size());
        System.out.println("Peek: " + intQueue.peek());
        printQueueWhile(intQueue);
        loadQueue(intQueue);
        printQueueForeach(intQueue);
        printQueueLambda(intQueue);
        System.out.println("=====================================\n");
    }

    public static void arrayFirstQueue() {
        System.out.println("> Array First Queue");
        MyQueue<Integer> intQueue = new ArrayFirstQueue<>();
        System.out.println("Queue initial size: " + intQueue.size());
        loadQueue(intQueue);
        System.out.println("Queue size after adding 5 elements: " + intQueue.size());
        System.out.println("Peek: " + intQueue.peek());
        printQueueWhile(intQueue);
        loadQueue(intQueue);
        printQueueForeach(intQueue);
        printQueueLambda(intQueue);
        System.out.println("=====================================\n");
    }

    public static void arrayLastQueue() {
        System.out.println("> Array Last Queue");
        MyQueue<Integer> intQueue = new ArrayLastQueue<>();
        System.out.println("Queue initial size: " + intQueue.size());
        loadQueue(intQueue);
        System.out.println("Queue size after adding 5 elements: " + intQueue.size());
        System.out.println("Peek: " + intQueue.peek());
        printQueueWhile(intQueue);
        loadQueue(intQueue);
        printQueueForeach(intQueue);
        printQueueLambda(intQueue);
        System.out.println("=====================================\n");
    }

    public static void loadQueue(MyQueue<Integer> queue) {
        queue.enqueue(0);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
    }

    public static void printQueueWhile(MyQueue<Integer> queue) {
        System.out.print("While\t: { ");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.print("}\n");
    }

    public static void printQueueForeach(MyQueue<Integer> queue) {
        System.out.print("For(:)\t: { ");
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
        System.out.print("}\n");
    }

    public static void printQueueLambda(MyQueue<Integer> queue) {
        System.out.print("Lambda\t: { ");
        queue.forEach(element -> System.out.print(element + " "));
        System.out.print("}\n");
    }
}

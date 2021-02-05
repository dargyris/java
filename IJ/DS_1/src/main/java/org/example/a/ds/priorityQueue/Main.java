package org.example.a.ds.priorityQueue;

/* Priority Queues
/  Every item has an additional priority value
/  Heaps are binary trees -> 1D arrays
/  Heaps are implementations of the priority queue abstract data type: Min and Max heaps.
/  The tree must be balanced! Complete.

/  Heap construction: O(N)
**/

/* Applications:
/  1. Dijkstra's shortest path algo
/  2. Prim's minimum spanning tree algo
**/

/* Heapsort
/  O(NlogN), in-place, unstable. Quicksort is faster.
/  Mem complexity: O(N): N items in N-sized array.
/  T complexity: log_2(N): A node has at most 2 children, so at most log_2(N) swaps are needed (Heapify)
/  find min max: O(1), (bst: rightmost or leftmost item: O(logN))
/  remove min max: O(logN) -> heapify
/  insert: O(logN) -> heapify
 */

/* Binomial heap
/  Supports quick merging of 2 or more heaps: implements mergeable (meldable heap)
/  Insertion can improve from O(logN) to O(1)
/  Merge is O(logN)
**/

/* Fibonacci heap
/  Dijktra's shortest path and Prim's spanning tree algos run faster with the fibonacci heap
/  Can have several children
/  Size of subtree rooted in node of degree k is at least F_k+2, k is the k-th fibonacci number
/  Merge becomes O(10
**/

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        testIntHeap();
        sortIntHeap();
        javaUtilPriorityQueue();
    }

    public static void javaUtilPriorityQueue() {
        System.out.println("Java Util Priority Queue");
        Queue<PersonAge> personAge = new PriorityQueue<>();
        personAge.add(new PersonAge("Kevin", 22));
        personAge.add(new PersonAge("Joe", 37));
        personAge.add(new PersonAge("Adam", 12));
        personAge.add(new PersonAge("Anna", 45));
        while (personAge.peek() != null) {
            System.out.println(personAge.poll());
        }
        System.out.print("\n----------------------------------------\n");

        Queue<PersonName> personName = new PriorityQueue<>();
        personName.add(new PersonName("Kevin", 22));
        personName.add(new PersonName("Joe", 37));
        personName.add(new PersonName("Adam", 12));
        personName.add(new PersonName("Anna", 45));
        while (personName.peek() != null) {
            System.out.println(personName.poll());
        }
        System.out.print("\n========================================\n");
    }

    public static void sortIntHeap() {
        System.out.println("Sort int heap.");
        MyIntHeap heap = new MyIntHeap();

        heap.insert(10);
        heap.insert(8);
        heap.insert(12);
        heap.insert(20);
        heap.insert(-2);
        heap.insert(0);
        heap.insert(1);
        heap.insert(321);

        heap.heapSort();
        System.out.print("\n========================================\n");
    }

    public static void testIntHeap() {
        System.out.println("Test int heap.");
        MyIntHeap heap = new MyIntHeap();

        heap.insert(10);
        heap.insert(8);
        heap.insert(12);
        heap.insert(20);
        heap.insert(-2);
        heap.insert(0);
        heap.insert(1);
        heap.insert(321);

        System.out.print(heap.poll() + " ");
        System.out.print(heap.poll() + " ");
        System.out.print(heap.poll() + " ");
        System.out.print(heap.poll() + " ");
        System.out.print(heap.poll() + " ");
        System.out.print(heap.poll() + " ");
        System.out.print(heap.poll() + " ");
        System.out.print(heap.poll() + " ");
        System.out.print("\n========================================\n");
    }
}

package org.example.a.multithreading;

/*  MULTITHREADING
/   Each process can have multiple threads.
/   The threads of a process share the memory and resources: registers, stack and heap memory.
/
/   Time slicing algo: 1 processor deals with many threads.
/   Parallel computing: Each core has a single thread. Threads run simultaneously.
/
/   Advantages:
/   Responsive apps, several operations concurrently.
/   Resource utilization.
/   Improve performance.
/
/   Disadvantages:
/   Data is on the same memory area, belonging to the same process. Synchronization.
/   Hard to design
/   Switching between threads is expensive. Save-load of information of each thread for every switch between threads.
**/

/*  STATES OF THREADS
/   NEW: Instantiation. Before start() is called.
/   RUNNABLE: After the thread started.
/   WAIT: wait(), sleep().
/   DEAD: Thread finished its task.
**/

public class Main {
}

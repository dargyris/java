package org.example.multithreading;

/*  Deadlocks: Blocked threads
/   --> solution: tryLock()
/   When two or more threads wait forever for a lock or resource held by other threads.
/   Two or more competing actions wait for each other to finish, and thus neither does.
**/

/*  Livelocks: Not blocked, but unable to make progress.
/   --> solution: Acquire locks in the same order to avoid cyclic dependency. Random try also.
/   Thread responses to action of other thread that responses to other thread etc.
/   Threads are working but busy responding to each other to resume normal function.
/   Narrow corridor overtake
**/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class R_Deadlocks {
    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);

    public void worker1() {
        lock1.lock();
        System.out.println("Worker1 acquires lock1.");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock2.lock();
        System.out.println("Worker1 acquires lock2.");
        lock1.unlock();
        lock2.unlock();
    }

    public void worker2() {
        lock2.lock();
        System.out.println("Worker2 acquires lock2.");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock1.lock();
        System.out.println("Worker2 acquires lock1.");
        lock1.unlock();
        lock2.unlock();
    }

    public static void main(String[] args) {
        R_Deadlocks deadlock = new R_Deadlocks();
        new Thread(deadlock::worker1, "worker 1 (t1)").start();
        new Thread(deadlock::worker2, "worker 2 (t2)").start();
    }
}

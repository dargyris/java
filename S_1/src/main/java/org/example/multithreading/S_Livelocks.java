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

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class S_Livelocks {
    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);

    public void worker1() {
        while (true) {
            try {
                lock1.tryLock(50, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker1 acquires lock1.");
            System.out.println("Worker1 tries to get lock2.");
            if (lock2.tryLock()) {
                System.out.println("Worker1 acquires lock2.");
                lock2.unlock();
            } else {
                System.out.println("Worker1 can't acquire lock2.");
                continue;
            }
        }
//        lock1.unlock();
//        lock2.unlock();
    }

    public void worker2() {
        while (true) {
            try {
                lock2.tryLock(50, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker2 acquires lock2.");
            System.out.println("Worker2 tries to get lock1.");
            if (lock1.tryLock()) {
                System.out.println("Worker2 acquires lock1.");
                lock1.unlock();
            } else {
                System.out.println("Worker2 can't acquire lock1.");
                continue;
            }
        }
//        lock1.unlock();
//        lock2.unlock();
    }

    public static void main(String[] args) {
        S_Livelocks livelock = new S_Livelocks();
        new Thread(livelock::worker1, "worker1").start();
        new Thread(livelock::worker2, "worker2").start();
    }
}

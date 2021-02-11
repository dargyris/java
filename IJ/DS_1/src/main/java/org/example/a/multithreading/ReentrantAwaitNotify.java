package org.example.a.multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantWaitNotify {
    class Worker {
        private Lock lock = new ReentrantLock();
        private Condition condition = lock.newCondition();

        public void producer() throws InterruptedException {
            lock.lock();    // I can lock many times on a re-entrant lock.
            try {
                System.out.println("Producer method.");
                condition.await(); // Hands over the lock to other threads.
                System.out.println("Producer again.");
            } finally {
                lock.unlock(); // Unlock must be called as many times as the lock method is called.
            }
        }

        public void consumer() throws InterruptedException {
            lock.lock();
            try {
                Thread.sleep(1000);
                System.out.println("Consumer method.");
                condition.signal(); // Notifies the thread that called the await(). Like notify().
            } finally {
                lock.unlock();
            }
        }
    }
    public static void main(String[] args) {
        ReentrantWaitNotify.Worker worker = new ReentrantWaitNotify().new Worker();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    worker.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    worker.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.setName("1st Thread");
        t2.setName("2nd Thread");
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

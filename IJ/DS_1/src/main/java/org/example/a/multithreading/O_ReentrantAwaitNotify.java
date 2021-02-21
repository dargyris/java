package org.example.a.multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class O_ReentrantAwaitNotify {
    class Worker {
        private Lock lock = new ReentrantLock(true);
        private Condition condition = lock.newCondition();

        public void producer() throws InterruptedException {
            lock.lock();
            try {
                System.out.println("Producer method.");
                condition.await();
                System.out.println("Producer again.");
            } finally {
                lock.unlock();
            }
        }

        public void consumer() throws InterruptedException {
            lock.lock();
            try {
                Thread.sleep(1000);
                System.out.println("Consumer method.");
                condition.signal();
                System.out.println("Consumer code will execute after signal()");
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("In thread: " + Thread.currentThread().getName());

        final Worker worker = new O_ReentrantAwaitNotify().new Worker();
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

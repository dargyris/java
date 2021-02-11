package org.example.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class N_ReentrantLock {
    private static int counter;
    private static Lock lock = new ReentrantLock(true);

    public static void increment() {
        lock.lock();
        try {
            for (int i = 0; i < 50; i++) {
                counter++;
            }

        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        counter = 0;
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                increment();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                increment();
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
        System.out.println("Counter: " + counter);
    }
}

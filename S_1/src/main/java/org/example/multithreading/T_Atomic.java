package org.example.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class T_Atomic {
    private static int counter = 0;
    private static AtomicInteger atomicCounter = new AtomicInteger(0);

    public void increment() {
        for (int i = 0; i < 10000; i++) {
            atomicCounter.getAndIncrement();
            counter++;
        }
    }

    public static void main(String[] args) {
        T_Atomic t_atomic = new T_Atomic();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                t_atomic.increment();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                t_atomic.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counter: " + counter + "\tAtomic counter: " + atomicCounter.toString());
    }
}

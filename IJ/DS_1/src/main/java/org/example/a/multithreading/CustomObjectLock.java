package org.example.a.multithreading;

public class LockManaging {
    public static int counter = 0;
    public static int counter1 = 0;
    public static int counter2 = 0;

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        process();
    }

    public static void process() {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    increment();
                    increment1();
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    increment();
                    increment2();
                }
            }
        });

        t1.setName("1st Thread");
        t2.setName("2nd Thread");
        t1.start();
        t2.start();
        System.out.println("Counter: " + counter);
        System.out.println("Counter1: " + counter1);
        System.out.println("Counter2: " + counter2);
    }

    public static void increment() {
        counter++;
    }

    public static void increment1() {
        // I am using 2 "irrelevant" static instantiations of the Object class, to manage locking.
        // The 1st thread handling increment 1 and accessing counter1, will NOT have to wait for thread 2.
        // They handle 2 separate locks from 2 separate Object instantiations.
        // THIS IS NOT parrallel execution.
        synchronized (lock1) {
            counter1++;
        }
    }

    public static void increment2() {
        synchronized (lock2) {
            counter2++;
        }
    }
}

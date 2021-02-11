package org.example.multithreading;

public class J_CustomObjLock {
    public static int counter, counter1, counter2;

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void increment() {
        counter++;
    }

    public static void increment1() {
        synchronized (lock1) {
            counter1++;
        }
    }

    public static void increment2() {
        synchronized (lock2) {
            counter2++;
        }
    }

    public static void main(String[] args) {
        process();
    }

    public static void process() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; ++i) {
                    increment();
                    increment1();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; ++i) {
                    increment();
                    increment2();
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

        System.out.println("Ctr: " + counter + "\tCtr1: " + counter1 + "\tCtr2: " + counter2);
        System.out.println("===============================================================");
    }
}

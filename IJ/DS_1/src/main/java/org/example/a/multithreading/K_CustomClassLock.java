package org.example.a.multithreading;

public class K_CustomClassLock {
    public static int counter, counter1, counter2;

    public static void increment() {
        counter++;
    }

    public static void increment1() {
        synchronized (K_CustomClassLock.class) {
            counter1++;
        }
    }

    public static void increment2() {
        synchronized (K_CustomClassLock.class) {
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

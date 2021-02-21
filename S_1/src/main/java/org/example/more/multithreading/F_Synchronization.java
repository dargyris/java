package org.example.more.multithreading;

public class F_Synchronization {
    public static int counter, counter1, counter2;

    public static synchronized void increment() {
        counter++;
    }

    public static void increment1() {
        counter1++;
    }

    public static void increment2() {
        counter2++;
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        joinProcess();
        noJoinProcess();
    }

    public static void noJoinProcess() {
        System.out.println("No Join Process");
        counter = counter1 = counter2 = 0;
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                for (int i = 0; i < 10000; i++) {
                    increment();
                    increment1();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                for (int i = 0; i < 10000; i++) {
                    increment();
                    increment2();
                }
            }
        });

        t1.setName("1st Thread");
        t2.setName("2nd Thread");
        t1.start();
        t2.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println("Counter: " + counter + "\tCounter1: " + counter1 + "\tCounter2: " + counter2);
        System.out.println("====================================================");
    }

    public static void joinProcess() {
        System.out.println("Join Process");
        counter = counter1 = counter2 = 0;
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                for (int i = 0; i < 10000; i++) {
                    increment();
                    increment1();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                for (int i = 0; i < 10000; i++) {
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
            System.out.println("Try block. " + Thread.currentThread().getName());
            t1.join();
            System.out.println("Try block. " + Thread.currentThread().getName());
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName());
        System.out.println("Counter: " + counter + "\tCounter1: " + counter1 + "\tCounter2: " + counter2);
        System.out.println("====================================================");
    }
}

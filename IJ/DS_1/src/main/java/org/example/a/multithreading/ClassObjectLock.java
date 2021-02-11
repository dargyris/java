package org.example.a.multithreading;

public class SynchronizationBlocks {
    public static int counter = 0;
    public static int counter1 = 0;
    public static int counter2 = 0;

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
        // Class level locking. Otherwise it would be "this"!
        synchronized (SynchronizationBlocks.class) {
            counter1++;
        }
    }

    public static void increment2() {
        synchronized (SynchronizationBlocks.class) {
            counter2++;
        }
    }
}

package org.example.more.multithreading;

import java.util.ArrayList;
import java.util.List;

public class L_Oscillation {
    class Processor {
        private List<Integer> list = new ArrayList<>();
        public static final int UPPER_LIMIT = 5;
        public static final int LOWER_LIMIT = 0;
        private int value = 0;
        private final Object lock = new Object();

        public void producer() throws InterruptedException {
            synchronized (lock) {
                while (true) {
                    if (list.size() == UPPER_LIMIT) {
                        System.out.println("Waiting to remove items.");
                        value = 0;
                        lock.wait();
                    } else {
                        System.out.println("Adding: " + value);
                        list.add(value++);
                        lock.notify();
                    }
                    Thread.sleep(500);
                }
            }
        }

        public void consumer() throws InterruptedException {
            synchronized (lock) {
                while (true) {
                    if (list.size() == LOWER_LIMIT) {
                        System.out.println("Waiting to add items.");
                        lock.wait();
                    } else {
                        System.out.println("Removing: " + list.remove(list.size() - 1));
                        lock.notify();
                    }
                    Thread.sleep(500);
                }
            }
        }
    }

    public static void main(String[] args) {
        Processor processor = new L_Oscillation().new Processor();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.setName("Producer Thread (t1)");
        t2.setName("Producer Thread (t2)");
        t1.start();
        t2.start();
    }
}

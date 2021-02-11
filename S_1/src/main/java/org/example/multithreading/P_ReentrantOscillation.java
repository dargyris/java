package org.example.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class P_ReentrantOscillation {
    class Processor {
        private List<Integer> list = new ArrayList<>();
        public static final int UPPER_LIMIT = 5;
        public static final int LOWER_LIMIT = 0;
        private int value = 0;
        private Lock lock = new ReentrantLock(true);
        private Condition condition = lock.newCondition();

        public void producer() {
            lock.lock();
            try {
                while (true) {
                    if (list.size() == UPPER_LIMIT) {
                        System.out.println("Waiting to remove items.");
                        value = 0;
                        condition.await();
                    } else {
                        System.out.println("Adding: " + value);
                        list.add(value++);
                        condition.signal();
                    }
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public void consumer() {
            lock.lock();
            try {
                while (true) {
                    if (list.size() == LOWER_LIMIT) {
                        System.out.println("Waiting to add items.");
                        condition.await();
                    } else {
                        System.out.println("Removing: " + list.remove(list.size() - 1));
                        condition.signal();
                    }
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        final P_ReentrantOscillation.Processor processor = new P_ReentrantOscillation().new Processor();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                processor.producer();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                processor.consumer();
            }
        });

        t1.setName("Producer Thread (t1)");
        t2.setName("Consumer Thread (t2)");
        t1.start();
        t2.start();
    }
}

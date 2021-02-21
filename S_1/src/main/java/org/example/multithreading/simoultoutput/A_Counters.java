package org.example.multithreading.simoultoutput;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class A_Counters {
    private static int counter = 0;
    private static int counter1 = 0;
    private static int counter2 = 0;
    private volatile static boolean terminate = false;

    public static void sleeper(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void increment() {
        while (!terminate) {
            counter++;
            sleeper(2000);
        }
    }

    public static void increment1() {
        while (!terminate) {
            counter1++;
            sleeper(2000);
        }
    }

    public static void increment2() {
        while (!terminate) {
            counter2++;
            sleeper(2000);
        }
    }

    public static void printer() {
        while (!terminate) {
            System.out.println("Counter: " + counter + "\t\tCounter1: " + counter1 + "\t\tCounter2: " + counter2);
            sleeper(2000);
        }
    }

    public static void killer() {
        sleeper(10000);
        terminate = true;
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                increment();
            }
        });

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                increment1();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                increment2();
            }
        });

        Thread printer = new Thread(new Runnable() {
            @Override
            public void run() {
                printer();
            }
        });

        Thread terminator = new Thread(new Runnable() {
            @Override
            public void run() {
                killer();
            }
        });

        t.start();
        t1.start();
        t2.start();
        printer.start();
        terminator.start();

        try {
            terminator.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

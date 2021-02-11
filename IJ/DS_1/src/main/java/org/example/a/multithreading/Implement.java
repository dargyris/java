package org.example.a.multithreading;

class Run1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Run1: " + i);
        }
    }
}

class Run2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("\tRun2: " + i);
        }
    }
}

public class Run {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Run1());
        Thread t2 = new Thread(new Run2());
        t1.start();
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("\t\tAnonymous class! " + i);
                }
            }
        });
        t3.start();
    }
}

package org.example.a.multithreading;

public class B_ImplementRunnable {
    class Run1 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Run1: " + i);
            }
        }
    }

    class Run2 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("\tRun2: " + i);
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new B_ImplementRunnable().new Run1());
        t1.setName("1st Thread");
        t1.start();

        Thread t2 = new Thread(new B_ImplementRunnable().new Run2() {
            @Override
            public void run() {
                System.out.println("\tOverridden in main!");
            }
        });
        t2.setName("2nd Thread");
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("\t\tAnonymous class! " + i);
                }
            }
        });
        t3.setName("3rd Thread");
        t3.start();
    }
}
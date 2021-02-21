package org.example.a.multithreading;

public class C_ExtendThread {
    class Run1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; ++i) {
                System.out.println("Run1: " + i);
            }
        }
    }

    class Run2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; ++i) {
                System.out.println("\tRun2: " + i);
            }
        }
    }

    class Run3 extends Thread {}

    public static void main(String[] args) {
        Thread t1 = new C_ExtendThread().new Run1();
        t1.setName("1st Thread");
        t1.start();

        new C_ExtendThread().new Run2().start();

        Thread t3 = new Thread(new C_ExtendThread().new Run3() {
            @Override
            public void run() {
                System.out.println("\t\trun() written in main()");
            }
        });
        t3.setName("3rd Thread");
        t3.start();
    }
}

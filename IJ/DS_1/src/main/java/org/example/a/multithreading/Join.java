package org.example.a.multithreading;

public class WaitJoin {
    class Runner1 extends Thread {}
    class Runner2 extends Thread {}

    public static void main(String[] args) {
        Thread t1 = new Thread(new WaitJoin().new Runner1() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Run1: " + i);
                }
            }
        });

        Thread t2 = new Thread(new WaitJoin().new Runner1() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Run1: " + i);
                }
            }
        });


        t1.setName("1st Thread");
        t2.setName("2nd Thread");
        t1.start();
        t2.start();

        System.out.println("Finished with the threads...");
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Really finished with the threads...");

    }
}

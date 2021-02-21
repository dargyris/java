package org.example.a.multithreading;

public class E_Join {
    class Run1 extends Thread {}
    class Run2 extends Thread {}

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(new E_Join().new Run1() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        });
        t1.setName("1st Thread");

        Thread t2 = new Thread(new E_Join().new Run1() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("\t" + Thread.currentThread().getName() + ": " + i);
                }
            }
        });
        t2.setName("2nd Thread");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

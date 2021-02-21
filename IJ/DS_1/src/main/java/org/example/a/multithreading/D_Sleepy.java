package org.example.a.multithreading;

public class D_Sleepy {
    class Runner1 extends Thread {}

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " | ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();

        // I don't need to create another thread to use sleep()! I can use main thread.
        Thread t1 = new Thread(new D_Sleepy().new Runner1() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(200);
                        System.out.print(i + " ");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.setName("1st Thread");
        t1.start();
    }
}

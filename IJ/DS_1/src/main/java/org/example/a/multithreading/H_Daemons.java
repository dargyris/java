package org.example.a.multithreading;

public class H_Daemons {
    class NormalWorker implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " is running. --> " + i);
            }
        }
    }

    class DaemonWorker implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("***" + Thread.currentThread().getName() + " is running. --> " + i);
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new H_Daemons().new NormalWorker());
        Thread t2 = new Thread(new H_Daemons().new DaemonWorker());
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("++++++" + Thread.currentThread().getName() + " is running. --> " + i);
                }
            }
        });
        t1.setDaemon(false);
        t2.setDaemon(true);
        t3.setDaemon(false);
        t1.setName("Normal worker thread (t1)");
        t2.setName("Daemon worker thread (t2)");
        t3.setName("Normal worker thread (t3)");
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

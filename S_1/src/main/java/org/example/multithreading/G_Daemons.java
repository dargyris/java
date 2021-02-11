package org.example.multithreading;

public class G_Daemons {
    class Worker implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello from thread: " + Thread.currentThread().getName());
        }
    }

    class DaemonClass implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello from thread " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        System.out.println("1st in main: " + Thread.currentThread().getName());
        Thread t1 = new Thread(new G_Daemons().new Worker());
        Thread t2 = new Thread(new G_Daemons().new DaemonClass());

        t1.setName("Worker Thread (1st)");
        t1.setDaemon(false);
        t2.setName("Daemon Thread (2nd)");
        t2.setDaemon(true);

        t1.start();
        t2.start();

        System.out.println("t1 daemon? " + t1.isDaemon());
        System.out.println("t2 daemon? " + t2.isDaemon());
    }
}

package org.example.a.multithreading;

public class M_WaitNotify {
    class Process {
        public void producer() throws InterruptedException {
            synchronized (this) {
                System.out.println("Producer running");
                wait();
                System.out.println("Producer again.");
            }
        }

        public void consumer() throws InterruptedException {
            Thread.sleep(1000);
            synchronized (this) {
                System.out.println("Consumer running");
                notify();
                System.out.println("Consumer remaining code will run after notify().");
            }
        }
    }

    public static void main(String[] args) {
        final Process process = new M_WaitNotify().new Process();
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    process.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    process.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.setName("1st Thread");
        t2.setName("2nd Thread");
        t1.start();
        t2.start();
    }
}

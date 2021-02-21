package org.example.more.multithreading;

public class Q_Volatile {
    class Worker implements Runnable {
        private volatile boolean terminated;

        @Override
        public void run() {
            while (!terminated) {
                System.out.println("Worker class is running.");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public boolean isTerminated() {
            return terminated;
        }

        public void setTerminated(boolean terminated) {
            this.terminated = terminated;
        }
    }

    public static void main(String[] args) {
        Q_Volatile.Worker worker = new Q_Volatile().new Worker();
        Thread t1 = new Thread(worker);
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        worker.setTerminated(true);
        System.out.println(Thread.currentThread().getName() + " thread terminated.");
    }
}

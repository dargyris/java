package org.example.a.multithreading;

/* Volatile to STOP THREAD EXECUTION
/  terminated var must be volatile. Not in the cache.
**/

public class Q_Volatile {
    class Worker implements Runnable {
        // volatile keeps the var in the RAM, not in the cache.
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
        Worker worker = new Q_Volatile().new Worker();
        Thread t1 = new Thread(worker);
        t1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        worker.setTerminated(true);
        System.out.println("Main terminated.");
    }
}

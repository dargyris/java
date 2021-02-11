package org.example.multithreading;

public class I_Daemons {
    private static int counter, counter1, counter2;
    private static int daemonCounter;

    private static synchronized void increment() {
        counter++;
    }

    private static void increment1() {
        counter1++;
    }

    private static void increment2() {
        counter2++;
    }

    class NormalWorker implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                increment();
                increment1();
            }
        }
    }

    class DaemonWorker implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                increment();
                increment2();
            }
            daemonCounter++;
        }
    }

    public static void main(String[] args) {
        joined();
        noJoin();
        daemonWithJoin();
    }

    public static void joined() {
        System.out.println("When t1 & t2 are joined main waits for them to finish. I get consistent results.");
        System.out.println("If increment was not synchronized, the joined would ALSO be inconsistent.");
        counter = counter1 = counter2 = 0;
        daemonCounter = 0;
        Thread t1 = new Thread(new I_Daemons().new NormalWorker());
        Thread t2 = new Thread(new I_Daemons().new DaemonWorker());
        t1.setDaemon(false);
        t2.setDaemon(false);
        t1.setName("t1 --> Normal Worker");
        t2.setName("t2 --> Daemon Worker");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ctr: " + counter + "\tCtr1: " + counter1 + "\tCtr2: " + counter2);
        System.out.println("Daemon counter: " + daemonCounter);
        System.out.println("==========================================================");
    }

    public static void noJoin() {
        System.out.println("Without join results are inconsistent because main thread is done before the others finish.");
        counter = counter1 = counter2 = 0;
        daemonCounter = 0;
        Thread t1 = new Thread(new I_Daemons().new NormalWorker());
        Thread t2 = new Thread(new I_Daemons().new DaemonWorker());
        t1.setDaemon(false);
        t2.setDaemon(false);
        t1.setName("t1 --> Normal Worker");
        t2.setName("t2 --> Daemon Worker");
        t1.start();
        t2.start();
        System.out.println("Ctr: " + counter + "\tCtr1: " + counter1 + "\tCtr2: " + counter2);
        System.out.println("Daemon counter: " + daemonCounter);
        System.out.println("==========================================================");
    }

    public static void daemonWithJoin() {
        System.out.println("Daemon t2 WITH join.");
        System.out.println("Daemon runs in the background. It can run more than once!");
        counter = counter1 = counter2 = 0;
        daemonCounter = 0;
        Thread t1 = new Thread(new I_Daemons().new NormalWorker());
        Thread t2 = new Thread(new I_Daemons().new DaemonWorker());
        t1.setDaemon(false);
        t2.setDaemon(true);
        t1.setName("t1 --> Normal Worker");
        t2.setName("t2 --> Daemon Worker");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ctr: " + counter + "\tCtr1: " + counter1 + "\tCtr2: " + counter2);
        System.out.println("Daemon counter: " + daemonCounter);
        System.out.println("==========================================================");
    }
}

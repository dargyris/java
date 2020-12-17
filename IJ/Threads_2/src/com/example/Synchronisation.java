package com.example;

public class Synchronisation {

    public static void main(String[] args) {
        CountdownSync countdown = new CountdownSync();

        Thread t1 = new CountdownThreadSync(countdown);
        t1.setName("t1");

        Thread t2 = new CountdownThreadSync(countdown);
        t2.setName("t2");

        t1.start();
        t2.start();
    }

}

class CountdownThreadSync extends Thread {
    private CountdownSync threadCountdown;

    public CountdownThreadSync(CountdownSync countdown) {
        threadCountdown = countdown;
    }

    @Override
    public void run() {
        threadCountdown.doCountdown();
    }
}

class CountdownSync {
    private Integer j = 0;

    public void doCountdown() {
        String color;   // local variable: stored in the thread stack

        switch (Thread.currentThread().getName()) { // Use String in a switch statement
            case "t1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "t2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
                break;
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
        }

        synchronized (this) {  // heap variable object instance
            for (j = 10; j > 0; j--) {
                System.out.println(color + "  " + Thread.currentThread().getName() + ": j = " + j);
            }
        }

    }
}
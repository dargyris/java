package com.example;

public class Main {

    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        Thread t1 = new CountdownThread(countdown);
        t1.setName("t1");

        Thread t2 = new CountdownThread(countdown);
        t2.setName("t2");

        t1.start();
        t2.start();
    }

}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    @Override
    public void run() {
        threadCountdown.doCountdown();
    }
}

class Countdown {
    private int j;

    public void doCountdown() {
        String color;

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

        for (j = 10; j > 0; j--) {
            System.out.println(color + "  " + Thread.currentThread().getName() + ": j = " + j);
        }
    }
}

class ThreadColor {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
}

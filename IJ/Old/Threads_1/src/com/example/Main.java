package com.example;

import static com.example.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "MAIN Start");

        Thread thread__A = new MyThread(); // SUB CLASS Thread ... = new MyThread();
        thread__A.setName("thread__A");
        thread__A.start();

        new Thread() {  // Anonymous thread object (would've been B
            public void run() {
                System.out.println(ANSI_GREEN + "thread__B (Anonymous Thread Object)");
            }
        }.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread__C = new Thread(myRunnable);
        thread__C.setName("thread__C");
        thread__C.start();

        Thread thread__D = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "\t~> thread__D");
                try {
                    System.out.println(ANSI_RED + "\t~> thread__D joins to thread__A");
                    thread__A.join(2000);
                    System.out.println(ANSI_RED + "\t~> thread__D: thread__A terminated or timed out (2 sec).");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "\t~> thread__D was interrupted.");
                }
            }
        });
        thread__D.setName("thread__D");
        thread__D.start();

//        thread__A.interrupt();
        System.out.println(ANSI_PURPLE + "MAIN End");
    }
}

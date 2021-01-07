package com.example;

import static com.example.ThreadColor.ANSI_BLUE;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "--> Hello from " + currentThread().getName());
        try {
            System.out.println("--> Sleep for 3 sec.");
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println(ANSI_BLUE + "--> Wake up call.");
            return;
        }

        System.out.println(ANSI_BLUE + "--> Three seconds passed.");
    }
}

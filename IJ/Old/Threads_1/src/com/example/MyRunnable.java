package com.example;

import static com.example.ThreadColor.ANSI_CYAN;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_CYAN + "~ MyRunnable's run()");
    }
}

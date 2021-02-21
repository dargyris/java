package org.example.multithreading.simoultoutput;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

public class B_Strings {
    private static String text1 = "From text 1.";
    private static String text2 = "From text 2.";
    private static StringBuffer s1 = new StringBuffer();
    private static StringBuffer s2 = new StringBuffer();
    private static Lock lock = new ReentrantLock(true);
    private static Condition condition = lock.newCondition();

    private static void stringAppender1() {
        lock.lock();
        for (int i = 0; i < 10; i++) {
            s1.append("String appender 1: Counter --> " + i + "\n");
        }
        lock.unlock();
    }

    private static void stringAppender2() {
        lock.lock();
        for (int i = 100; i < 105; i++) {
            s2.append("String appender 2: Counter --> " + i + "\n");
        }
        lock.unlock();
    }

    private static void morph() {
        lock.lock();
        String[] s1string = s1.toString().split("\n");
        String[] s2string = s2.toString().split("\n");
        StringBuilder s = new StringBuilder();
        int lines1 = s1string.length;
        int lines2 = s2string.length;

        for (int i = 0; i < Math.min(lines1, lines2); i++) {
            s.append(s1string[i] + "\t\t" + s2string[i] + "\n");
        }
        int diffLines = lines1 - lines2;
        if (diffLines > 0) {
            for (int i = lines2; i < lines1; i++) {
                s.append(s1string[i] + "\n");
            }
        }
        if (diffLines < 0) {
            for (int i = lines1; i < lines2; i++) {
                s.append(s1string[0].toString().replaceAll(".", " ") + "\t\t" + s2string[i] + "\n");
            }
        }
        System.out.println(s.toString());
        lock.unlock();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                stringAppender1();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                stringAppender2();
            }
        });

        Thread morphThread = new Thread(new Runnable() {
            @Override
            public void run() {
                morph();
            }
        });

        t1.start();
        t2.start();
        morphThread.start();

        try {
            t1.join();
            t2.join();
            morphThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package org.example.multithreading;

public class A_SingleThreading {
    class Runner1 {
        public void execute() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runner1: " + i);
            }
        }
    }

    class Runner2 {
        public void execute() {
            for (int i = 0; i < 10; i++) {
                System.out.println("\tRunner2: " + i);
            }
        }
    }

    public static void main(String[] args) {
        A_SingleThreading.Runner1 runner1 = new A_SingleThreading().new Runner1();
        A_SingleThreading.Runner2 runner2 = new A_SingleThreading().new Runner2();
        runner1.execute();
        runner2.execute();
    }
}

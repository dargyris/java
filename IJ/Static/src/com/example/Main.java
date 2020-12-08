package com.example;

public class Main {
    public String mainVar = "Yo! Ssssup?";

    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
        System.out.println("Non static: " + firstInstance.getNumInst());
        System.out.println();

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
        System.out.println("Non static: " + secondInstance.getNumInst());
        System.out.println();

        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());
        System.out.println("Non static: " + thirdInstance.getNumInst());
        System.out.println();

        System.out.println("1st Instance number: " + StaticTest.getNumInstances());
        System.out.println("2nd Instance number: " + StaticTest.getNumInstances());
        System.out.println("3rd Instance number: " + StaticTest.getNumInstances());
        const
        testFunc();
    }

    public static void testFunc() {
        Main main = new Main();
        System.out.println();
        System.out.println(main.mainVar);
    }
}

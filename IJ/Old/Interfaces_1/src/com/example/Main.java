package com.example;

public class Main {

    public static void main(String[] args) {
        ITelephone diamantisPhone;
        diamantisPhone = new DeskPhone(123456);
        diamantisPhone.powerOn();
        diamantisPhone.callPhone(123456);
        diamantisPhone.answer();

        System.out.println();
        diamantisPhone = new MobilePhone(1234);
    }
}

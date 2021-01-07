package com.example;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int phoneNumber) {
        this.myNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        // No action. A desktop phone is always on.
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now dialing " + phoneNumber + " on desktop phone.");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk-phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring!!");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

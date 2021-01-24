package org.example.master.io.adventure.trycatch;

import java.io.IOException;

public class MyException extends IOException {
    public void printMessage() {
        System.out.println("This is my exception message!");
    }
}

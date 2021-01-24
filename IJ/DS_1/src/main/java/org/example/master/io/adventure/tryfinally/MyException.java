package org.example.master.io.adventure.tryfinally;

import java.io.IOException;

public class MyException extends IOException {
    public void printMessage() {
        System.out.println("This is my exception message!");
    }
}

package com.example;
// These are the methods that MUST be implemented by a class that implements this interface.
// We are using interfaces as "contracts" to ensure that code is not going to break
// So that the methods implemented are going to keep the same signatures throughout the codebase.
// By default interface methods are PUBLIC.
public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
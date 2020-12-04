package com.example;

interface Accessible {                  // Visibility: default (package-private): available only within com.example (its package.)
    int SOME_CONSTANT = 100;            // Visibility: Interface variable: public static final
    public void methodA();              // Visibility: visible everywhere when the package is imported.
    void methodB();                     // Visibility: All Interface methods are automatically PUBLIC
    boolean methodC();                  // Visibility: same
}

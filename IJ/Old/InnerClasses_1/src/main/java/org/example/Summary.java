package org.example;

public class Summary {
    // 4 types of nested Classes:
    // Non-static or Inner class, Static, Local class, Anonymous class

    // 1. Non-static or Inner class: A class within a class.
    // Just for organization / segregation purposes.
    // ================================================================

    // 2. Local class: An interface within a class.
    // ----------------------------------------------------------------
    // public class OuterClass { ... interface ISome {...} }
    //
    // in main:
    // OuterClass outer = new...
    // class SomeClass implements ISome {...}
    // SomeClass some = new ...
    // outer.someMethod(some);
    // ================================================================

    // 3. Anonymous class: Also a local class, but has no name.
    // It has to be declared and instantiated at the same time.
    // Use only once.
    // ----------------------------------------------------------------
    // public class OuterClass { ... interface ISome {...} }
    //
    // in main:
    // OuterClass outer = new...
    // outer.someMethod(new OuterClass.ISome() {...});
    // ================================================================

    // ABSTRACT Classes
    // Define fields, Constructor, getter/setter, and method declarations.
    // Use keyword abstract!
    // Not everything needs to be abstract. I can have non-abstract getters or anything.

    // Interface:
    // Can't be instantiated.
    // Can't have constructors.
    // Since Java 8, can contain methods also with implementations.
    // Since Java 9, can contain private methods
    // All methods automatically public.
    // All variables public static final.

    // Abstract class:
    // Can't be instantiated.
    // Can have constructors.
    // Can also have methods with default implementations.
    // Methods and fields can have any visibility.

    // Important rule:
    // Is a: extends Class
    // Has a: variable
    // Can: implements Interface. Many "cans" can aggregate in an abstract class which
    // will instead be extended. Interfaces are good for things that are implemented by many
    // unrelated classes.

}

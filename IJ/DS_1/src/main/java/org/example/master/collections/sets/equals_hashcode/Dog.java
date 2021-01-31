package org.example.master.collections.sets.equals_hashcode;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Dog) {
            String objName = ((Dog) obj).getName();
            return name.equals(objName);
        }

        return false;
    }
}

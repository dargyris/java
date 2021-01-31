package org.example.master.collections.sets.equals_hashcode;

public class Main {
    public static void main(String[] args) {
        Dog roverDog = new Dog("Rover");
        Labrador roverLab = new Labrador("Rover");

        System.out.println(roverDog.equals(roverLab));
        System.out.println(roverLab.equals(roverDog));
    }
}

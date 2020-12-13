package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ISaveable diamantis = new Player("Diamantis", 100, 100);
        System.out.println(diamantis.toString());
        saveObject(diamantis);
        System.out.println('\n');

        System.out.println(diamantis.getClass());
        ((Player) diamantis).setHitPoints(200);
        System.out.println(diamantis);
        System.out.println(diamantis.getClass());
        saveObject(diamantis);
        System.out.println('\n');

//        loadObject(diamantis);
        System.out.println(diamantis);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static List<String> readValues() {   // Simulate getting values from file
        List<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("1. Enter a string");
        System.out.println("0. Quit");
        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index++, stringInput);
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}

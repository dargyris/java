package org.example.master.io.serialization;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are: ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = handleInput(scanner.nextLine().toUpperCase());
            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You can't go in that direction.");
            }
        }
    }

    public static String handleInput(String input) {
        List<String> inputList = new ArrayList<>();
        for (String str : input.split(" ")) {
            inputList.add(str);
        }

        if (inputList.contains("W") || inputList.contains("WEST")) {
            return "W";
        }

        if (inputList.contains("N") || inputList.contains("NORTH")) {
            return "N";
        }

        if (inputList.contains("E") || inputList.contains("EAST")) {
            return "E";
        }

        if (inputList.contains("S") || inputList.contains("SOUTH")) {
            return "S";
        }

        if (inputList.contains("Q") || inputList.contains("QUIT")) {
            return "Q";
        }

        return "A";
    }
}

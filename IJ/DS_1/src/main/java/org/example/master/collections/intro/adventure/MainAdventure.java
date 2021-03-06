package org.example.master.collections.intro.adventure;

import java.util.*;

public class MainAdventure {
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer learning java."));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building."));
        locations.put(2, new Location(2, "You are at the top of a hill."));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring."));
        locations.put(4, new Location(4, "You are in a valley beside a stream."));
        locations.put(5, new Location(5, "You are in the forest."));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        int loc = 1;
        int prevLoc = 1;
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

        //        String[] inputArray = input.split(" ");
        //        List<String> inputList = Arrays.asList(inputArray);

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

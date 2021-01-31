package org.example.master.io.adventure.bufferedreader;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<>();

    static {
        try (BufferedReader locFile = new BufferedReader(new FileReader("locations_written.txt"))) {
            String input;
            String regExp = "^(\\d{1,3})(.)(.*)";
            Pattern pattern = Pattern.compile(regExp);
            while ((input = locFile.readLine()) != null) {
                Matcher matcher = pattern.matcher(input);
                matcher.find();
                int loc = Integer.parseInt(matcher.group(1));
                String description = matcher.group(3);
                locations.put(loc, new Location(loc, description, new HashMap<>()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            scanner = new Scanner(new FileReader("locations.txt"));
//            scanner.useDelimiter(".");
//            while (scanner.hasNextLine()) {
//                int loc = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String description = scanner.nextLine();
//                System.out.println("Imported loc: " + loc + ". " + description);
//                Map<String, Integer> tempExit = new HashMap<>();
//                locations.put(loc, new Location(loc, description, tempExit));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (scanner != null) {
//                scanner.close();
//            }
//        }

        try (BufferedReader dirFile = new BufferedReader(new FileReader("directions_written.txt"))) {
            String input;
            String regExp = "^(\\d{1,3})(.)(.*)(\\,)(\\d{1,3})";
            Pattern pattern = Pattern.compile(regExp);
            while ((input = dirFile.readLine()) != null) {
                Matcher matcher = pattern.matcher(input);
                matcher.find();

                int loc = Integer.parseInt(matcher.group(1));
                String direction = matcher.group(3);
                int destination = Integer.parseInt(matcher.group(5));
                locations.get(loc).addExit(direction, destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            scanner = new Scanner(new BufferedReader(new FileReader("direction.txt")));
//            scanner.useDelimiter(".");
//            while (scanner.hasNextLine()) {
//                int loc = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String direction = scanner.next();
//                scanner.skip(scanner.delimiter());
//                String dest = scanner.nextLine();
//                int destination = Integer.parseInt(dest);
//                Location location = locations.get(loc);
//                location.addExit(direction, destination);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (scanner != null) {
//                scanner.close();
//            }
//        }
//
    }

    public static void main(String[] args) throws IOException {
        try (BufferedWriter locFile = new BufferedWriter(new FileWriter("locations_written.txt"));
             BufferedWriter dirFile = new BufferedWriter(new FileWriter("directions_written.txt"))
        ) {
            for (Location location : locations.values()) {
                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
                for (String direction : location.getExits().keySet()) {
                    if (!direction.equalsIgnoreCase("Q")) {
                        dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction) + "\n");
                    }
                }
            }
        }

        try (DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations_written.dat")));
             DataOutputStream dirFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("directions_written.dat")))
        ) {
            for (Location location : locations.values()) {
                locFile.writeInt(location.getLocationID());
                locFile.writeUTF(location.getDescription());
                locFile.writeInt(location.getExits().size() - 1);
                for (String direction : location.getExits().keySet()) {
                    if (!direction.equalsIgnoreCase("Q")) {
                        dirFile.writeUTF(direction);
                        dirFile.writeInt(location.getExits().get(direction));
                    }
                }
            }
        }
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}

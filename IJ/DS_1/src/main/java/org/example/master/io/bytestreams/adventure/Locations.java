package org.example.master.io.bytestreams.adventure;

import java.io.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<>();

//    static {
//        try (BufferedReader locFile = new BufferedReader(new FileReader("locations_written.txt"))) {
//            String input;
//            String regExp = "^(\\d{1,3})(.)(.*)";
//            Pattern pattern = Pattern.compile(regExp);
//            while ((input = locFile.readLine()) != null) {
//                Matcher matcher = pattern.matcher(input);
//                matcher.find();
//                int loc = Integer.parseInt(matcher.group(1));
//                String description = matcher.group(3);
//                locations.put(loc, new Location(loc, description, new HashMap<>()));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (BufferedReader dirFile = new BufferedReader(new FileReader("directions_written.txt"))) {
//            String input;
//            String regExp = "^(\\d{1,3})(.)(.*)(\\,)(\\d{1,3})";
//            Pattern pattern = Pattern.compile(regExp);
//            while ((input = dirFile.readLine()) != null) {
//                Matcher matcher = pattern.matcher(input);
//                matcher.find();
//
//                int loc = Integer.parseInt(matcher.group(1));
//                String direction = matcher.group(3);
//                int destination = Integer.parseInt(matcher.group(5));
//                locations.get(loc).addExit(direction, destination);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

    static {
        try (DataInputStream locFile = new DataInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))) {
            boolean eof = false;
            while (!eof) {
                Map<String, Integer> exits = new LinkedHashMap<>();
                try {
                    int loc = locFile.readInt();
                    String description = locFile.readUTF();
                    int numExits = locFile.readInt();
                    for (int i = 0; i < numExits; i++) {
                        String direction = locFile.readUTF();
                        int destination = locFile.readInt();
                        exits.put(direction, destination);
                    }
                    locations.put(loc, new Location(loc, description, exits));
                } catch (EOFException e) {
                    eof = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        try (DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))) {
            for (Location location : locations.values()) {
                locFile.writeInt(location.getLocationID());
                locFile.writeUTF(location.getDescription());
                locFile.writeInt(location.getExits().size() - 1);
                for (String direction : location.getExits().keySet()) {
                    if (!direction.equalsIgnoreCase("Q")) {
                        locFile.writeUTF(direction);
                        locFile.writeInt(location.getExits().get(direction));
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

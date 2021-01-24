package org.example.master.regex;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IO {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(new FileReader("locations.txt"))) {
            String regExp = "^(\\d{1,3})(.)(.*)";
            Pattern pattern = Pattern.compile(regExp);
            while (input.hasNextLine()) {
                Matcher matcher = pattern.matcher(input.nextLine());
                matcher.find();

                int loc = Integer.parseInt(matcher.group(1));
                String description = matcher.group(3);
                System.out.println(loc + " *** " + description);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner input = new Scanner(new FileReader("directions.txt"))) {
            String regExp = "^(\\d{1,3})(.)(.*)(\\,)(\\d{1,3})";
            Pattern pattern = Pattern.compile(regExp);
            while (input.hasNextLine()) {
                Matcher matcher = pattern.matcher(input.nextLine());
                matcher.find();

                int loc = Integer.parseInt(matcher.group(1));
                String direction = matcher.group(3);
                int destination = Integer.parseInt(matcher.group(5));
                System.out.println(loc + " *** " + direction + " *** " + destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

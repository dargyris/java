package org.example.master.compare;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "Compiled high level object oriented language.");
        languages.put("Python", "Interpreted object oriented language.");
        languages.put("Algol", "Algorithmic language.");
        languages.put("Basic", "Beginners all purpose symbolic language.");
        languages.put("Lisp", "Mad language.");

        if (languages.containsKey("java")) {
            System.out.println("Already exists");
        } else {
            languages.put("java", "New stuff.");
        }
        System.out.println(languages.get("java"));
        if (languages.remove("Algol", "A family of algorithmic languages")) {
            System.out.println("Algol removed.");
        } else {
            System.out.println("Algol not removed. K-V pair not found.");
        }

        System.out.println(languages.replace("Lisp", "A functional programming language."));
        for (String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }

    }
}

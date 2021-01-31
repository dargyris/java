package org.example.master.collections.sets.algeb_operations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }
        System.out.println("squares.size(): " + squares.size());
        System.out.println("cubes.size(): " + cubes.size());

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("union.size(): " + union.size());

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("intersection.size(): " + intersection.size());
        for (int element : intersection) {
            System.out.println(element + "\t: square --> " + Math.sqrt(element) + "\tcube --> " + Math.cbrt(element));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("===============================================");
        Set<String> natureTakeDivine = new HashSet<>(nature);
        natureTakeDivine.removeAll(divine);
        System.out.print("nature - divine:");
        printSet(natureTakeDivine);

        System.out.println("===============================================");
        Set<String> divineTakeNature = new HashSet<>(divine);
        divineTakeNature.removeAll(nature);
        System.out.print("divine - nature:");
        printSet(divineTakeNature);
        System.out.println();

        System.out.println("===============================================");
        Set<String> union1 = new HashSet<>(nature);
        union1.addAll(divine);
        Set<String> intersection1 = new HashSet<>(nature);
        intersection1.retainAll(divine);
        Set<String> symmetricDiff = new HashSet<>(union1);
        symmetricDiff.removeAll(intersection1);
        System.out.println("Symmetric difference: ");
        printSet(symmetricDiff);
        System.out.println();

        System.out.println("===============================================");
        if (nature.containsAll(divine)) {
            System.out.println("Divine is subset of nature");
        }

        if (nature.containsAll(intersection1)) {
            System.out.println("Intersection1 is subset of nature.");
        }

        if (divine.containsAll(intersection1)) {
            System.out.println("Intersection1 is a subset of divine.");
        }

    }

    private static void printSet(Set<String> set) {
        System.out.print("\t");
        for (String str : set) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}

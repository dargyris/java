package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class MovieTest {
    ArrayList<Movie> list = new ArrayList<>();
    @Before
    public final void setUp() {
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
    }

    @Test
    public final void checkYearSortComparable() {
        Collections.sort(list);
        System.out.println("Movies after sorting:");
        list.forEach(movie -> System.out.println(movie.getName()
        + " " + movie.getRating() + " " + movie.getYear()));
        System.out.println();
    }

    @Test
    public final void checkYearSortComparator() {
        System.out.println("Comparator: Sort by year");
        YearCompare yearCompare = new YearCompare();
        Collections.sort(list, yearCompare);
        list.forEach(movie -> System.out.println(movie.getName()
                + " " + movie.getRating() + " " + movie.getYear()));
        System.out.println();
    }

    @Test
    public final void checkRatingSortComparator() {
        System.out.println("Comparator: Sort by Rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        list.forEach(movie -> System.out.println(movie.getName()
                + " " + movie.getRating() + " " + movie.getYear()));
        System.out.println();
    }

    @Test
    public final void checkNameSortComparator() {
        System.out.println("Comparator: Sort by Name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        list.forEach(movie -> System.out.println(movie.getName()
                + " " + movie.getRating() + " " + movie.getYear()));
        System.out.println();
    }

    @After
    public final void nothing() {
        // Nothing!
    }
}

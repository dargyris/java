package org.example;

import java.util.Comparator;

public class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    public int compareTo(Movie movie) {
        return this.year - movie.year;
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

}

class RatingCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        if (m1.getRating() > m2.getRating()) return -1;
        if (m1.getRating() < m2.getRating()) return 1;
        return 0;
    }
}

class NameCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName());
    }
}

class YearCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        if (m1.getYear() > m2.getYear()) return -1;
        if (m1.getRating() < m2.getRating()) return 1;
        return 0;
    }
}
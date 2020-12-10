package com.example;

public class Song {
    private String name;
    private int duration; // seconds

    public Song(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

//    public Song songFactory(String name, int duration) {
//        return new Song(name, duration);
//    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.duration;
    }
}

package com.example;

import java.util.*;

public class Playlist {
    private String name;
    private List<Song> playlist;

    public Playlist(String name) {
        this.name = name;
        playlist = new LinkedList<>();
    }

    public int getSongIndex(String songName) {
        if (playlist.isEmpty()) {
            return -1;
        }

        for (int i = 0; i < playlist.size(); i++) {
            if (playlist.get(i).getTitle().equals(songName)) {
                return i;
            }
        }

        return -1;
    }

    public List<Song> getPlaylist() {
        return playlist;
    }

    public boolean listSongs() {
        if (playlist.isEmpty()) {
            return false;
        }

        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(playlist.get(i).toString());
        }
        return true;
    }

    public void play() {
        ListIterator<Song> songIterator = playlist.listIterator();
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        while(!quit) {
            char input = scanner.next().charAt(0);
            switch(input) {
                case '0':
                    quit = true;
                    break;
                case 'l':
                    if (songIterator.hasNext()) {
                        System.out.println("Now playing: " + songIterator.next());
                    }
                    break;
                case 'h':
                    if (songIterator.hasPrevious()) {
                        System.out.println("Now playing: " + songIterator.previous());
                    }
            }


        }
    }

    public boolean addSong(String songTitle, String albumName, String artistName, MyCollection collection) {
        Album album = collection.getAlbum(albumName, artistName);
        if (album == null) {
            return false;
        }

        int songIndex = album.getSongIndex(songTitle);
        if (songIndex < 0) {
            return false;
        }

        Song songToAdd = album.getSong(songTitle);
        playlist.add(songToAdd);
        return true;
    }

}

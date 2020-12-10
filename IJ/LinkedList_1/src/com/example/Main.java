package com.example;

import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final MyCollection myCollection = new MyCollection();
    public static void main(String[] args) {
        Album album = new Album("Dire Straits", "Dire Straits");
        album.addSong("Down to the Waterline", 240);
        album.addSong("Water of Love", 240);
        album.addSong("Setting Me Up", 300);
        album.addSong("Six Blade Knife", 249);
        album.addSong("Southbound Again", 430);
        album.addSong("Sultans of Swing", 238);
        album.addSong("In the Gallery", 378);
        album.addSong("Wild West End", 368);
        myCollection.addAlbum(album);

        myCollection.addAlbum("Riding with the King", "E. Clapton B.B. King");
        myCollection.addToAlbum("Riding with the King", "E. Clapton B.B. King", "Riding with the King", 305);
        myCollection.addToAlbum("Riding with the King", "E. Clapton B.B. King", "Ten Long Years", 318);
        myCollection.addToAlbum("Riding with the King", "E. Clapton B.B. King", "Key to the Highway", 329);
        myCollection.addToAlbum("Riding with the King", "E. Clapton B.B. King", "Marry You", 453);
        myCollection.addToAlbum("Riding with the King", "E. Clapton B.B. King", "Three O'Clock Blues", 348);
        myCollection.addToAlbum("Riding with the King", "E. Clapton B.B. King", "Help the Poor", 367);
        myCollection.addToAlbum("Riding with the King", "E. Clapton B.B. King", "I Wanna Be", 374);
        myCollection.addToAlbum("Riding with the King", "E. Clapton B.B. King", "Worried Life Blues", 361);
        myCollection.addToAlbum("Riding with the King", "E. Clapton B.B. King", "Days of Old", 461);
        myCollection.addToAlbum("Riding with the King", "E. Clapton B.B. King", "Hold On, I'm Coming", 481);

        myCollection.listAlbums();
        System.out.println(myCollection.listAlbumSongs("Dire Straits", "Dire Straits"));
        System.out.println(myCollection.listAlbumSongs("Riding with the King", "E. Clapton B.B. King"));

        Playlist playlist = new Playlist("Blues");
        playlist.addToPlaylist("Dire Straits", "Dire Straits", "Down to the Waterline", myCollection);
        playlist.addToPlaylist("Riding with the King", "E. Clapton B.B. King", "Ten Long Years", myCollection);
        playlist.addToPlaylist("Dire Straits", "Dire Straits", "Southbound Again", myCollection);
        playlist.addToPlaylist("Riding with the King", "E. Clapton B.B. King", "Days of Old", myCollection);
        playlist.listSongs();

        boolean quit = false;
        ListIterator<Song> songIterator = playlist.getPlaylist().listIterator();
        boolean forward = true;
        while (!quit) {
            char input = scanner.next().charAt(0);
            switch (input) {
                case 'q':
                    quit = true;
                    break;
                case 'l':
//                    if (!forward) {
//                        if (songIterator.hasNext()) {
//                            songIterator.next();
//                        }
//                    forward = true;
//                    }
                    if (songIterator.hasNext()) {
                        Song nextSong = songIterator.next();
                        System.out.println(playlist.getPlaylist().indexOf(nextSong));
                        System.out.println("Played: " + nextSong.toString());
                    }
                    break;
                case 'h':
//                    if (forward) {
//                        if (songIterator.hasPrevious()) {
//                            songIterator.previous();
//                        }
//                    forward = false;
//                    }
                    if (songIterator.hasPrevious()) {
                        System.out.println("Played: " + songIterator.previous().toString());
                    }
                    break;
                default:
                    break;
            }

        }


    }
}

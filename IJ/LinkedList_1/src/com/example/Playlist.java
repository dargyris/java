package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Playlist {
    private String playlistName;
    private List<Song> playlist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        playlist = new LinkedList<>();
    }

    public List<Song> getPlaylist() {
        return playlist;
    }

    public int getSongIndex(String songName) {
        if (!playlist.isEmpty()) {
            for (int i = 0; i < playlist.size(); i++) {
                if (playlist.get(i).getName().equals(songName)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void printSong(int i) {
        Song song = playlist.get(i);
        System.out.println((i + 1) + ". " + song.toString());
    }

    public int listSongs() {
        if (playlist.isEmpty()) {
            return -1;
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Playlist: " + playlistName);
        for (int i = 0; i < playlist.size(); i++) {
            printSong(i);
        }
        System.out.println("===============================================");
        return -2;
    }

    public Album albumFactory(String albumName, String artistName) {
        return new Album(albumName, artistName);
    }

    public boolean addToPlaylist(String albumName, String artistName, String songName, MyCollection myCollection) {
        Album album = myCollection.getAlbum(albumName, artistName);
        if (album == null) {
            return false;
        }
        Song song = album.getSong(songName);
        if (song == null) {
            return false;
        }
        playlist.add(song);
        return true;
    }

    public boolean addToPlaylist(String albumName, String artistName, int songIndex, MyCollection myCollection) {
        Album album = myCollection.getAlbum(albumName, artistName);
        if (album == null) {
            return false;
        }
        Song song = album.getSong(songIndex);
        if (song == null) {
            return false;
        }
        playlist.add(song);
        return true;
    }

    public boolean removeFromPlaylist(String albumName, String artistName, String songName, MyCollection myCollection) {
        Album album = myCollection.getAlbum(albumName, artistName);
        if (album == null) {
            return false;
        }
        int songIndex = album.getSongIndex(songName);
        if (songIndex < 0) {
            return false;
        }
        int songIndexPlaylist = getSongIndex(songName);
        if (songIndexPlaylist < 0) {
            return false;
        }
        playlist.remove(songIndexPlaylist);
        return true;
    }

}

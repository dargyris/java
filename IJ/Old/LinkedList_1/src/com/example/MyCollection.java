package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyCollection {
    private List<Album> myCollection;

    public MyCollection() {
        myCollection = new ArrayList<>();
    }

    // In myCollection list of Album objects the album unique identifiers are
    // albumName and artistName
    public int getAlbumIndex(String albumName, String artistName) {
        if (!myCollection.isEmpty()) {
            for (int i = 0; i < myCollection.size(); i++) {
                if (myCollection.get(i).getAlbumName().equals(albumName)
                && myCollection.get(i).getArtistName().equals(artistName)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public Album getAlbum(String albumName, String artistName) {
        int albumIndex = getAlbumIndex(albumName, artistName);
        if (albumIndex < 0) {
            return null;
        }

        return myCollection.get(albumIndex);
    }

    public void printAlbum(int i) {
        Album album = myCollection.get(i);
        System.out.println((i + 1) + ". " + album.toString());
    }

    public int listAlbums() {
        if (myCollection.isEmpty()) {
            return -1;
        }

        System.out.println("-----------------------------------------------");
        for (int i = 0; i < myCollection.size(); i++) {
            printAlbum(i);
        }
        System.out.println("===============================================");
        return -2;
    }

    public int listAlbumSongs(String albumName, String artistName) {
        int albumIndex = getAlbumIndex(albumName, artistName);
        return myCollection.get(albumIndex).listSongs();
    }

    public int addAlbum(String albumName, String artistName) {
        int albumIndex = getAlbumIndex(albumName, artistName);
        if (albumIndex >= 0) {
            return albumIndex;  // Album already in my collection at index.
        }

        myCollection.add(new Album(albumName, artistName));
        return -2; // Success
    }

    public int addAlbum(Album newAlbum) {
        String albumName = newAlbum.getAlbumName();
        String artistName = newAlbum.getArtistName();
        int albumIndex = getAlbumIndex(albumName, artistName);
        if (albumIndex >= 0) {
            return albumIndex;
        }
        myCollection.add(newAlbum);
        return getAlbumIndex(albumName, artistName);
    }

    public int removeAlbum(String albumName, String artistName) {
        int albumIndex = getAlbumIndex(albumName, artistName);
        if (albumIndex < 0) {
            return -1; // Album does not exist
        }
        myCollection.remove(albumIndex);
        return -2;  // Success
    }

    public int addToAlbum(String albumName, String artistName, String songName, int duration) {
        int albumIndex = getAlbumIndex(albumName, artistName);
        if (albumIndex < 0) {
            return -1;  // Album does not exist
        }
        return myCollection.get(albumIndex).addSong(songName, duration);
    }

    public int removeFromAlbum(String albumName, String artistName, String songName) {
        int albumIndex = getAlbumIndex(albumName, artistName);
        if (albumIndex < 0) {
            return -1;  // Album does not exist
        }
        return myCollection.get(albumIndex).removeSong(songName);
    }

    public int modifyInAlbum(String albumName, String artistName, String songName, String newSongName, int newSongDuration) {
        int albumIndex = getAlbumIndex(albumName, artistName);
        if (albumIndex < 0) {
            return -1;  // Album does not exist
        }
        return myCollection.get(albumIndex).modifySong(songName, newSongName, newSongDuration);
    }

}

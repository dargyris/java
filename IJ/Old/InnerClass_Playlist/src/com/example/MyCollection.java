package com.example;

import java.util.ArrayList;
import java.util.List;

public class MyCollection {
    private String name;
    private List<Album> myCollection;

    public MyCollection(String name) {
        this.name = name;
        myCollection = new ArrayList<>();
    }

    public int getAlbumIndex(String albumName, String artistName) {
        if (myCollection.isEmpty()) {
            return -1;
        }

        for (int i = 0; i < myCollection.size(); i++) {
            Album currentAlbum = myCollection.get(i);
            if (currentAlbum.getArtistName().equals(artistName)
            && currentAlbum.getAlbumName().equals(albumName)) {
                return i;
            }
        }

        return -1;
    }

    public Album getAlbum(String albumName, String artistName) {
        int albumIndex = getAlbumIndex(albumName, artistName);
        if (albumIndex < 0) {
            return null;    // Album does not exist.
        }

        return myCollection.get(albumIndex);
    }

    public boolean addAlbum(Album newAlbum) {
        String albumName = newAlbum.getAlbumName();
        String artistName = newAlbum.getArtistName();
        int albumIndex = getAlbumIndex(albumName, artistName);
        if (albumIndex >= 0) {
            return false;   // Album already exists.
        }

        myCollection.add(newAlbum);
        return true;
    }
}

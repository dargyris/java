package com.example;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumName;
    private String artistName;
    private List<Song> songList;

    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        songList = new ArrayList<>();
    }

//    public Album albumFactory(String albumName, String artistName) {
//        return new Album(albumName, artistName);
//    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    @Override
    public String toString() {
        return albumName + "\t" + artistName;
    }

    // In the album list of song objects the song unique identifier is its name.
    public int getSongIndex(String songName) {
        if (!songList.isEmpty()) {
            for (int i = 0; i < songList.size(); i++) {
                if (songList.get(i).getName().equals(songName)) {
                    return i;
                }
            }
        }
        return -1;
    }

    // Find songName by index in an album songList
    public String getSongName(int index) {
        int size = songList.size() - 1;
        if (!songList.isEmpty()) {
            if (index > 0 || index <= size) {
                return songList.get(index).getName();
            }
        }
        return String.valueOf(size);    // Returns the number of songs in an album
    }

    // Get Song object by index
    public Song getSong(int songIndex) {
        if (songIndex < 0 || songIndex > songList.size() - 1) {
            return null;
        }

        return songList.get(songIndex);
    }

    // Get Song object by name
    public Song getSong(String songName) {
        int songIndex = getSongIndex(songName);
        if (songIndex < 0) {
            return null;
        }

        return songList.get(songIndex);
    }

    // Prints one song by index i on one line.
    public void printSong(int i) {
        Song song = songList.get(i);
        System.out.println((i + 1) + ". " + song.toString());
    }

    // Lists all the songs in the songList (intended for Album lists)
    public int listSongs() {
        if (songList.isEmpty()) {
            return -1;  // No songs in the list.
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Album: " + albumName);
        for (int i = 0; i < songList.size(); i++) {
            printSong(i);
        }
        System.out.println("===============================================");
        return -2;  // Success
    }

    public int addSong(String name, int duration) {
        Song song = new Song(name, duration);
        int index = getSongIndex(name);
        if (index >= 0) {
            return index; // Song already exists at index.
        }
        songList.add(song);
        return -2;  // Success.
    }

    public int removeSong(String name) {
        int index = getSongIndex(name);
        if (index < 0) {
            return -1;  // Song does not exist.
        }
        songList.remove(index);
        return -2; // Success.
    }

    public int modifySong(String name, String newSongName, int newSongDuration) {
        Song newSong = new Song(newSongName, newSongDuration);
        int oldIndex = getSongIndex(name);
        if (oldIndex < 0) {
            return -1;  // Old song does not exist.
        }
        int newIndex = getSongIndex(newSong.getName());
        if (newIndex >= 0) {
            return newIndex;    // New song exists at newIndex.
        }
        songList.set(oldIndex, newSong);
        return oldIndex;    // New song was successfully placed at oldIndex.
    }

}

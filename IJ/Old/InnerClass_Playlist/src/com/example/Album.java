package com.example;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumName;
    private String artistName;
    private SongList songList;

    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        songList = new SongList();
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public SongList getSongList() {
        return songList;
    }

    public int getSongIndex(String title) {
        return songList.getSongIndex(title);
    }

    public boolean listSongs() {
        List<Song> songs = songList.getSongList();
        if (songs.isEmpty()) {
            return false;
        }

        for (int i = 0; i < songs.size(); i++) {
            System.out.println(songs.get(i).toString());
        }
        return true;
    }

    public boolean addSong(String title, double duration) {
        return songList.addSong(title, duration);
    }

    public Song getSong(String title) {
        return songList.getSong(title);
    }

    class SongList {
        private List<Song> songList;

        public SongList() {
            songList = new ArrayList<>();
        }

        public List<Song> getSongList() {
            return songList;
        }

        private int getSongIndex(String title) {
            if (songList.isEmpty()) {
                return -1;
            }

            for (int i = 0; i < songList.size(); i++) {
                if (songList.get(i).getTitle().equals(title)) {
                    return i;
                }
            }

            return -1;
        }

        private boolean addSong(String title, double duration) {
            if (getSongIndex(title) >= 0) { // Song exists in album.
                return false;
            }

            Song song = new Song(title, duration);
            songList.add(song);
            return true;
        }

        private Song getSong(String title) {
            int songIndex = getSongIndex(title);
            if (songIndex < 0) {
                return null;
            }

            return songList.get(songIndex);
        }
    }
}

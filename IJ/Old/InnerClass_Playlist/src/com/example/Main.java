package com.example;

public class Main {

    private static MyCollection collection = new MyCollection("My Collection :)");
    private static Playlist playlist = new Playlist("Blues");
    public static void main(String[] args) {
        Album newAlbum = new Album("Dire Straits", "Dire Straits");
        newAlbum.addSong("Down to the Waterline", 2.40);
        newAlbum.addSong("Water of Love", 2.38);
        newAlbum.addSong("Setting Me Up", 3.00);
        newAlbum.addSong("Six Blade Knife", 2.49);
        newAlbum.addSong("Southbound Again", 4.30);
        newAlbum.addSong("Sultans of Swing", 4.38);
        newAlbum.addSong("In the Gallery", 3.78);
        newAlbum.addSong("Wild West End", 3.68);
        System.out.println();
        newAlbum.listSongs();
        if (collection.addAlbum(newAlbum)) {
            System.out.println("Success");
        }
        System.out.println();

        newAlbum = new Album("Riding with the King", "B.B. King E. Clapton");
        newAlbum.addSong( "Riding with the King", 3.05);
        newAlbum.addSong( "Ten Long Years", 3.18);
        newAlbum.addSong( "Key to the Highway", 3.29);
        newAlbum.addSong( "Marry You", 4.53);
        newAlbum.addSong( "Three O'Clock Blues", 3.48);
        newAlbum.addSong( "Help the Poor", 3.67);
        newAlbum.addSong( "I Wanna Be", 3.74);
        newAlbum.addSong( "Worried Life Blues", 3.61);
        newAlbum.addSong( "Days of Old", 4.61);
        newAlbum.addSong( "Hold On, I'm Coming", 4.81);
        System.out.println();
        newAlbum.listSongs();
        if (collection.addAlbum(newAlbum)) {
            System.out.println("Success");
        }
        System.out.println();

        playlist.addSong("Riding with the King", "Riding with the King", "B.B. King E. Clapton", collection);
        playlist.addSong("I Wanna Be", "Riding with the King", "B.B. King E. Clapton", collection);
        playlist.addSong("Sultans of Swing", "Dire Straits", "Dire Straits", collection);
        playlist.getPlaylist().forEach(song -> System.out.println(song.toString()));
        System.out.println();

//        Object[] songArray = playlist.getPlaylist().toArray(new Song[playlist.getPlaylist().size()]);
//        for (int i = 0; i < songArray.length; i++) {
//            System.out.println(songArray[i]);
//        }
        System.out.println(System.getenv());

//        playlist.play();
    }
}

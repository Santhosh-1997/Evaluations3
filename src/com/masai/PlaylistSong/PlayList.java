package com.masai.PlaylistSong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayList {

    public List<Song> songs = new ArrayList<>();

    public PlayList() {
    }

    public PlayList(List<Song> songs) {
        this.songs = songs;
    }


    public void addSong(Song song){
        songs.add(song);

        for(Song el:songs)
            System.out.println(el);

        System.out.println("Song added to the playlist successfully");
        System.out.println("");
    }
}

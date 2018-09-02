package com.kenny;

import java.util.ArrayList;


public class Album {
    private String albumName;
    private ArrayList<Song> songArrayList;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songArrayList = new ArrayList<Song>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public boolean isInAlbum(String title){
        if(findIndexOfSong(title) >= 0){
            return true;
        }
        return false;
    }

    public int findIndexOfSong(String title){
        for(int i = 0; i < songArrayList.size(); i ++){
            if(songArrayList.get(i).getTitle().toLowerCase().equals(title.toLowerCase())){
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Song> getSongArrayList() {
        return songArrayList;
    }
}

package com.kenny;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Player{
    private ArrayList<Album> albumArrayList;
    private static LinkedList<Song> playlist;
    private int indexOfCurrentSong;

    public Player() {
        this.albumArrayList = new ArrayList<Album>();
        this.playlist =  new LinkedList<Song>();
        this.indexOfCurrentSong = 0;
    }

    public boolean addSongToPlaylist(String songName,double duration){
        if(!isSongInPlaylist(songName)){
            playlist.add(new Song(songName,duration));
            return true;
        }
        System.out.println("Song already in the playlist");
        return false;
    }

    public boolean removeSongFromPlaylist(String songName){
        if(isSongInPlaylist(songName)){
            playlist.remove(findIndexOfSongInPlaylist(songName));
            return true;
        }
        System.out.println("Song is not in the playlist");
        return false;
    }

    public void removeCurrentSong(){
        ListIterator<Song> i = playlist.listIterator();
        songPlaying();
        i.remove();
    }

    private boolean isSongInPlaylist(String songName){
        if(findIndexOfSongInPlaylist(songName) >= 0){
            return true;
        }
        return false;
    }

    private int findIndexOfSongInPlaylist(String songName){
        ListIterator<Song> i = playlist.listIterator();
        while(i.hasNext()){
            if(playlist.get(i.nextIndex()).getTitle().toLowerCase().equals(songName.toLowerCase())) {

                return i.nextIndex();
            }
            i.next();
        }
        return -1;
    }

    public boolean addAlbumToList(String albumName){
        if(!isAlbumInList(albumName)){
            albumArrayList.add(new Album(albumName));
            return true;
        }
        System.out.println("This album is already in the list");
        return false;
    }

    public boolean removeAlbumFromList(String albumName){
        if(isAlbumInList(albumName)){
            albumArrayList.remove(findIndexOfAlbumInList(albumName));
            return true;
        }
        System.out.println("This album is not in the list");
        return false;
    }

    public boolean isAlbumInList(String albumName){
        if (findIndexOfAlbumInList(albumName) >= 0){
            return true;
        }
        return false;
    }

    private int findIndexOfAlbumInList(String albumName){
        for(int i = 0; i <  albumArrayList.size(); i++) {
            if (albumArrayList.get(i).getAlbumName().toLowerCase().equals(albumName.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Album> getAlbumArrayList() {
        return albumArrayList;
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public Song nextSong(){
        ListIterator<Song> i = playlist.listIterator();
        if (i.hasNext()) {
            if(!i.hasPrevious()) {
                i.next();
            }
            return i.next();
        }
        return null;
    }

    public Song previousSong(){
        ListIterator<Song> i = playlist.listIterator();
        if(i.previousIndex() != -1){
            return i.previous();
        }
        return null;
    }

    public Song currentSong(){
        ListIterator<Song> i = playlist.listIterator();
        if(playlist.size() > 0) {
            if (i.previousIndex() == -1) {
                return i.next();
            }
            return i.previous();
        }
        System.out.println("There is no song playing");
        return null;
    }

    public Song songPlaying(){
        ListIterator<Song> i = playlist.listIterator();
        return i.next();
    }

    public void printAlbumList(){
        for(int i = 0; i < albumArrayList.size(); i++){
            System.out.println("***Albums***\n" + (i + 1) +
                    "# " + albumArrayList.get(i).getAlbumName());
        }
    }

    public void printPlaylist(){
        ListIterator<Song> i = playlist.listIterator();
        System.out.println("***Playlist***");
        while (i.hasNext()){
            Song song = i.next();
            System.out.println("Name: " + song.getTitle() + "\tDuration: " + song.getDuration() + ", ");
        }
    }

    public boolean addSongToAlbum(String title, double duration, String albumName){
        if(!isAlbumInList(albumName)){
            addAlbumToList(albumName);
        }
        if(!albumArrayList.get(findIndexOfAlbumInList(albumName)).isInAlbum(title)){
            albumArrayList.get(findIndexOfAlbumInList(albumName)).getSongArrayList().add(new Song(title, duration));
            return true;
        }
        System.out.println("Song is already in this album");
        return false;
    }

    public boolean removeSongFromAlbum(String title, String albumName){
        if(albumArrayList.get(findIndexOfAlbumInList(albumName)).isInAlbum(title)){
            albumArrayList.get(findIndexOfAlbumInList(albumName)).getSongArrayList().remove(albumArrayList.get(findIndexOfAlbumInList(albumName)).findIndexOfSong(title));
            return true;
        }
        System.out.println("Song is not in this album");
        return false;
    }
}

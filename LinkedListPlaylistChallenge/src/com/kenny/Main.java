package com.kenny;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Player mediaPlayer = new Player();
        boolean quit = false;
        while (!quit){
            printOptions();
            System.out.println("Choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            String albumName, songName;
            double duration;
            switch (choice){
                case 1:
                    System.out.println("Replaying Current Song:");
                    Song currentSong = mediaPlayer.currentSong();
                    System.out.println("Title: " + currentSong.getTitle() + "\tDuration: "+
                            currentSong.getDuration());
                    break;
                case 2:
                    System.out.println("Skipping to next Song");
                    Song nextSong = mediaPlayer.nextSong();
                    System.out.println("Title: " + nextSong.getTitle() + "Duration: "+
                            nextSong.getDuration());
                    break;
                case 3:
                    System.out.println("Skipping to Previous Song");
                    Song previousSong = mediaPlayer.previousSong();
                    System.out.println("Title: " + previousSong.getTitle() + "Duration: "+
                            previousSong.getDuration());
                    break;
                case 4:
                    System.out.println("Please enter the Name of the album you want to add");
                    albumName = scanner.nextLine();
                    mediaPlayer.addAlbumToList(albumName);
                    break;
                case 5:
                    System.out.println("Please enter the name of the album the song should be added to");
                    albumName = scanner.nextLine();
                    System.out.println("Enter the name of the song");
                    songName = scanner.nextLine();
                    System.out.println("Enter the duration of the song");
                    duration = scanner.nextDouble();
                    mediaPlayer.addSongToAlbum(songName,duration,albumName);
                    break;
                case 6:
                    System.out.println("Please enter the song name to remove from playlist");
                    songName = scanner.nextLine();
                    mediaPlayer.removeSongFromPlaylist(songName);
                    break;
                case 7:
                    System.out.println("Please enter the name of the album the song should be removed from");
                    albumName = scanner.nextLine();
                    System.out.println("Enter the name of the song");
                    songName = scanner.nextLine();
                    mediaPlayer.removeSongFromAlbum(songName,albumName);
                    break;
                case 8:
                    System.out.println("Quitting");
                    quit = true;
                    break;
                case 9:
                    printOptions();
                    break;
                case 10:
                    mediaPlayer.printPlaylist();
                    break;
                case 11:
                    mediaPlayer.printAlbumList();
                    break;
                case 12:
                    System.out.println("Enter the name of the song you want to add");
                    songName = scanner.nextLine();
                    System.out.println("Enter the duration of the song");
                    duration = scanner.nextDouble();
                    scanner.nextLine();
                    mediaPlayer.addSongToPlaylist(songName,duration);
                    break;
                case 13:
                    if(mediaPlayer.currentSong() != null) {
                        System.out.println("The song playing is:");
                        System.out.println("Name: " + mediaPlayer.songPlaying().getTitle() + "\tDuration: " + mediaPlayer.songPlaying().getDuration());
                    }
                    break;
                default:
                    System.out.println("Invalid Option");
                    printOptions();

            }
        }
        scanner.close();
    }

    private static void printOptions(){
        System.out.println("***Option***\n" +
                "1-> Replay Current Song\n" +
                "2-> Next Song\n" +
                "3-> Previous Song\n" +
                "4-> Add Album\n" +
                "5-> Add Song to Album\n" +
                "6-> Remove Song from Playlist\n" +
                "7-> Remove Song from Album\n" +
                "8-> Quit\n" +
                "9-> Print these options\n" +
                "10-> Print out the playlist\n" +
                "11-> Print out the album list\n" +
                "12 -> Add song to playlist\n" +
                "13 -> Song Playing");
    }
}

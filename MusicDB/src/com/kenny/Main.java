package com.kenny;

import model.Artists;
import model.DataSource;
import model.SongArtist;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataSource dataSource = new DataSource();
        if(dataSource.openConnection()){
            System.out.println("Results from Artist table");
            List<Artists> artistsList = dataSource.queryArtist(DataSource.ORDER_BY_DESC);
            if(artistsList.isEmpty()){
                System.out.println("No Artists");
                return;
            }
            for(Artists artists : artistsList){
                System.out.println(artists.get_id() + "\t" + artists.getName());
            }
//            System.out.println("Please enter the name of the artist who's albums you are looking for.");
//            String artistName = scanner.nextLine();
//            System.out.println("Order by ? 0 = default, 1 = Ascending, 2 = Descending");
//            List<String> albumList = dataSource.queryArtistForAlbums(artistName,scanner.nextInt());
//            if(albumList.isEmpty()){
//                System.out.println("No Albums");
//                return;
//            }
//            System.out.println("Artist: " + artistName);
//            for(String album : albumList){
//                System.out.println(album);
//            }
//            System.out.println("Please enter the name of the song you want to query");
//            String songName = scanner.nextLine();
//            System.out.println("Order by ? 0 = default, 1 = Ascending, 2 = Descending");
//            int orderBy = scanner.nextInt();
//            List<SongArtist> songArtistList = dataSource.queryArtistForSong(songName,orderBy);
//
//            for(SongArtist songArtist : songArtistList){
//                System.out.println(songArtist.getTrack() + "\t" + songArtist.getAlbumName()  + "\t" + songArtist.getArtistName());
//            }
            dataSource.querySongMetaData();
        }
        dataSource.close();
    }
}

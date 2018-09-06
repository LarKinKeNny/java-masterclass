package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource {

    //Connection Strings
    public static final String DB_NAME = "music.db";
    public static final String DB_PATH = "C:\\Users\\Leo\\IdeaProjects\\MusicDB\\";
    public static final String DB_CONNECTIONS_STRING = "jdbc:sqlite:" + DB_PATH + DB_NAME;

    //album table
    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";
    public static final int INDEX_ALBUM_ID = 1;
    public static final int INDEX_ALBUM_NAME = 2;
    public static final int INDEX_ALBUM_ARTIST = 3;

    //artist table
    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTISTS_ID = "_id";
    public static final String COLUMN_ARTISTS_NAME ="name";
    public static final int INDEX_ARTISTS_ID = 1;
    public static final int INDEX_ARTISTS_NAME = 2;



    //songs table
    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONGS_ID = "_id";
    public static final String COLUMN_SONGS_TRACK = "track";
    public static final String COLUMN_SONGS_TITLE = "title";
    public static final String COLUMN_SONGS_ALBUM = "album";
    public static final int INDEX_SONGS_ID = 1;
    public static final int INDEX_SONGS_TRACK = 2;
    public static final int INDEX_SONGS_TITLE = 3;
    public static final int INDEX_SONGS_ALBUM = 4;

    private Connection conn;

    public static final int ORDER_BY_DEFAULT = 0;
    public static final int ORDER_BY_ASC = 1;
    public static final int ORDER_BY_DESC = 2;

    //sql Statements constants
    public static final String ARTIST_FOR_ALBUMS_START = "SELECT " + TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME +
            " FROM " + TABLE_ARTISTS + " INNER JOIN " + TABLE_ALBUMS + " ON " + TABLE_ARTISTS + "." +
            COLUMN_ARTISTS_ID + " = " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ARTIST + " WHERE " + TABLE_ARTISTS +
            "." + COLUMN_ARTISTS_NAME + " = " + "'" ;

    public static final String ARTIST_FOR_SONG_START = "SELECT " + TABLE_SONGS + "." + COLUMN_SONGS_TRACK +
            ", " + TABLE_ARTISTS + "." + COLUMN_ARTISTS_NAME + ", " + TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME +
            " FROM " + TABLE_SONGS + " INNER JOIN " + TABLE_ALBUMS + " ON " + TABLE_SONGS + "." + COLUMN_SONGS_ALBUM +
            " = " + TABLE_ALBUMS + "." + COLUMN_ARTISTS_ID + " INNER JOIN " + TABLE_ARTISTS + " ON " + TABLE_ARTISTS +
            "." + COLUMN_ARTISTS_ID + " = " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ARTIST + " WHERE " + TABLE_SONGS +
            ". " + COLUMN_SONGS_TITLE + "='";

    public static final String INSERT_ARTIST = "INSERT INTO " + TABLE_ARTISTS + "(" + COLUMN_ARTISTS_NAME +
            ") VALUES(?)";

    public static final String INSERT_ALBUM = "INSERT INTO " + TABLE_ALBUMS + "(" + COLUMN_ALBUM_NAME + " , "  +
            COLUMN_ALBUM_ARTIST + ") VALUES(? , ?)";

    public static final String INSERT_SONGS = "INSERT INTO " + TABLE_SONGS + "(" +COLUMN_SONGS_TRACK + "," +
            COLUMN_SONGS_TITLE + "," + COLUMN_SONGS_ALBUM + ") VALUES(? , ? , ?)";

    public boolean openConnection(){
        try{
            conn = DriverManager.getConnection(DB_CONNECTIONS_STRING);
            return true;

        }catch(SQLException e){
            System.out.println("Couldn't connect to database: " + e.getMessage());
            return false;
        }
    }

    public void close(){
        try{
            conn.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public List<Artists> queryArtist(int orderBy){
        StringBuilder stringBuilder =new StringBuilder("SELECT * FROM ");
        stringBuilder.append(TABLE_ARTISTS);

        if(orderBy != ORDER_BY_DEFAULT){
            stringBuilder.append(" ORDER BY ");
            stringBuilder.append(COLUMN_ARTISTS_NAME);
            stringBuilder.append(" COLLATE NOCASE ");
            if(orderBy == ORDER_BY_DESC){
                stringBuilder.append("DESC");
            }else{
                stringBuilder.append("ASC");
            }
        }

        try(Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(stringBuilder.toString())){
            List<Artists> artistsList = new ArrayList<>();
            while(resultSet.next()){
                Artists artists = new Artists();
                artists.set_id(resultSet.getInt(INDEX_ARTISTS_ID));
                artists.setName(resultSet.getString(INDEX_ARTISTS_NAME));
                artistsList.add(artists);
            }
            return artistsList;

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<String> queryArtistForAlbums(String artist, int orderBy){
        StringBuilder stringBuilder = new StringBuilder(ARTIST_FOR_ALBUMS_START);
        stringBuilder.append(artist);
        stringBuilder.append("'");

        if(orderBy != ORDER_BY_DEFAULT){
            stringBuilder.append(" ORDER BY ");
            stringBuilder.append(TABLE_ALBUMS + ".");
            stringBuilder.append(COLUMN_ALBUM_NAME);
            stringBuilder.append(" COLLATE NOCASE ");
            if(orderBy == ORDER_BY_DESC){
                stringBuilder.append("DESC");
            }else{
                stringBuilder.append("ASC");
            }
        }

        try(Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(stringBuilder.toString())){
            List<String> albumsNameList = new ArrayList<>();
            while(resultSet.next()){
                albumsNameList.add(resultSet.getString(1));
            }
            return albumsNameList;

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<SongArtist> queryArtistForSong(String song, int orderBy){
        StringBuilder stringBuilder = new StringBuilder(ARTIST_FOR_SONG_START);
        stringBuilder.append(song);
        stringBuilder.append("'");

        if(orderBy != ORDER_BY_DEFAULT){
            stringBuilder.append(" ORDER BY ");
            stringBuilder.append(TABLE_ALBUMS + ".");
            stringBuilder.append(COLUMN_ALBUM_NAME);
            stringBuilder.append(" COLLATE NOCASE ");
            if(orderBy == ORDER_BY_DESC){
                stringBuilder.append("DESC");
            }else{
                stringBuilder.append("ASC");
            }
        }

        try(Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(stringBuilder.toString())){
            List<SongArtist> songArtistList = new ArrayList<>();
            while(resultSet.next()){
                SongArtist songArtist = new SongArtist();
                songArtist.setTrack(resultSet.getInt(1));
                songArtist.setArtistName(resultSet.getString(2));
                songArtist.setAlbumName(resultSet.getString(3));
                songArtistList.add(songArtist);
            }
            return songArtistList;

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void querySongMetaData(){
        try(Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM " + TABLE_SONGS)){
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for(int i =0; i < columnCount; i++){
                System.out.println((i + 1) + "# Column Name: " + metaData.getColumnName(i + 1));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

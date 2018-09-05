package com.kenny;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testJava.db";
    public static final String DB_PATH = "C:\\Users\\Leo\\IdeaProjects\\TestDB\\";
    public static final String DB_JDBC = "jdbc:sqlite:";

    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_JDBC + DB_PATH + DB_NAME);
            Statement statement = conn.createStatement()){
            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    "(" + COLUMN_NAME +
                    " TEXT," + COLUMN_PHONE +
                    " INTEGER," + COLUMN_EMAIL + " TEXT)");

            statement.execute("INSERT INTO "+ TABLE_CONTACTS + " VALUES('Tim', 159456, 'tim@email.com')");
            statement.execute("INSERT INTO "+ TABLE_CONTACTS + " VALUES('Jack', 489816, 'jack@email.com')");
            statement.execute("INSERT INTO "+ TABLE_CONTACTS + " VALUES('Jill', 112345, 'jill@email.com')");
            insertContact(statement,"Johnny", 15877, "johnny@email.com");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " + COLUMN_PHONE +
                    "= 478994 WHERE " + COLUMN_NAME + "='Tim'");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while(resultSet.next()){
                System.out.println(resultSet.getString(COLUMN_NAME) + "\t"
                        + resultSet.getInt(COLUMN_PHONE) + "\t"
                        + resultSet.getString(COLUMN_EMAIL));
            }
            resultSet.close();

        }catch (SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    public static void insertContact(Statement statement, String name, int phone, String email ) throws SQLException{
        statement.execute("INSERT INTO "+ TABLE_CONTACTS + " VALUES('" + name + "'," + phone + ", '" + email + "')");
    }

    public static void  deleteContact(Statement statement, String name) throws SQLException{
        statement.execute("DELETE FROM " + TABLE_CONTACTS +" WHERE " + COLUMN_NAME + "='" + name + "'");
    }

}


//conn.setAutoCommit(false);
//statement.execute
//("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");
//statement.execute("INSERT INTO contacts VALUES('Sannie',77125, 'sannie@email.com')");
//statement.execute("UPDATE contacts SET phone=55568 WHERE name ='Sannie'");
//statement.execute("DELETE FROM contacts WHERE name='Jude'");
//            statement.execute("SELECT * FROM contacts");
//            ResultSet resultSet = statement.getResultSet();
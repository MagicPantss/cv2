package models;

public class Singleton {   //jedináček, idk what it is

    private static String connection;

    public String getConnection(){
        if (connection == null){
            connection = "Open";
        }
        return connection;
    }

}

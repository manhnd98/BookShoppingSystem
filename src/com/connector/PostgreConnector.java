package com.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreConnector {
    static Connection connection = null;
    String host = "localhost";
    int port = 5432;
    String database = "bookstore";
    String username = "bookstore";
    String password = "hello123";

    public Connection getConnection() {
        if(connection == null) {
            createConnection();
        }

        return connection;
    }

    public void createConnection() {
        try {
            System.out.println("Connecting to database ...");
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://" + host + ":" + port + "/" + database, username, password);

            if(connection != null) {
                System.out.println("Connected!");
            }else {
                System.out.println("Connection Failed");
                throw new Exception("Connection failed");
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.UdemyAbsoluteIntroToOOP.Lesson_14.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Responsibility of taking care of database connectivity details by managing and providing
 * a connection object for clients to interact with the database, which in this case,
 * is the EmployeeDAO object.
 */


public class DatabaseConnectionManager {

    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();
    private Connection conn;


    private DatabaseConnectionManager() {

    }


    public static DatabaseConnectionManager getManagerInstance() {
        return connectionInstance;
    }


    /**
     *  contains connection details
     *
     *  @throws java.sql.SQLException
     */
    public void connect() throws SQLException {
        // process specific to database connection details.
        conn = DriverManager.getConnection("some/database/url/goes/here");
        System.out.println("established database connection");

    }

    public Connection getConnectionObject() {
        return conn;

    }

    public void disconnect() {


    }

}

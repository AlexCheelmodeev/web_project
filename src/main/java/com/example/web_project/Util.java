package com.example.web_project;

import java.io.PrintStream;
import java.sql.*;

public class Util {
    public static ResultSet getResultFromBd(){
        ResultSet resultSet = null;

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres","postgres");
            Statement statement = connection.createStatement();
             resultSet = statement.executeQuery("select  * from books");
            } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return  resultSet;
    }
}


package com.example.quanlysinhvien.Reposive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/quanlysinhvien";
    private static final String username = "root";
    private static final String password = "12345";
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    private BaseRepository(){

    }
    public static Connection getConnectionJavaToDB() {
        return connection;
    }
}

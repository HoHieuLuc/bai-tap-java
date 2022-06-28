package com.hohieuluc.Chuong14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import io.github.cdimascio.dotenv.Dotenv;

public class ConnectDB {
    private static Connection conn = null;

    public static Connection connect() throws SQLException {
        if (conn == null) {
            Dotenv dotenv = Dotenv.load();
            String user = dotenv.get("user");
            String password = dotenv.get("password");
            String database = dotenv.get("database");
            return DriverManager.getConnection(database, user, password);
        }
        return conn;
    }

    public static void close() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}
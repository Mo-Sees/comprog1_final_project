package net.sqlitetutorial;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void connect() {
        // connection string
        var url = "jdbc:sqlite:user.db";

        try (var conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                var meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        connect();
    }
}
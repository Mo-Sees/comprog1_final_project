package database;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    public static void connect() {
        var url = "jdbc:sqlite:user.db";

        try (var conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                var meta = conn.getMetaData();
                System.out.println("The Driver is connected: " + meta.getDriverName());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}


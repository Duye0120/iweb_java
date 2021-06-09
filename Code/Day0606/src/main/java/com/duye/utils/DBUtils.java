package com.duye.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
    private final String user = "root";
    private final String pwd = "123456";
    private final String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
    private final String driver = "com.mysql.cj.jdbc.Driver";

    Connection connection = null;

    public Connection getConnection() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void close() {
        try {
            if (connection!=null && !connection.isClosed()){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

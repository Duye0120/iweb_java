package com.duye.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库工具
 */
public class DBUtils {
    private final String user = "root";
    private final String pwd = "123456";
    private final String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
    private final String driver = "com.mysql.cj.jdbc.Driver";
    Connection connection = null;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "root", "123456");
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        return this.connection;
    }

    public void close() {
        try {
            if (this.connection != null && !this.connection.isClosed()) {
                this.connection.close();
            }
        } catch (SQLException var2) {
            var2.printStackTrace();
        }

    }
}

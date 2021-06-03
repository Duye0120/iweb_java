package com.iweb.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 作者: jack
 * 时间: 2021-03-16 0016 09:33
 * 描述: DBUtil
 */
public class DBUtil {

    private final String user = "root";
    private final String pwd = "123456";
    private final String url = "jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC";
    private final String driver = "com.mysql.cj.jdbc.Driver";

    private Connection connection = null;

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
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

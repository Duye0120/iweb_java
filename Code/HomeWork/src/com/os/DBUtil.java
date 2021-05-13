package com.os;
import java.sql.*;
public class DBUtil {
    private String url = "jdbc:mysql://localhost:3306/test";
    private String user = "root";
    private String password = "123456";
    private String driver = "com.mysql.jdbc.Driver";
    private Connection conn = null;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
//        加载驱动

        Class.forName(driver);
//        获取连接
        this.conn = DriverManager.getConnection(url,user,password);
        return conn;

    }

    public void close() throws SQLException {
        if(conn != null && conn.isClosed()){
            conn.close();
        }
    }
}

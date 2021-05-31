package com.duye.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil  {
    private String username = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&serverTimezone=UTC";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private Connection connection;


   public Connection init() throws Exception{
       // 1. 加载驱动
       Class.forName(driver);
       // 2. 获取会话
       connection = DriverManager.getConnection(url,username,password);
       return connection;
   }

    /**
     * 关闭数据库
     */

    public void close() {
        try {
            System.out.println(connection.getAutoCommit());
            if (connection!= null && !connection.isClosed()){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 手动事务
     */

    public void setAutoCommit(){
        try {
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void rollback() {
        try {
            connection.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

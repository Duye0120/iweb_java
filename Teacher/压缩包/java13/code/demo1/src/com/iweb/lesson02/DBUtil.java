package com.iweb.lesson02;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 作者: jack
 * 时间: 2021-05-07 0007 09:40
 * 描述: DBUtil
 */
public class DBUtil {

    private String user = "scott";
    private String pwd = "123456";
    private String driver = "oracle.jdbc.OracleDriver"; // OracleDriver(记住)
    private String url = "jdbc:oracle:thin:@192.168.100.128:1521:orcl"; // conn scott/123456@orcl

    private Connection conn;

    /**
     * 连接数据库
     *
     * @return
     */
    public Connection getConnection() throws Exception {
        Class.forName(driver); // 加载驱动
        conn = DriverManager.getConnection(url, user, pwd); // 获取会话
        return conn;
    }


    /**
     * 关闭数据库
     */
    public void close() throws Exception {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }

}

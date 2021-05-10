package com.iweb.lesson01;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 作者: jack
 * 时间: 2021-05-07 0007 09:23
 * 描述: Test
 */
public class Test {


    public static void main(String[] args) throws Exception {


        /*
        1. 加载驱动  ojdbc14.jar 中
        2. 连接数据库获取会话
         */

        // 数据库连接的 4 个基本参数：url(proto.IP:PORT)  user pwd driver
        String user = "scott";
        String pwd = "123456";
        //  oracle.jdbc.OracleDriver  11g以上版本   oracle.jdbc.driver.OracleDriver 11g一下
        String driver = "oracle.jdbc.OracleDriver"; // OracleDriver(记住)
        // jdbc:mysql
        String url = "jdbc:oracle:thin:@192.168.100.128:1521:orcl"; // conn scott/123456@orcl

        Connection conn = null; // 数据库会话
        try {
            // 核心代码
            Class.forName(driver); // 加载驱动
            conn = DriverManager.getConnection(url, user, pwd); // 获取会话
            // 测试
            System.out.println(conn);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭数据库
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        }

    }

}

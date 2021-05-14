package JDBC.Day0514;

import java.sql.*;
import java.util.concurrent.ExecutionException;

public class Transaction {
    public static void main(String[] args) throws Exception {
        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            // 将connection设置为不自动提交
            conn.setAutoCommit(false);// 开启了事务
            String sql = "update account set balance = balance - 100 where id = 1";
            String sql2 = "update account set balance = balance + 100 where id = 2";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();// 执行
            //int i = 1 / 0;// 抛出异常
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            ps2.executeUpdate();//执行

            // 提交事务
            conn.commit();
        } catch (Exception e) {
            // 这里可以进行回滚，撤销sql
            // 默认回滚到事务开始的状态
            try {
                conn.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            if (conn != null && conn.isClosed()) {
                conn.close();
            }
        }
    }
}

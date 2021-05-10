package lesson01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        String user = "scott";
        String pwd = "123456";
        String driver = "oracle.jdbc.OracleDriver";
        String url = "jdbc:oracle:thin:@192.168.100.128:1521:orcl";


        Connection conn = null;// 数据库会话
        try {
            // 核心代码
            Class.forName(driver);// 加载驱动
            conn = DriverManager.getConnection(url,user,pwd);
            System.out.println(conn);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null && !conn.isClosed()){
                conn.close();
            }
        }

    }
}

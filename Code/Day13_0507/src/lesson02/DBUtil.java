package lesson02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 */
public class DBUtil {
    private String user = "scott";
    private String pwd = "123456";
    private String driver = "oracle.jdbc.OracleDriver";
    private String url = "jdbc:oracle:thin:@192.168.100.128:1521:orcl";
    private Connection conn = null;

    /**
     * 驱动连接
     *
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        // 加载驱动
        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, pwd);
        return conn;
    }

    /**
     * 关闭连接
     *
     * @throws Exception
     */
    public void close() throws Exception {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }


}

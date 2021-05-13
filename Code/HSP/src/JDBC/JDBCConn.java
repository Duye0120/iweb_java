package JDBC;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCConn {
    // 方式三 使用DriverManager 替代 Driver 进行统一管理
    @Test
    public void connect02() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        // 创建url和user和password
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123456";

        DriverManager.registerDriver(driver);// 注册Driver驱动
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);
    }

    @Test
    public void connect03() throws Exception {
        // 使用反射加载Driver类

        //Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123456";

        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);
    }

    // 在基础上，使用配置文件
    @Test
    public void connect04() throws Exception {
        // 通过Properties对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        // 获取相关的值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);
    }
}

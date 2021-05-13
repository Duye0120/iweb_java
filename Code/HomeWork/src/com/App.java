package com;

import com.os.DBUtil;
import com.os.Init;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    static {
        DBUtil util = new DBUtil();
//        初始化池子
        Connection conn = null;
        PreparedStatement pst = null;
        try {
//                插入到数据库
            conn = util.getConnection();
            String sql = "select * from employee";
            pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                if (rs.getString("status").equals(false)) {
                    if (rs.getString("employeetype").equals("ture")) {
                        Init.list.add(rs.getString("employeeid").substring(1));
                    } else {
                        Init.list.add(rs.getString("employeeid").substring(3));
                    }

                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        //new Init().createEmployee("wangwu",true);
//        new Init().createEmployee("wuzong",false);
//        new Init().createEmployee("duye",true);
//        new Init().createEmployee("wuzong",false);
//        new Init().createEmployee("duye",true);
//        new Init().createEmployee("wuzong",false);
//        new Init().createEmployee("duye",true);
//        new Init().createEmployee("wuzong",false);
//        new Init().createEmployee("duye",true);
        // 初始化数据
        //new Init().init();
        System.out.println(new Init().updateEmployeeID("W1000", 10001));
        //System.out.println(new Init().updateStatus("W1000", false));
        //System.out.println(Integer.parseInt("1011") > Integer.parseInt("1102") );
        //System.out.println(InitOs.list.toString());
    }
}

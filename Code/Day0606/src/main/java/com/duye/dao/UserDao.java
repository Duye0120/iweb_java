package com.duye.dao;

import com.duye.bean.Page;
import com.duye.bean.User;
import com.duye.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao {
    public List<User> selectByPage(Page page) {
        List<User> list = null;
        DBUtils dbUtils = new DBUtils();
        Connection conn = dbUtils.getConnection();
        int start = (page.getCount() -1) * page.getCount();
        String sql = "select * from tb_user limit ?,?"; // 起始条，多少条

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,start);
            pst.setInt(2,page.getCount());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbUtils.close();
        }
        return list;
    }

    public Integer selectCount() {
        int count = 0;
        String sql = "select count(1) from tb_user";
        DBUtils dbUtils = new DBUtils();
        Connection conn = dbUtils.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            dbUtils.close();
        }


        return null;
    }
}

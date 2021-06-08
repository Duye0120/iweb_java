package com.duye.Dao;

import com.duye.Utils.DBUtils;
import com.duye.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    public User selectByUserName(String username) {
        User user = null;
        DBUtils dbUtils = new DBUtils();
        Connection conn = dbUtils.getConnection();
        String sql = "select * from tb_user where user = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return user;
    }

    public User selectById(int id) {
        User user = null;
        DBUtils dbUtils = new DBUtils();
        Connection conn = dbUtils.getConnection();
        String sql = "select * from tb_user where id = ? ";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.close();
        }

        return user;
    }

    public void updatePwd(int id, String pwd) {
        DBUtils dbUtils = new DBUtils();
        Connection conn = dbUtils.getConnection();
        String sql = "update tb_user set pwd = ? where id = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, pwd);
            pst.setInt(2, id);
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbUtils.close();
        }
    }

    public void updateAddr(int id, String addr) {
        DBUtils dbUtils = new DBUtils();
        Connection conn = dbUtils.getConnection();
        String sql = "update tb_user set addr = ? where id = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, addr);
            pst.setInt(2, id);
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbUtils.close();
        }
    }
}

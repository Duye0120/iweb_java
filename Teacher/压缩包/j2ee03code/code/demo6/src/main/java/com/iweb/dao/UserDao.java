package com.iweb.dao;

import com.iweb.bean.User;
import com.iweb.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 作者: jack
 * 时间: 2021-06-03 0003 14:28
 * 描述: UserDao
 */
public class UserDao {

    public User selectByAccount(String account) {
        User user = null;
        DBUtil dbUtil = new DBUtil();
        Connection conn = dbUtil.getConnection();
        String sql = "select * from tb_user where account = ?";

        try {

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, account);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbUtil.close();
        }

        return user;

    }

    public User selectById(Integer id) {
        User user = null;
        DBUtil dbUtil = new DBUtil();
        Connection conn = dbUtil.getConnection();
        String sql = "select * from tb_user where id = ?";

        try {

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbUtil.close();
        }

        return user;
    }

    public void updatePwd(Integer id, String pwd) {
        DBUtil dbUtil = new DBUtil();
        Connection conn = dbUtil.getConnection();
        String sql = "update tb_user set pwd = ? where id = ?";
        try {

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, pwd);
            pst.setInt(2, id);

            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbUtil.close();
        }
    }

    public void updateAddr(Integer id, String addr) {
        DBUtil dbUtil = new DBUtil();
        Connection conn = dbUtil.getConnection();
        String sql = "update tb_user set addr = ? where id = ?";
        try {

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, addr);
            pst.setInt(2, id);

            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbUtil.close();
        }
    }
}

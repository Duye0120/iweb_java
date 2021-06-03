package com.duye.Dao;

import com.duye.Utils.DBUtils;
import com.duye.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    public User selectByUserName(String username){
        User user = null;
        DBUtils dbUtils = new DBUtils();
        Connection conn = dbUtils.getConnection();
        String sql = "select * from tb_user where user = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,username);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                user = new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
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
}

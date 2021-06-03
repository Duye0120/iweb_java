package com.duye.dao;

import com.duye.bean.User;
import com.duye.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
    public User selectUserByName(String uname){
        User user = null;
        DBUtil dbUtil = new DBUtil();
        try {
            // 数据库初始化
            Connection conn = dbUtil.init();
            // 写SQL语句
            String sql = "select * from tb_user where uname = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,uname);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                user = new User(rs.getInt(1),rs.getString(2),rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            dbUtil.close();
        }
        return user;
    }
}

package com.duye.dao;

import com.duye.bean.Good;
import com.duye.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GoodDao {
    public List<Good> selectGoods() {
        List<Good> list = new ArrayList<>();
        DBUtil dbUtil = new DBUtil();
        try {
            // 连接初始化
            Connection conn = dbUtil.init();
            // sql语句
            String sql = "select * from tb_good";
            // 预准备语句
            PreparedStatement pst = conn.prepareStatement(sql);
            // 执行sql语句
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new Good(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbUtil.close();
        }
        return list;
    }

    public Good selectGoodById(int gid) {
        Good good = null;
        DBUtil dbUtil = new DBUtil();
        try {
            Connection conn = dbUtil.init();
            String sql = "select * from tb_good where gid = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,gid);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                good = new Good(rs.getInt(1),rs.getString(2),rs.getDouble(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbUtil.close();
        }
        return good;
    }
}

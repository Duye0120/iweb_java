package com.duye.dao;

import com.duye.bean.Order;
import com.duye.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OrderDao {
    public void save(Order order) {
        DBUtil dbUtil = new DBUtil();

        String sql = "insert into tb_order (uid,gid,count,status) values (?,?,?,?)";

        try {
            Connection conn = dbUtil.init();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, order.getUid());
            pst.setInt(2, order.getGid());
            pst.setInt(3, order.getCount());
            pst.setInt(4, order.getStatus());

            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbUtil.close();
        }
    }

    public Order selectOrder() {
        Order order = null;
        DBUtil dbUtil = new DBUtil();

        try {
            Connection conn = dbUtil.init();
            String sql = "select * from tb_order";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                order = new Order(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbUtil.close();
        }
        return order;
    }
}

package com.iweb.lesson18;

import java.sql.Connection;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 16:00
 * 描述: JdbcTemplate
 */
public abstract class JdbcTemplate {

    // 连接数据库
    public void getConnection() {

        // 获取用户名和密码
        System.out.println("设置用户名和密码");
        // 连接数据库
        conn();
        System.out.println("其他操作");
    }

    public abstract void conn();

    // 保存数据
    public abstract void save();

    // 查询数据
    public abstract void select();


    public void close() {
        System.out.println("关闭数据库");
    }

}

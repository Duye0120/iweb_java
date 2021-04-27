package com.iweb.lesson18;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 16:04
 * 描述: MySqlTemplate
 */
public class MySqlTemplate extends JdbcTemplate {
    @Override
    public void conn() {
        System.out.println("mysql conn");
    }

    @Override
    public void save() {
        System.out.println("mysql save");
    }

    @Override
    public void select() {
        System.out.println("mysql select");
    }
}

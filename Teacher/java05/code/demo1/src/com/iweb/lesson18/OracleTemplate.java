package com.iweb.lesson18;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 16:03
 * 描述: OracleTemplate
 */
public class OracleTemplate extends JdbcTemplate {
    @Override
    public void conn() {
        System.out.println("oracle 连接");
    }

    @Override
    public void save() {
        System.out.println("oracle save");
    }

    @Override
    public void select() {
        System.out.println("oracle select");
    }
}

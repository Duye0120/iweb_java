package com.iweb.lesson18;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 16:00
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

//        JdbcTemplate jdbcTemplate = new OracleTemplate();
        JdbcTemplate jdbcTemplate = new MySqlTemplate();

        jdbcTemplate.getConnection(); // 连接数据库

        jdbcTemplate.save();

        jdbcTemplate.select();

        jdbcTemplate.close();

    }

}

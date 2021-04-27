package com.iweb.lesson10;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 11:49
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) throws Exception {

        // Date
        Date date = new Date(); // 系统当前时间
        System.out.println(date);
        // 时间格式化   HH = 24  hh=12
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));// 2021-04-26 11:53:20

        // 将字符串转出 Date
        String dateStr = "2021-04-25 11:53:20";
        Date time = sdf.parse(dateStr);
        System.out.println(time);

        // Date -> long
        System.out.println(time.getTime());
    }
}

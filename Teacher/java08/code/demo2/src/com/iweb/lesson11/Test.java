package com.iweb.lesson11;

import java.util.Calendar;
import java.util.Date;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 11:55
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) {

        Date now = new Date();
        // 创建日历对象
        Calendar calendar = Calendar.getInstance();
        // 设定日历的基准时间
        calendar.setTime(now);
        // 时间的操作
        calendar.add(Calendar.MONTH, -1); // 把日历向前翻了一个月
        System.out.println(calendar.getTime());

    }
}

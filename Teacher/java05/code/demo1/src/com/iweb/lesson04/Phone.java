package com.iweb.lesson04;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 09:10
 * 描述: Phone
 */
public class Phone {

    private int time; // 电池使用时间

    private int cTime;

    // 计算使用时间
    private void setTime() {
        time = cTime * 24;
    }

    // 用户充电
    public void chongDian(int cTime) {
        this.cTime = cTime;
    }

    // 查看剩余使用时间
    public int getTime() {
        return time;
    }
}

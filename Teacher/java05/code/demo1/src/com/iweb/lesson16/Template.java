package com.iweb.lesson16;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 14:23
 * 描述: Template
 */
public abstract class Template {


    /**
     * 计算 action 执行的时间
     */
    public long time() {
        // 计算开始时间
        long start = System.currentTimeMillis(); // 系统当前时间
        action();
        // 计算结束时间
        long end = System.currentTimeMillis(); // 系统当前时间
        return end - start;
    }




    public abstract void action();

}

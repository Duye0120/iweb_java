package com.iweb.lesson09;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 14:05
 * 描述: Good
 */
public class Good {

    private Integer count = 2; // count>=0

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public void change() {
        // 一些业务 ： 不需要同步
        synchronized ("lock") { // 局部同步
            if (count >= 1) {
                System.out.println("1");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count--;
            }
        }
        // 一些业务 ：不需要同步
    }

}

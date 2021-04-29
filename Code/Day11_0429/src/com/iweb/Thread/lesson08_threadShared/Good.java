package com.iweb.Thread.lesson08_threadShared;

public class Good {
    private Integer count = 2;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    public void change() {
        if (count >= 1) {
            count--;
        }
    }
}

package com.duye.bean;

public class Page {
    // 哪一页
    private Integer current;
    // 多少条数据
    private Integer count;

    public Page() {
    }

    public Page(Integer current, Integer count) {
        this.current = current;
        this.count = count;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}

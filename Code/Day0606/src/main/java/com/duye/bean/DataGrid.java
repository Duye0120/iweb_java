package com.duye.bean;

import java.util.List;

public class DataGrid<T> {
    private Integer total;
    private List<T> list;
    private Integer Current;

    public Integer getCurrent() {
        return Current;
    }

    public void setCurrent(Integer current) {
        Current = current;
    }

    public DataGrid() {
    }

    public DataGrid(Integer total, List<T> list, Integer current) {
        this.total = total;
        this.list = list;
        Current = current;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}

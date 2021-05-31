package com.duye.bean;

public class Good {
    private Integer gid;
    private String gname;
    private Double gprice;

    public Good() {
    }

    public Good(Integer gid, String gname, Double gprice) {
        this.gid = gid;
        this.gname = gname;
        this.gprice = gprice;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Double getGprice() {
        return gprice;
    }

    public void setGprice(Double gprice) {
        this.gprice = gprice;
    }
}

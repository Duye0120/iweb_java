package com.duye.model;

public class Good {
    private String gid;
    private String gname;
    private Double price;
    private String stat;
    private Integer store;
    private String img_src;
    private String cid;

    public Good() {
    }

    public Good(String gid, String gname, Double price, String stat, Integer store, String img_src, String cid) {
        this.gid = gid;
        this.gname = gname;
        this.price = price;
        this.stat = stat;
        this.store = store;
        this.img_src = img_src;
        this.cid = cid;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public String getImg_src() {
        return img_src;
    }

    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}

package com.duye.model;

public class OrderGood {
    private String oid;
    private String gid;
    private Integer count;

    public OrderGood() {
    }

    public OrderGood(String oid, String gid, Integer count) {
        this.oid = oid;
        this.gid = gid;
        this.count = count;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}

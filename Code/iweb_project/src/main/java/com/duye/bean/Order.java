package com.duye.bean;

public class Order {
    private Integer oid;
    private Integer uid;
    private Integer gid;
    private Integer count;

    public Order() {
    }

    public Order(Integer oid, Integer uid, Integer gid, Integer count) {
        this.oid = oid;
        this.uid = uid;
        this.gid = gid;
        this.count = count;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void     setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}

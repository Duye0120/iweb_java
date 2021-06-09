package com.duye.model;

import java.sql.Date;

public class Category {
    private String cid;
    private String cname;
    private String stat;
    private Date ctime;

    public Category() {
    }

    public Category(String cid, String cname, String stat, Date ctime) {
        this.cid = cid;
        this.cname = cname;
        this.stat = stat;
        this.ctime = ctime;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}

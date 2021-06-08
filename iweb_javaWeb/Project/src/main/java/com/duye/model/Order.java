package com.duye.model;

import java.sql.Date;

public class Order {
    private String oid;
    private String meid;
    private Date ctime;

    public Order() {
    }

    public Order(String oid, String meid, Date ctime) {
        this.oid = oid;
        this.meid = meid;
        this.ctime = ctime;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getMeid() {
        return meid;
    }

    public void setMeid(String meid) {
        this.meid = meid;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}

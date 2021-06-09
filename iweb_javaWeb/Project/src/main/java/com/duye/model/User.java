package com.duye.model;

import java.sql.Date;

public class User {
    private String uid;
    private String account;
    private String uname;
    private String upwd;
    private String stat;
    private Date ctime;

    public User() {
    }

    public User(String uid, String account, String uname, String upwd, String stat, Date ctime) {
        this.uid = uid;
        this.account = account;
        this.uname = uname;
        this.upwd = upwd;
        this.stat = stat;
        this.ctime = ctime;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
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

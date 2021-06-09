package com.duye.model;

public class Member {
    private String meid;
    private String account;
    private String pwd;
    private String addr;

    public Member() {
    }

    public Member(String meid, String account, String pwd, String addr) {
        this.meid = meid;
        this.account = account;
        this.pwd = pwd;
        this.addr = addr;
    }

    public String getMeid() {
        return meid;
    }

    public void setMeid(String meid) {
        this.meid = meid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

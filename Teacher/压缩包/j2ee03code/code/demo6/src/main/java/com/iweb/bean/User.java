package com.iweb.bean;

/**
 * 作者: jack
 * 时间: 2021-06-03 0003 14:25
 * 描述: User
 */
public class User {
    private Integer id;
    private String account;
    private String pwd;
    private String addr;

    public User() {
    }

    public User(Integer id, String account, String pwd, String addr) {
        this.id = id;
        this.account = account;
        this.pwd = pwd;
        this.addr = addr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

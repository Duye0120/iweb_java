package com.duye.bean;

public class User {
    private Integer id;
    private String user;
    private String pwd;
    private String addr;

    public User() {
    }

    public User(Integer id, String user, String pwd, String addr) {
        this.id = id;
        this.user = user;
        this.pwd = pwd;
        this.addr = addr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", pwd='" + pwd + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}

package com.iweb.lesson01;

/**
 * 作者: jack
 * 时间: 2021-04-28 0028 09:02
 * 描述: User
 */
public class User {
    private Integer id;
    private String name;


    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode()");
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals(Object obj)");
        return true;
    }
}

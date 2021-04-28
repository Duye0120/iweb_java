package com.iweb.lesson02;

/**
 * 作者: jack
 * 时间: 2021-04-28 0028 09:02
 * 描述: User
 */
public class User implements Comparable<User> {
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
    public int compareTo(User o) {
        // 自定义比较规则
        if (this.id > o.id) return 1;
        if (this.id < o.id) return -1;
        return this.name.compareTo(o.name);
    }
}

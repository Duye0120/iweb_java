package com.iweb.Collection.TreeSetTest;

/**
 * 让对象类实现Comparable接口
 */
public class User implements Comparable<User> {
    private Integer id;
    private  String name;

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
        if (this.id > o.id) return 1;
        if (this.id < o.id) return -1;
        return this.name.compareTo(o.name);
    }
}

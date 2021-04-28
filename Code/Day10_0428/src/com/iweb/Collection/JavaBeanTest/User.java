package com.iweb.Collection.JavaBeanTest;

import java.util.Date;

public class User {

    /*所有的属性必须私有化*/
    private Integer id;
    private String name;
    private Integer age;
    private Date birth;

    /*无参的构造函数 - 必须的*/
    public User(int i, String jack, int i1) {

    }

    // 不是必须的
    public User(Integer id, String name, Integer age, Date birth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    /*set/get方法 - 必须的*/
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}

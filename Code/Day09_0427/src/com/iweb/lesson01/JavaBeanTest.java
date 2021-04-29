package com.iweb.lesson01;

import java.util.Date;

/**
 * 类:属性,方法
 * javabean:一个简单的java对象,类中不包含业务逻辑的方法
 * 1, 属性私有
 * 2. 无参的构造函数
 * 3. 公共的set/get方法
 */
public class JavaBeanTest {
    /*所有的属性必须私有化*/
    private Integer id;
    private String name;
    private Integer age;
    private Date birth;
    /*无参的构造函数-必须的*/

    public JavaBeanTest(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public JavaBeanTest() {
    }

    // 不是必须的

    public JavaBeanTest(Integer id, String name, Integer age, Date birth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birth = birth;
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

package com.iweb.lesson02;

/**
 * 作者: jack
 * 时间: 2021-04-22 0022 13:51
 * 描述: AbstractKettle
 */
public abstract class AbstractKettle {

    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void burn();

    public void warning() {
        System.out.println("嘟.....");
    }

}

package com.iweb.lesson03;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 09:10
 * 描述: Phone
 */
public class Phone {

    private String model = "华为M30"; // 型号     华为M30 华为P30
    private int memory = 4; // 内存   4 8

    public Phone() {

    }

    /*构造函数*/
    public Phone(String model) {
        this.model = model;
    }

    public Phone(int memory) {
        this.memory = memory;
    }

    public Phone(String model, int memory) {
        this.model = model;
        this.memory = memory;
    }

    /*set方式*/
    public void setModel(String model) {
        this.model = model;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    /*GET方法*/
    public String getModel() {
        return model;
    }

    public int getMemory() {
        return memory;
    }
}

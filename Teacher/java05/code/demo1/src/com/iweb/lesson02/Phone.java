package com.iweb.lesson02;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 08:59
 * 描述: Phone
 */
public class Phone {

    private String model; // 型号
    private int memory; // 内存


    public Phone(String model, int memory) {
        this.model = model;
        this.memory = memory;
    }

    // 查看手机的型号
    public String getModel() {
        return model;
    }

    // 查看手机的内存
    public int getMemory() {
        return memory;
    }

    // 拍照
    public void camera() {
        System.out.println("拍照");
    }

    // 打开应用
    public void openApp() {
        memory -= 1;
    }

}

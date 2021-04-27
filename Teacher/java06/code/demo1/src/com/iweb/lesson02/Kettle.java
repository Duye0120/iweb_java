package com.iweb.lesson02;

/**
 * 作者: jack
 * 时间: 2021-04-22 0022 13:35
 * 描述: Kettle
 */
public class Kettle extends AbstractKettle {


    public void burn() {
        System.out.println("电水壶烧水");
        super.warning();
    }


}

package com.iweb.lesson02;

/**
 * 作者: jack
 * 时间: 2021-04-22 0022 13:34
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        // Kettle kettle = new Kettle();
        AbstractKettle kettle = new KeepKettle();
        kettle.setColor("白色");
        kettle.burn();

        // 向下转型 instanceof  : 判断一个对象是否是一个类的类型, 必须有继承关系
        if (kettle instanceof KeepKettle) {
            // (KeepKettle) kettle 强制类型转换
            ((KeepKettle) kettle).isKeep();
        }

        // 使用电茶壶
        kettle = new TeaKettle();
        kettle.setColor("黑色");
        kettle.burn();

    }

}

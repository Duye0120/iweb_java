package com.iweb.lesson02;

/**
 * 作者: jack
 * 时间: 2021-04-22 0022 13:41
 * 描述: KeepKettle
 */
public class KeepKettle extends Kettle {

    private boolean keep = false; //  false

    public void isKeep() {
        this.keep = !this.keep;
        System.out.println(this.keep ? "保温" : "取消保温");
    }

}

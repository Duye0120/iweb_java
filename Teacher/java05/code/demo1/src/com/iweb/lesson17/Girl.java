package com.iweb.lesson17;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 15:43
 * 描述: Girl
 */
public class Girl {

    private String name;

    private long faceValue;

    public Girl() {

    }

    public Girl(String name, long faceValue) {
        this.name = name;
        this.faceValue = faceValue;
    }

    public String getName() {
        return name;
    }

    public long getFaceValue() {
        return faceValue;
    }

    public void marryTo(Boy boy) {
        System.out.println(name + ",say:考虑以下，嫁给:" + boy.getName());
    }

}

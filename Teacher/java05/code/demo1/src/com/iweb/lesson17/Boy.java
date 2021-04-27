package com.iweb.lesson17;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 15:43
 * 描述: Boy
 */
public class Boy {

    private String name;
    private long wealth;

    public Boy() {
    }

    public Boy(String name, long wealth) {
        this.name = name;
        this.wealth = wealth;
    }

    public String getName() {
        return name;
    }

    public long getWealth() {
        return wealth;
    }

    public void getGirl(Girl girl) {
        System.out.println(name + ",say:我要娶妻:" + girl.getName());
    }

}

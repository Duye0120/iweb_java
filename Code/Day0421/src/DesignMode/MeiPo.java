package DesignMode;

public class MeiPo {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setName("tom");
        boy.setWealth( 1001);
        Girl g1 = new Girl();
        Girl girl = g1;
        girl.setName( "Lucy");
        girl.setFaceValue(100);
        MeiPo meiPo = new MeiPo();
        meiPo.matching(boy, girl);


    }

    public void matching(Boy boy, Girl girl) {
        System.out.println("我叫" + boy.getName() + "我的财富是" + boy.getWealth());
        System.out.println("我叫" + girl.getName() + "我的颜值是" + girl.getFaceValue());
        if (boy.getWealth() > 1000 && girl.getFaceValue() > 100) {
            System.out.println("匹配成功");
            boy.getGirl(girl);
            girl.marryTo(boy);
            System.out.println("牵手成功");
            return;
        } else {
            System.out.println("匹配失败");
            boy.getGirl(girl);
            girl.marryTo(boy);
            System.out.println("牵手失败");
            return;
        }

    }
}

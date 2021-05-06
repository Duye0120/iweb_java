package XianChenTexy;

public class Test {
    public static void main(String[] args) {
        MyRunable myRunable = new MyRunable();
//        创建多个线程（线程的执行顺序不一定）
//        Thread t1 = new Thread(myRunable,"A");
//        Thread t2 = new Thread(myRunable,"B");
//        Thread t3 = new Thread(myRunable,"C");
//        t1.start();
//        t2.start();
//        t3.start();
        MyRuanable3 runable1 = new MyRuanable3();
        MyRunable1 runable2 = new MyRunable1();
        Thread t4 = new Thread(runable1);
        Thread t5 = new Thread(runable2);
        runable1.setT(t5);
        t4.start();
//        t4.start();
//        t5.start();
    }
}

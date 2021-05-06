package Exercise.HomeWork2;

public class Test2 {
    public static void main(String[] args) {
//        获取业务
        Exchange1 ex1 = new Exchange1();

//        创建两个进程
        Thread t1 = new Thread(ex1,"A");
        Thread t2 = new Thread(ex1,"B");
        t1.start();
        t2.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized ("lock2"){
            "lock2".notifyAll();
        }

    }
}

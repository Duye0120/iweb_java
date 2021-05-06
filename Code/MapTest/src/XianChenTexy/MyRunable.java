package XianChenTexy;

public class MyRunable implements Runnable{
//    要实现的业务
    @Override
    public void run() {
        System.out.println("这是一个业务:"+Thread.currentThread().getName());
    }
}

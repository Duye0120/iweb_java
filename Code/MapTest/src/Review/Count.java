package Review;

import java.util.concurrent.CountDownLatch;

public class Count {
    public static void main(String[] args) throws InterruptedException {
//        充当一个门闩的作用
        CountDownLatch cdl = new CountDownLatch(1);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName()+"准备就绪");
                    cdl.await();
                    System.out.println(Thread.currentThread().getName()+"完成啦！！！");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Thread.sleep(1000 * 2);
        System.out.println("裁判开手枪了");
        cdl.countDown();
    }
}

package XianChenTexy;

public class MyRunable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
//                让当前线程休眠1毫秒
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

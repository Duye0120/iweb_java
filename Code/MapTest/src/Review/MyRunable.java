package Review;

public class MyRunable implements Runnable{
    Boolean flag = true;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(flag){
                try {
//                睡眠1s
                    Thread.sleep(10000 * 10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
            }


    }
}

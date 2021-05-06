package Thread_HomeWork.HomeWork02;
import java.util.concurrent.locks.ReentrantLock;

    /**
     * 设计一个购票系统：可以多个线程同时进行购票，确保购票的业务正确
     */

    class Widow implements Runnable{
        private int ticket = 100;

        // 1. 实例化一个ReentrantLock
        private ReentrantLock lock = new ReentrantLock(true);
        @Override
        public void run() {
            while (true) {
                try {
                    //2. 调用lock()
                    lock.lock();

                    if (ticket > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "售票,票号为:"+ ticket);
                        ticket--;
                    }else{
                        break;
                    }
                }finally {
                    // 3. 调用解锁方法();
                    lock.unlock();
                }

            }
        }
    }


public class Ticket {
    public static void main(String[] args) {
        Widow w = new Widow();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("线程1");
        t2.setName("线程2");
        t3.setName("线程3");
        t1.start();
        t2.start();
        t3.start();
    }
}
package Thread.Lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题方式三:Lock锁 --- JDK5.0新增
 *
 * 1. synchronized和ReentrantLock的区别
 *    相同:两者都可以解决线程安全问题
 *    不同:synchronized机制在执行完相应的同步代码以后,自动释放同步监视器
 *    Lock需要手动的去启动同步(lock()),同时结束同步也要手动实现(unlock());
 *
 *    优先使用顺序:Lock->同步代码块(已经进入了方法体,分配了相应资源 synchronized) -> 同步方法(在方法体之外)
 *
 *  面试题:如何解决线程安全问题?有几种方式
 *  A:三种方式1. Lock
 *           2. 同步代码(synchronized)
 *           3. 同步方法
 */

class Widow implements Runnable{
    private int ticket = 100;

    // 1. 实力换一个ReentrantLock
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

public class LockTest {
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

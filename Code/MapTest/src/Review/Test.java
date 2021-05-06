package Review;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) throws Exception {

        ReentrantLock lockA = new ReentrantLock();
        ReentrantLock lockB = new ReentrantLock();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (lockA.tryLock(1, TimeUnit.SECONDS)) {
                        System.out.println("1-A");
                        if (lockB.tryLock(2, TimeUnit.SECONDS)) {
                            System.out.println("1-B");
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    if (lockB.isHeldByCurrentThread()) lockB.unlock();
                    if (lockA.isHeldByCurrentThread()) lockA.unlock();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (lockB.tryLock(1, TimeUnit.SECONDS)) {
                        System.out.println("2-B");
                        if (lockA.tryLock(2, TimeUnit.SECONDS)) {
                            System.out.println("2-A");
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    if (lockA.isHeldByCurrentThread()) lockA.unlock();
                    if (lockB.isHeldByCurrentThread()) lockB.unlock();
                }

            }
        });

        t1.start();
        t2.start();

    }
}
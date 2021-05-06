package Review;

import java.util.List;

public class Consume implements Runnable{
    private List list;

    public Consume(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (list){
                if (list.size() == 0){
                    try {
//                    消费者没有元素就不消费 释放锁
                        System.out.println("没有元素");
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//            程序进入这里说明size>0进行消费
                Object remove = list.remove(0);
                System.out.println("消费了"+remove);
//                list.notifyAll();
            }
        }
    }
}

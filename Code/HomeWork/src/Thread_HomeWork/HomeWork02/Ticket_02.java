package Thread_HomeWork.HomeWork02;


public class Ticket_02 {
    public static void main(String[] args) {
        Good good = new Good();
        GoodRunnable gr = new GoodRunnable(good);
        Thread t1 = new Thread(gr, "窗口1");
        Thread t2 = new Thread(gr, "窗口2");
        Thread t3 = new Thread(gr, "窗口3");
        t1.start();
        t2.start();
        t3.start();

    }
}

class Good {
    private Integer count = 100;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    public void change() {
        while (true) {
            synchronized ("lockA") {
                if (count > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票；剩余数量为" + getCount());
                    count--;
                } else {
                    break;
                }
            }
        }

    }
}

class GoodRunnable implements Runnable {
    private Good good;

    public GoodRunnable(Good good) {
        this.good = good;
    }

    @Override
    public void run() {
        good.change();
    }
}
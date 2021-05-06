package XianChenTexy;

public class Test01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized ("lock"){
                    System.out.println("开始");
                    try {
                        "lock".wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("结束");
                }
            }
        }).start();

    }
}

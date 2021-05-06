package XianChenTexy;

public class MyRuanable3 implements Runnable{
    private Thread t;

    public void setT(Thread t) {
        this.t = t;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            if(i == 3){

                try {

                    t.start();
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}

package Exercise.HomeWork3;

public class MyRunable implements Runnable{
    private Ticket ti;
    private int nu;

    public MyRunable(Ticket ti, int nu) {
        this.ti = ti;
        this.nu = nu;
    }

    @Override
    public void run() {
        synchronized (this){
            ti.purchase(nu);
        }
    }
}

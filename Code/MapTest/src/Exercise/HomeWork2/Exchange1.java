package Exercise.HomeWork2;



public class Exchange1 implements Runnable {

    @Override
    public void run() {
        synchronized ("lock2"){
            for (int i = 0; i < 5 ; i++) {
                System.out.println(Thread.currentThread().getName());
                try {

                    "lock2".notify();
                    "lock2".wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package JavaTest;

public class DeathClock {
    public static void main(String[] args) {
        final Object o1 = new Object();
        final Object o2 = new Object();

        Thread t1 = new Thread("A"){
            @Override
            public void run() {
                try {
                    synchronized(o1) {
                        System.out.println("Ao1获得锁");
                        Thread.sleep(1000);
                        synchronized(o2){
                            System.out.println("Ao2获得锁");
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread("B"){
            @Override
            public void run() {
                try {
                    synchronized(o2) {
                        System.out.println("Bo2获得锁");
                        Thread.sleep(1000);
                        synchronized(o1){
                            System.out.println("Bo1获得锁");
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}

package Review;
/**
*@author shark
*@date 2021/4/30 14:31
*desc
*/
public class MyThread {
    public static void main(String[] args) {
        MyRunable myRunable = new MyRunable();
        Thread t1 = new Thread(myRunable);
        t1.start();
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();
    }
}

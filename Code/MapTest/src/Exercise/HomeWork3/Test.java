package Exercise.HomeWork3;

public class Test {
    public static void main(String[] args) {
//        创建同一个票池
        Ticket ticket = new Ticket();
//        创建两个任务
        MyRunable run1= new MyRunable(ticket, 1);
        MyRunable run2= new MyRunable(ticket, 2);
        MyRunable run3= new MyRunable(ticket, 4);
//        创建多线程
        new Thread(run1,"用户A").start();
        new Thread(run2,"用户B").start();
        new Thread(run3,"用户C").start();
        new Thread(run2,"用户D").start();
        new Thread(run2,"用户E").start();
    }
}

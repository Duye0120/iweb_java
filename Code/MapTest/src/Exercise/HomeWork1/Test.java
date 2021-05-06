package Exercise.HomeWork1;

public class Test {
    public static void main(String[] args) {
//        创建同一个对象
        Node node = new Node();
//        创建需要执行的方法
        Exchange ex = new Exchange();
        ex.setNode(node);
//        创建两个线程
        Thread t1 = new Thread(ex);
        Thread t2 = new Thread(ex);
        t1.start();
        t2.start();
    }
}

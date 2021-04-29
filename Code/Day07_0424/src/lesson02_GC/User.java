package lesson02_GC;

public class User {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("我被回收了");
        super.finalize();
    }
}

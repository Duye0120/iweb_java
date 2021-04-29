package lesson02_GC;

/**
 * 垃圾回收:java自动垃圾回收机制(GC),对象不可达回收
 * 1. 当内存到达一定的使用空间后会出发垃圾回收
 * 2. 对象不可达时自动出发垃圾回收
 * 3. 主动调用gc(),但不一定会立即调用.
 *
 * finalize() : 垃圾回收
 */
public class Test {

    @org.junit.Test
    public void finalizeTest() throws InterruptedException {
        User user = new User();
        user = null;
        System.gc();
        Thread.sleep(5000);

    }
}

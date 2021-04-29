package Teacher;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 14:36
 * 描述: Handler2
 */
public class Handler2 extends Before implements Buy, Run {
    @Override
    public void buy() {
        System.out.println("德基买");
    }

    @Override
    public void run() {
        System.out.println("打的");
    }
}

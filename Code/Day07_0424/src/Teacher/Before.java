package Teacher;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 14:31
 * 描述: Before
 */
public abstract class Before implements Handler {
    @Override
    public void before() {
        System.out.println("确认手机");
    }

    //    public void before() {
//        System.out.println("确认手机");
//    }
}

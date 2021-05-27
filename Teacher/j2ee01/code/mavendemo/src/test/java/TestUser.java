import com.iweb.test.User;
import org.junit.Test;

/**
 * 作者: jack
 * 时间: 2021-05-27 0027 09:01
 * 描述: TestUser
 */
public class TestUser {

    @Test
    public void testAdd() {
        User user = new User();
        int res = user.add(10, 20);
        System.out.println(res);
    }


    @Test
    public void test() {
        String a = "10";
        switch (a) {
            case "1":
                System.out.println(1);
        }
    }

}

import com.duye.Dao.UserDao;
import com.duye.bean.User;
import org.junit.Test;

public class TestDao {
    @Test
    public void test() {
        UserDao userDao = new UserDao();
        User user = userDao.selectByUserName("admin");
        System.out.println(user);
    }
}

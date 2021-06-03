import com.duye.bean.User;
import com.duye.dao.UserDao;
import org.junit.Test;

public class TestUserDao {
    @Test
    public void selectUserByNameTest() {
        UserDao userDao = new UserDao();
        User user = userDao.selectUserByName("admin");
        System.out.println(user);


    }
}

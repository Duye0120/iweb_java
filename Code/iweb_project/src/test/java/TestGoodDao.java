import com.duye.bean.Good;
import com.duye.dao.GoodDao;
import org.junit.Test;

import java.util.List;

public class TestGoodDao {
    @Test
    public void selectGoods() {
        GoodDao goodDao = new GoodDao();
        List<Good> list = goodDao.selectGoods();
        System.out.println(list);
    }
}

import com.duye.bean.Order;
import com.duye.dao.OrderDao;
import org.junit.Test;

public class TestOrderDao {
    @Test
    public void selectOder(){
        OrderDao orderDao = new OrderDao();
        Order order = orderDao.selectOrder();
        System.out.println(order.toString());
    }
}

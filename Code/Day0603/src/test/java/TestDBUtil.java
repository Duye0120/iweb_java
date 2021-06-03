import com.duye.Utils.DBUtils;
import org.junit.Test;

import java.sql.Connection;

public class TestDBUtil {

    @Test
    public void test() {
        DBUtils dbUtils = new DBUtils();
        Connection conn = dbUtils.getConnection();
        System.out.println(conn);
    }
}

import com.duye.utils.DBUtil;
import org.junit.Test;

import java.sql.Connection;

public class DbUtils {
    @Test
    public void test() throws Exception {
        DBUtil dbUtil = new DBUtil();
        Connection conn = dbUtil.init();
        System.out.println(conn);
    }
}
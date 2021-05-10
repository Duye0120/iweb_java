package lesson02;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        DBUtil util = new DBUtil();


        try {
            Connection conn = util.getConnection();
            String sql = "select * from emp";
            /**
             * 1. 发送语句
             * 2. 发送执行指令
             * 3. 接收返回结果集
             */
            // 这个实例可以发送语句
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            //遍历结果集
            List<Emp> emps = new ArrayList<>();
            while (rs.next()) {
                int empno = rs.getInt("EMPNO");
                String ename = rs.getString("ENAME");
                String job = rs.getString("JOB");
                int mgr = rs.getInt("mgr");
                Date hiredate = rs.getDate("HIREDATE");
                double sal = rs.getDouble("SAL");
                double comm = rs.getDouble("COMM");
                int deptno = rs.getInt("DEPTNO");
                //System.out.println(empno + "\t" + ename + "\t" +job + "\t" + hiredate + "\t" + sal + "\t" + comm + "\t" + deptno);
                Emp emp = new Emp(empno,ename,job,mgr,hiredate,sal,comm,deptno);
                emps.add(emp);
                emps.forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
    }
}

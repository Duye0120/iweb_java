package lesson02;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 杜也
 */
public class EmpDao {
    private DBUtil dbUtil;

    public EmpDao(DBUtil dbUtil) {
        this.dbUtil = dbUtil;
    }

    /**
     * 查询所有
     *
     * @return
     */
    public ArrayList<Object> selectAll() {
        ArrayList<Object> emps = new ArrayList<>();
        String sql = "select * from emp";
        try {
            Connection conn = dbUtil.getConnection();
            /**
             * 1. 发送语句
             * 2. 发送执行指令
             * 3. 接收返回结果集
             */
            // 这个实例可以用来发送语句
            Statement st = conn.createStatement();
            // 返回并查询返回结果集
            ResultSet rs = st.executeQuery(sql);
            // 遍历结果集
            while (rs.next()) {
                Emp emp = createEmp(rs);
                emps.add(emp);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                dbUtil.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return emps;
    }

    private Emp createEmp(ResultSet rs) throws SQLException {
        int empno = rs.getInt("EMPNO");
        String ename = rs.getString("ENAME");
        String job = rs.getString("JOB");
        int mgr = rs.getInt("mgr");
        Date hiredate = rs.getDate("HIREDATE");
        double sal = rs.getDouble("SAL");
        double comm = rs.getDouble("COMM");
        int deptno = rs.getInt("DEPTNO");
        return new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
    }

    /**
     * 条件查询你
     */
    public List<Emp> selectAllByDeptNo(int dno) {
        List<Emp> emps = new ArrayList<>();
        String sql = "select * from emp where deptno =" + dno;
        try {
            Connection conn = dbUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // 遍历结果集
            while (rs.next()) {
                Emp emp = createEmp(rs);
                emps.add(emp);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                dbUtil.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return emps;
    }

    /**
     * 推荐使用*****
     * PreparedStatement:statement的拓展可以执行预编译的查询，将查询分为2步
     * 1. 发送sql语句  sql = select * from emp where deptno = ? and sal > ?
     * || ?(1,2,3,4,...)
     * 2. 设置查询条件  根据?的位置进行设置
     * 好处:安全
     */
    public List<Emp> selectAllByDeptNoSal(Emp emp) {
        String sql = "select * from emp where deptno = ? and sal > ?";
        List<Emp> emps = new ArrayList<>();

        try {
            Connection conn = dbUtil.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            //设置参数
            pst.setInt(1, emp.getDeptno());
            pst.setDouble(2, emp.getSal());
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Emp e = createEmp(rs);
                emps.add(e);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                dbUtil.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return emps;
    }

    public List<Emp> selectLikeName(String name) {
        String sql = "select * from emp where ename like ?";
        List<Emp> emps = new ArrayList<>();

        try {
            Connection conn = dbUtil.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Emp emp = createEmp(rs);
                emps.add(emp);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                dbUtil.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return emps;
    }

    /**
     * 主键查询
     */
    public Emp selecById(int eno) {
        Emp emp = null;
        String sql = "select * from emp where empno = ?";

        try {
            Connection conn = dbUtil.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, eno);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                emp = createEmp(rs);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                dbUtil.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return emp;
    }

    public List<Emp> selectPage(int current, int size) {
        List<Emp> emps = new ArrayList<>();
        // ?1:开始条 startIndex ?2:结束条 endIndex

        String sql = "select * from" +
                "(select a.*,rownum rn from" +
                "(select * from emp order by empno) a where rownum <= ? b where b.rn > ?";

        int startIndex = (current - 1) * size;
        int endIndex = current * size;

        try {
            Connection conn = dbUtil.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, endIndex);
            pst.setInt(2, startIndex);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Emp emp = createEmp(rs);
                emps.add(emp);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                dbUtil.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        return emps;
    }

}

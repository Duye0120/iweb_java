package com.iweb.lesson02;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 作者: jack
 * 时间: 2021-05-07 0007 09:59
 * 描述: EmpDao: 针对Emp表的JDBC操作
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
    public List<Emp> selectAll() {
        List<Emp> emps = new ArrayList<>();
        String sql = "select * from emp";
        try {
            Connection conn = dbUtil.getConnection();
            /**
             * 1. 发送语句
             * 2. 发送执行指令
             * 3. 接收返回结果集
             */
            Statement st = conn.createStatement(); // 这个实例可用发送语句
            ResultSet rs = st.executeQuery(sql); // 发送 并 查询 返回结果集
            // 遍历结果集
            while (rs.next()) {
                Emp emp = createEmp(rs);
                emps.add(emp);
            }
        } catch (Exception e) {
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
     * 条件查询
     *
     * @param dno
     * @return
     */
    public List<Emp> selectAllByDeptno(int dno) {
        List<Emp> emps = new ArrayList<>();
        String sql = "select * from emp where deptno = " + dno;
        try {
            Connection conn = dbUtil.getConnection();
            /**
             * 1. 发送语句
             * 2. 发送执行指令
             * 3. 接收返回结果集
             */
            Statement st = conn.createStatement(); // 这个实例可用发送语句
            ResultSet rs = st.executeQuery(sql); // 发送 并 查询 返回结果集

            // 遍历结果集
            while (rs.next()) {
                Emp emp = createEmp(rs);
                emps.add(emp);
            }

        } catch (Exception e) {
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
     * 推荐使用*****************
     * PreparedStatement: Statement的扩展可以执行预编译的查询,将查询分成2步
     * 1. 发送sql语句    sql = select * from emp where deptno = ?  and sal > ?   ||   ? (1,2,3,4....)
     * 2. 设置查询条件   根据 ? 的位置进行设置
     * 好处：安全
     */
    public List<Emp> selectAllByDeptnoSal(Emp emp) {
        String sql = "select * from emp where deptno = ?  and sal > ?";
        List<Emp> emps = new ArrayList<>();

        try {
            Connection conn = dbUtil.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            // 设置参数
            pst.setInt(1, emp.getDeptno());
            pst.setDouble(2, emp.getSal());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Emp e = createEmp(rs);
                emps.add(e);
            }

        } catch (Exception e) {
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

    public List<Emp> selectLikeEname(String name) {

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

        } catch (Exception e) {
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
     *
     * @param eno
     * @return
     */
    public Emp selectById(int eno) {
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
        } catch (Exception e) {
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

    /**
     * @param current : 当前页
     * @param size    : 当前页的条数
     * @return
     */
    public List<Emp> selectPage(int current, int size) {

        List<Emp> emps = new ArrayList<>();

        // ? 1 : 开始条 startIndex  ? 2: 结束条 endIndex
        String sql = "select * from " +
                "(select a.*,rownum rn from " +
                "(select * from emp order by empno) a where rownum <= ? ) b where b.rn >?";

        // 由 （int current, int size） 计算得到 （startIndex，endIndex）
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
        } catch (Exception e) {
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
        Integer empno = rs.getInt("EMPNO");
        String ename = rs.getString("ENAME");
        String job = rs.getString("JOB");
        Integer mgr = rs.getInt("mgr");
        Date hiredate = rs.getDate("HIREDATE");
        Double sal = rs.getDouble("SAL");
        Double comm = rs.getDouble("COMM");
        Integer deptno = rs.getInt("DEPTNO");
        return new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
    }
}

package com.iweb.lesson02;


/**
 * 作者: jack
 * 时间: 2021-05-07 0007 09:43
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) throws Exception {

        DBUtil util = new DBUtil();

        EmpDao empDao = new EmpDao(util);

        // List<Emp> emps = empDao.selectAll();
        // emps.forEach(System.out::println);

        // empDao.selectAllByDeptno(10).forEach(System.out::println);


//        Emp emp = new Emp();
//        emp.setDeptno(10);
//        emp.setSal(2000.0d);
//        empDao.selectAllByDeptnoSal(emp).forEach(System.out::println);

        // empDao.selectLikeEname("%A%").forEach(System.out::println);

        // System.out.println(empDao.selectById(7876));

        empDao.selectPage(2, 5).forEach(System.out::println);

    }
}

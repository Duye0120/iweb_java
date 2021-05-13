package com.os;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class Init implements Manager {
    //    创建一个可用编号常量池（只要员工一离职 就会把id存放在池子中）
//    最好用链表增删太多了！！
    public final static ArrayList<String> list = new ArrayList<>();

    @Override
    public void init() {
//        连接数据库
        DBUtil util = new DBUtil();

        Connection conn = null;
        try {
            conn = util.getConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String sql = "truncate table employee";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            synchronized (this) {
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String createEmployee(String employeeName, boolean employeeType) {
        MyKit kit = new MyKit();
//        首先判断字符串是否符合
        if (kit.isSpecialChar(employeeName)) {
            throw new RuntimeException("含有非法字符,请检查名字是否正确");
        }
//        根据员工就职类型来分配工号
        String s = null;
//        判断编号可用池是否有数据
        synchronized (this) {
            if (Init.list.size() != 0) {
                kit.sort(Init.list);
                String s1 = list.get(0);
                if (employeeType) {
//                    插入
                    kit.insetIn(s1, employeeName, String.valueOf(employeeType));
                    return employeeName.toUpperCase().substring(0, 1) + s1;
                } else {
//                    插入
                    kit.insetIn(s1, employeeName, String.valueOf(employeeType));
                    return "WX" + employeeName.toUpperCase().substring(0, 1) + s1;
                }

            }
        }

        if (employeeType) {

//            从数据库拿到员工数量

//            首字母大写
            try {
                s = employeeName.toUpperCase().substring(0, 1) + (kit.getNum() + 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            kit.insetIn(s, employeeName, String.valueOf(employeeType));
            return s;
        }
        try {
            s = "WX" + employeeName.toUpperCase().substring(0, 1) + (kit.getNum() + 1000);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        kit.insetIn(s, employeeName, String.valueOf(employeeType));
        return s;
    }

    @Override
    public boolean updateEmployeeID(String oldEmployeeID, int idNumber) {
//        首先判断是否有这个员工和员工的身份看是否能继续往下执行
        MyKit kit = new MyKit();
        if (kit.hasEmp(oldEmployeeID)) {
//            首先判断池子中有没有数据
            if (list.size() == 0) {
                return false;
            }
//            判断要更改的数据 是否在池子里
            for (String item :
                    list) {
                if (item.equals("" + (idNumber + 1000))) {
//                    从池子中移除
                    list.remove(item);
//                    从池子中增加
                    list.add(oldEmployeeID.substring(1));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean updateStatus(String employeeID, boolean newStatus) {
        MyKit kit = new MyKit();
//        判断是否能更新
        synchronized (this) {
            if (kit.canUpdate(employeeID)) {
//            调用jdbc更改数据库
                kit.update(employeeID);
//                将id放入池子
                if (employeeID.length() == 5) {
                    list.add(employeeID.substring(1));
                } else {
                    list.add(employeeID.substring(3));
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String getEmployeeIDByName(String employeeName) {
//        查找有没有这个员工
        MyKit kit = new MyKit();
        if (kit.hasEmp(employeeName, true)) {
            if (kit.box(employeeName).size() == 1) {
                return kit.box(employeeName).get(0);
            } else {
                return kit.sort(kit.box(employeeName)).get(0);
            }
        }
        return null;
    }

}

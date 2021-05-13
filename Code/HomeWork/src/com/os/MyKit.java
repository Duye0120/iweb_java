package com.os;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MyKit {
    DBUtil util = new DBUtil();
    //   数据库中有多少条数据
    public synchronized int getNum() throws Exception {

        Connection conn = null;
        try {
            conn = util.getConnection();
            String sql = "select count(1) s from employee";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                return rs.getInt("s");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
        return -1;
    }

    //    插入数据库方法
    public void insetIn(String s, String employeeName, String employeeType) {
        Connection conn = null;
        try {
//                插入到数据库
            conn = util.getConnection();
            String sql = "insert into  employee values(?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, s);
            pst.setString(2, employeeName);
            pst.setString(3, employeeType);
            pst.setString(4, "true");
            int i = pst.executeUpdate();
            if (i == 1) {
                System.out.println("创建成功");
            } else {
                System.out.println("创建失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //    正则表达式判断是否有非法字符
    public boolean isSpecialChar(String str) {
        String regEx = "[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]|\n|\r|\t";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.find();
    }

    //    判断是否有这个员工
    public boolean hasEmp(String id) {
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = util.getConnection();
            String sql = "select * from employee where employeeID = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, id);
            rs = pst.executeQuery();
            if (!rs.next()) return false;
            if (rs.getString("employeeType").equals("true") && rs.getString("status").equals("true")) return true;
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    public boolean hasEmp(String name, boolean b) {
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = util.getConnection();
            String sql = "select * from employee where employeename = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            rs = pst.executeQuery();
            ResultSet rs1 = rs;
            if (!rs.next()) return false;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return false;
    }

    public ArrayList<String> box(String name) {
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = util.getConnection();
            String sql = "select * from emmloyee where employeename = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            ArrayList<String> list = new ArrayList<>();
            rs = pst.executeQuery();
            while (rs.next()) {
                if (rs.getString("employeeid").length() == 5) {
                    list.add(rs.getString("employeeid").substring(1));
                } else {
                    list.add(rs.getString("employeeid").substring(3));
                }
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return null;
    }

    //    判断是否能更新状态
    public boolean canUpdate(String id) {
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = util.getConnection();
            String sql = "select * from employee where employeeID = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, id);
            rs = pst.executeQuery();
            if (!rs.next()) return false;
//            System.out.println(rs.getString("employeeType") + 1);
//            System.out.println(rs.getString("status")+ 2);
            if (rs.getString("status").equals("false")) return false;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return false;
    }

    //    对静态常量池排序
    public ArrayList<String> sort(ArrayList<String> list) {
        ArrayList<String> l = list;
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (Integer.parseInt(o1) > Integer.parseInt(o2)) {

                    return 1;
                }
                if (Integer.parseInt(o1) < Integer.parseInt(o2)) {
                    return -1;
                }
                return 0;
            }
        };
        Collections.sort(l, comparator);
        return l;
    }

    //   更新状态
    public void update(String id) {
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = util.getConnection();
            String sql = "UPDATE employee set status = 'false' where employeeid = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, id);
            int i = pst.executeUpdate();
            if (i == 1) {
                System.out.println("更新成功！");
            } else {
                System.out.println("更新失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}

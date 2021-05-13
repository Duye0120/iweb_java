package com.os;

public interface Manager {
    void init();
    String createEmployee(String employeeName,boolean employeeType);
    boolean updateEmployeeID(String oldEmployeeID,int idNumber);
    boolean updateStatus(String employeeID,boolean newStatus);
    public String getEmployeeIDByName(String employeeName);
}

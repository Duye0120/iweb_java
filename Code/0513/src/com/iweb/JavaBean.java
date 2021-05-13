package com.iweb;

public class JavaBean {
    private String employeeName;
    private boolean employeeType;
    private boolean Status;
    private int employeeId;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public boolean isEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(boolean employeeType) {
        this.employeeType = employeeType;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "JavaBean{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeType=" + employeeType +
                ", Status=" + Status +
                ", employeeId=" + employeeId +
                '}';
    }
}

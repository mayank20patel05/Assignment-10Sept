package com.company.inheritance;

public class Employee {
    protected String name;
    private int employeeId;
    private String dept;
    private String hireDate;
    private double hourlyRate;

    public Employee(String name, int employeeId, String dept, String hireDate, double hourlyRate) {
        this.name = name;
        this.employeeId = employeeId;
        this.dept = dept;
        this.hireDate = hireDate;
        this.hourlyRate = hourlyRate;
    }

    public String getEmployeeDetails() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", dept='" + dept + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", hourlyRate=" + hourlyRate +
                '}';
    }

    public double getSalary(){
        return hourlyRate * 40 * 52;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", dept='" + dept + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}

package com.company.inheritance;

public class Manager extends Employee {
    private double allowance;

    public Manager(String name, int employeeId, String dept, String hireDate, double hourlyRate, double allowance) {
        super(name, employeeId, dept, hireDate, hourlyRate);
        this.allowance = allowance;
    }

    @Override
    public double getSalary() {
        return (getHourlyRate()+allowance) * 40 * 52;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", employeeId=" + getEmployeeId() +
                ", dept='" + getDept() + '\'' +
                ", hireDate='" + getHireDate() + '\'' +
                ", hourlyRate=" + getHourlyRate() +
                "allowance=" + allowance +
                '}';
    }
}

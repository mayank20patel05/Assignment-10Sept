package com.company.inheritance;

public class Director extends Manager{
    private double bonus;

    public Director(String name, int employeeId, String dept, String hireDate, double hourlyRate, double allowance, double bonus) {
        super(name, employeeId, dept, hireDate, hourlyRate, allowance);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + getName() + '\'' +
                ", employeeId=" + getEmployeeId() +
                ", dept='" + getDept() + '\'' +
                ", hireDate='" + getHireDate() + '\'' +
                ", hourlyRate=" + getHourlyRate() +
                "allowance=" + getAllowance() +
                "bonus=" + bonus +
                '}';
    }
}

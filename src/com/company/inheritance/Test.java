package com.company.inheritance;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Mayank", 1001, "Developer", "01/01/2021", 25.50);
        Manager manager = new Manager("Jayesh", 1005, "Dev Ops","15/08/2021", 28.25, 1.25);
        Director director = new Director("Jugal", 1002, "Data Analysis", "15/08/2021", 26.25, 1, 5000);

        System.out.println(employee.toString());
        System.out.println(manager.toString());
        System.out.println(director.toString());
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private String fatherName, motherName, sonName, daughterName;
    private double fatherSalary, motherSalary, sonFee, daughterFee;
    private static final int GROCERY = 500;

    public Family(String fatherName, String motherName, String sonName, String daughterName, int fatherSalary, int motherSalary, int sonFee, int daughterFee) {
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.sonName = sonName;
        this.daughterName = daughterName;
        this.fatherSalary = fatherSalary;
        this.motherSalary = motherSalary;
        this.sonFee = sonFee;
        this.daughterFee = daughterFee;
    }

    public String displayNames() {
        return "Family{" +
                "fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", sonName='" + sonName + '\'' +
                ", daughterName='" + daughterName + '\'' +
                '}';
    }

    public double totalSalary(){
        return fatherSalary + motherSalary;
    }

    public double totalFee(){
        return sonFee + daughterFee;
    }

    public double getSavings(){
        double savings = totalSalary() - totalFee() - Family.GROCERY;
        if(savings > 1000){
            System.out.printf("Congratulations! %s, you have saved %f this month \n", fatherName, savings);
        }
        else{
            System.out.println("Dear %s, Please try to save next month.");
        }
        return savings;
    }
}

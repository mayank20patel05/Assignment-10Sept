package com.company;

import java.util.Scanner;

public class BMI {
    public static double height, weight, bmi;

    public static void getBmi(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter height in meter");
        height = scanner.nextDouble();

        System.out.println("Enter weight in kg");
        weight = scanner.nextDouble();

        bmi = weight/ (height * height);
        System.out.printf("Your BMI is = %.5f ", bmi);
    }


}

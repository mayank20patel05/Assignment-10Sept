package com.company;

public class MultiplesOf3And5 {
    public static void main(String[] args) {
        sumOfMultipleOf3And5(15);
    }

    public static void sumOfMultipleOf3And5(int n){
        int sum = 0;
        for (int i = 0; i <=n; i++) {
            if(i%3 == 0 || i%5 == 0){
                sum +=i;
            }
        }
        System.out.println("Sum of all elements which are multiples of 3 and 5 = " + sum);
    }
}

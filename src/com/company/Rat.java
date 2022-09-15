package com.company;

public class Rat {
    public static void main(String[] args) {
        RatWithNumbers(10);
    }
    public static void RatWithNumbers(int numberOfRows){
        for (int i = 1; i <=numberOfRows; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

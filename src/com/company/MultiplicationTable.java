package com.company;

public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable(5,5);
        printMultiplicationTableReverse(10, 5);
    }

    public static void printMultiplicationTable(int number, int terms){
        for(int i=0; i<=terms; i++){
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }
    public static void printMultiplicationTableReverse(int number, int terms){
        for(int i=10; i >=terms; i--){
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }
}

package com.company;

public class MiddleChar {
    public static void main(String[] args) {
        printMiddleChar("mayank");
        printMiddleChar("patel");
        printMiddleChar("java");
    }
    public static void printMiddleChar(String string){
        int n = string.length()/2;
        if(string.length() == 0){
            System.out.println("Empty String");
        }
        if(string.length() == 1){
            System.out.println(string);
        }
        else if (string.length() % 2 == 0){
            System.out.println(string.charAt(n-1) + "" + string.charAt(n));
        }
        else{
            System.out.println(string.charAt(n));
        }
    }
}

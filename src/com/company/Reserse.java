package com.company;

import java.util.Arrays;

public class Reserse{
    public static void main(String[] args) {
        reverseString("vaibhavi");
    }
    public static void reverseString(String s){
        char[] chars = new char[s.length()];

        for (int i = s.length()-1, j=0; i >=0; i--, j++ ) {
            chars[j] = s.charAt(i);
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}

package com.company;

import java.util.Arrays;

public class Reserse{
    public static void main(String[] args) {
        String s = "vaibhavi";
        System.out.println(Arrays.toString(toCharArr(s)));
        reverseString(s);
    }
    public static void reverseString(String s){
        for (int i = s.length()-1, j=0; i >=0; i--, j++ ) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }

    public static char[] toCharArr(String s){
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }
}

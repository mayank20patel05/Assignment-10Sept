package com.company;

public class ReplaceString {
    public static void main(String[] args) {

        System.out.println(combineStrings("java programming is better than python.", "CPP is almost similar").replace("python", "pascal"));

    }

    public static String combineStrings(String string1, String string2){
        System.out.println("The total length of an input string is: " + string1.length());
        return string1.concat(" ").concat(string2);
    }
}

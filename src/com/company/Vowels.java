package com.company;

public class Vowels {
    public static void main(String[] args) {
        countVowels("i have to learn java very hard so that i can be a master in given time frame.");
        countVowels("i am mayank");
    }

    public static void countVowels(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)== 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("total number of vowels in the provide string is: " + count);
    }
}

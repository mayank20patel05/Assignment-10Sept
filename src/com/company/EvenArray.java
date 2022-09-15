package com.company;

public class EvenArray {
    public static void main(String[] args) {

    int[] arr = {3, 2, 8, 1, 4, 7};

        System.out.println(countEvenNumbers(arr));

    }
    public static int countEvenNumbers(int[] array){
        int count = 0;
        for ( int n : array) {
            if(n%2 == 0){
                count ++;
            }
        }
        return count;
    }
}

package com.company;

public class DuplicateValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};
        findDuplicateValues(arr);
    }

    public static void findDuplicateValues(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]){
                    System.out.println("Duplicate value found: " + array[i]);
                }
            }
        }
    }

}

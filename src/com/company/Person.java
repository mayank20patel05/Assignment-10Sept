package com.company;

public class Person {
    private String firstName;
    private String lastNAme;
    private String address;
    private int age;

    public Person(String firstName, String lastNAme, String address, int age){
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.address = address;
        this.age = age;
    }

    public String getFullNAme(){
        return firstName + " " + lastNAme;
    }

    public void changeAddress(String address){
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

package com.example.practice;

public class ContactsModel {

    String name, number;
    int img;

    public ContactsModel(int img, String name, String number){

        this.img = img;
        this.name = name;
        this.number = number;
    }

    public ContactsModel(String name, String number){

        this.name = name;
        this.number = number;
    }

}

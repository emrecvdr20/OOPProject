package com.emrecavdar.oopproject;

public class User extends People{// extend olayı sadece bir sınıfı extend eder.

    //Property

    String name;
    String job;

    //Constructor

    public User(String name, String job) {
        this.name = name;
        this.job = job;

        System.out.println("User Created");
    }
}

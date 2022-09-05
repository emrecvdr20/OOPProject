package com.emrecavdar.oopproject;

public class Dog extends Animal{
    public void test(){
        super.sing();//buradaki super key i Animalden referans alıyor
    }
    public void sing(){
        System.out.println("dog class");
    }
}

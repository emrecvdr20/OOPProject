package com.emrecavdar.oopproject;

import static com.emrecavdar.oopproject.HouseDecor.roomName;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        User myUser=new User();

        myUser.name="Emre";
        myUser.job="Student";

        User newUser=new User();

        newUser.name="Büşra";
        newUser.job="Student";

         */

        User myUser= new User("Emre","Student");
        System.out.println(myUser.information());

        System.out.println(myUser);

        //Encapsulation (propertileri değiştirilmesin kardeşim)
        Musician james=new Musician("James","Guitar",50);
        System.out.println(james.getName());

        james.setAge(60,"Büşra");//Şifreyi doğru verirsen değiştirirsin
        System.out.println(james.getAge());

        //Inheritance
        SuperMusician lars=new SuperMusician("Lars","Drums",55);

        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //Polymorphism

        //Static Polymorphism

        Mat mat=new Mat();
        System.out.println(mat.sum());
        System.out.println(mat.sum(5,3));
        System.out.println(mat.sum(5,6,6));


        //Dynamic Polymorphism
        Animal myAnimal=new Animal();
        myAnimal.sing();

        Dog boncuk=new Dog();
        boncuk.test();
        boncuk.sing();

        //Abstract Methods

        Piano myPiano=new Piano();

        myPiano.brand ="yamaha";
        myPiano.digital=true;
        myPiano.info();

    }
}
package com.firstapp.polymorphism;
//import com.firstapp.polymorphism.Animal;
//import com.firstapp.polymorphism.cat;
//import com.firstapp.polymorphism.dog;

public class Myclass {



    public static void main(String[] args){

//
//        Animal MyDog1 = new dog(); // Dog dog1 = new dog(); both of the same.
//        Animal2 Mycat1 = new cat();
//
//        dog dog2 = new dog();
//        cat cat2 = new cat();
//
//        MyDog1.animaSound();
//        MyDog1.sleep();
//        Mycat1.animalSound();
//        Mycat1.sleep();
//
//        System.out.println("This is new");
//        dog2.animaSound();
//        dog2.sleep();
//        cat2.animalSound();
//        cat2.sleep();

        Shape rectangle = new Rectangle(2.3,4.2);
        Shape circle = new Circle(2,1,5.2);
        Shape triangle = new Triangle(2.2,3.1,6,1,1);

        System.out.println("The area and parameter of Rectangle");



        double rArea = rectangle.calculateArea();
        System.out.println(rArea);
        double rPar = rectangle.calculateParameter();
        System.out.println(rPar);

        System.out.println("The area and parameter of Circle");
        double cPar = circle.calculateParameter();
        double cArea = circle.calculateArea();
        System.out.println(cArea);
        System.out.println(cPar);

        System.out.println("The area and parameter of triangle");

        double tArea = triangle.calculateArea();
        double tPar = triangle.calculateParameter();
        System.out.println(tArea);
        System.out.println(tPar);




    }

    // Hiding the certain details , showing only the essential information = it can be achieved through abstract class.
    // Abstract keyword is an non-access modifier.

//    abstract class is a restricted class which can't be used to make objects. to access it we must inherit it into other class.
    // abstract method can only used in abstract class and doesn't have a body. body is proviced by subclass.

}
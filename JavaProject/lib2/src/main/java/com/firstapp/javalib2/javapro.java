package com.firstapp.javalib2;

import com.firstapp.javalib2.Car;

public class javapro {

    public static void main(String[] args){

        // Java Oops Concept.

        // A method (function) is a block of code which only runs when it is called ( functions)


//        sayHello("pradeep",20);
//        sayHello("Surbhi",19);
//        sayHello("Soyam",19);
//
//        int c = addition(20,19);
//        System.out.println(c);
//
//        double z = addition(2.333, 6.2222);
//        System.out.println(z);

        // creating objects;

        Car c1 = new Car("black",2025);
//        c1.modelYear = 2025;
//        c1.color = "blue";
//        System.out.println(c1.color);
//        System.out.println(c1.modelYear);
        c1.setColor("Purple");
        c1.setModelYear(2100);
        System.out.println(c1.getModelYear());
        System.out.println(c1.getColor());
        c1.drive();

        Car.sayHellow();
//        c1.PI = 6.7; can't override final variable.


        // Access modifiers :
        /* for classes : public or default (private)
        default means class is only accessible by the classes in the same package.(within the same package - folder) ( we don't specify modifier)
        */

        /*
        for attributes, methods and constructors : public, private , default , protected ( accessible in same package and sub-classes)
         */


        /*
        Non - Access Modifiers :

        for classes : final and abstract , final ( can't be inherited) or abstract (can't used to make objects) used only for inheritance
        for attributes, methods : final, static, abstract, transient, synchronized, volatile : final ( can't be modified), static ( belong to the class rather than object)
        abstract (can't only be used in abstract class and can only be used with methods - method doesn't have body)
        transient,(attributes and methods are skipped......)
        synchronized,(mehtods can only be accessed by one thread at a time)
        volatile ( don't catch memory and call the function from main)


         */

        // Encapsulation.       sensitive data is data from users.

        // - declare class variables/attributes as private
        // provide public get and set methods to access
        // and update the value of a private variable





    }

    public static void sayHello(String name, int age){ // we need to declare it static in order to call it from the static void main
        System.out.println("hello "+name+" age is : "+age);
    }

    public static int addition(int x , int y){
        return x+y;
    }

    public static double addition(double x, double y){
        return x+y;
    }



}
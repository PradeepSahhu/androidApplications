package com.firstapp.polymorphism;

// This is Base Class Animal.
//public class Animal {

// Abstract Class.
abstract class Animal {


//    public void animaSound(){
//        System.out.println("The animal makes a sound");
//    }
    // Abstraction , (abstract method).
    public abstract void animaSound(); // Things which are different in every instances we made them abstract.

    // Non abstract Method.
    public void sleep(){
        System.out.println("ZZZ");
    }

}

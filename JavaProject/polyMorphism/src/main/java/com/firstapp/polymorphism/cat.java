package com.firstapp.polymorphism;


// This is inherited class from Animal.
public class cat implements Animal2{


    @Override
    public void animalSound() {
        System.out.println("The cat is meowing");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZ");
    }
}

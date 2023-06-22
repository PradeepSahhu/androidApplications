package com.firstapp.javalib2;

// here car is the child class of parent class vehicle.
public class Car extends Vehicle {

    // Attributes
    private int modelYear = 2020;
   private String color = "red";

//    public final double PI = 3.14;

    // Getter. - to get the value of private variables.
    public int getModelYear(){
    return modelYear;
    }
    //control + return.

    public String getColor() {
        return color;
    }

    //Setters - to set the value of private variables.
    public void setModelYear(int year){
        this.modelYear = year;
    }
    public void setColor(String color){
        this.color = color;
    }

    // Constructor

    public Car(String color, int modelYear){
        this.color = color;
        this.modelYear = modelYear;
    }
    // methods
    public void drive(){
        System.out.println("This car can Drive");

    }
    static void sayHellow(){
        System.out.println("Saying hello to pradeep");
    }
}

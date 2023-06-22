package com.firstapp.polymorphism;

public class Circle implements Shape {

    int x;
    int y;
    double radius;

    public Circle(int x, int y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        return (Math.PI * radius * radius);
    }

    @Override
    public double calculateParameter() {

        return (2 * Math.PI * radius);
    }
}


package com.firstapp.polymorphism;

public class Rectangle implements Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }



    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public double calculateParameter() {
        return 2*(width+height);
    }
}

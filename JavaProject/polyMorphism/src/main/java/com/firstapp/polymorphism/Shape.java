package com.firstapp.polymorphism;

public interface Shape {

    // Inheritance class : code sharing is not useful in this case,
    // because each class implements its behavior differently.


    // Shape            Area                          Perimenter
    // Circle :        pie * r * r                    2 * pie * R
    // Rectangle :     L * W                          (w + l) * 2
    // Triangle :      (h*b)/2                        a + b + c

    public double calculateArea();
    public double calculateParameter();

}

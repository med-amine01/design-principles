package com.chebbi.tech;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 4);
        Shape square = new Square(3);

        System.out.println("Area of rectangle: " + calculateArea(rectangle));
        System.out.println("Area of square: " + calculateArea(square));
    }

    public static double calculateArea(Shape shape) {
        return shape.computeArea();
    }
}

package ru.mirea.task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing class Circle");
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimeter = " + c1.getPerimeter());
        System.out.println("Color = " + c1.getColor());
        System.out.println("Filled = " + c1.isFilled());
        System.out.println("Radius = " + c1.getRadius());


    }
}

package ru.mirea.task3;

public class Circle {
    private String color;
    private boolean filled;
    private double radius;

    public Circle() {
        filled = false;
        color = "blue";
        radius = 1;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle {radius = " + this.radius + ", color = " + this.color + "}";
    }
}
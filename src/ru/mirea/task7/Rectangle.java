package ru.mirea.task7;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle() {
        this.filled = false;
        this.color = "blue";
        width = 1;
        length = 1;
    }
    public Rectangle(double width, double length) {
        this.filled = false;
        this.color = "blue";
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double height) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
    @Override
    public String toString() {
        return "Shape: circle, length: " + this.length + ", width:" + this.width + ", color: " + this.color;
    }
}
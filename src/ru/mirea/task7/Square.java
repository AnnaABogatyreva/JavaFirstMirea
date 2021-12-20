package ru.mirea.task7;

public class Square extends Shape {
    protected double side;
    public Square() {
        this.filled = false;
        this.color = "blue";
        side = 1;
    }
    public Square(double side) {
        this.filled = false;
        this.color = "blue";
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side) {
        this.side = side;
    }
    public void setLength(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
    @Override
    public double getPerimeter() {
        return 4 * side;
    }
    @Override
    public String toString() {
        return "Shape: circle, side: " + this.side + ", color: " + this.color;
    }
}

package ru.mirea.task4;

public class Ball {
    private double x, y;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    public String toString() {
        return "Ball: x = " + x + ", y = " + y;
    }
}

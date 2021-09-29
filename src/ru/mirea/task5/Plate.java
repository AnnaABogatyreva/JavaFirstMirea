package ru.mirea.task5;

public class Plate extends Dish {
    protected double radius;

    public Plate(String material, double radius) {
        this.material = material;
        this.radius = radius;
    }

    public Plate() {
        this.material = "wood";
        this.radius = 10.0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "material='" + material + '\'' +
                ", radius='" + radius + '\'' +
                '}';
    }
}

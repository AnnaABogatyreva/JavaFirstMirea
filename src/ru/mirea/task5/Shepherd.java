package ru.mirea.task5;

public class Shepherd extends Dog {
    protected int color;
    protected double size;

    public Shepherd(String name, int color, double size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public Shepherd() {
        name = "Jack";
        color = 0;
        size = 5;
    }

    public double getSize() {
        return size;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shepherd{" +
                "name=" + name +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}

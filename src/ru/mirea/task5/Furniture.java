package ru.mirea.task5;

public abstract class Furniture {
    protected int size;
    protected int color;

    public int getSize() {
        return size;
    }

    public int getColor() {
        return color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(int color) {
        this.color = color;
    }

    abstract public String toString();
}

package ru.mirea.task3;

public class Leg {
    private int size;

    public Leg() {
        size = 37;
    }

    public Leg(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "size=" + size +
                '}';
    }
}

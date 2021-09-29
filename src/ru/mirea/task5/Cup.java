package ru.mirea.task5;

public class Cup extends Dish {
    protected double volume;

    public Cup(String material, double volume) {
        this.material = material;
        this.volume = volume;
    }

    public Cup() {
        this.material = "wood";
        this.volume = 0.3;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "material=" + material +
                ", volume=" + volume +
                '}';
    }
}

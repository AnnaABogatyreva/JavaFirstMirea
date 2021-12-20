package ru.mirea.task25.NeNaMeli.src.base.decorator;

public class Fee implements Service{
    private double price;

    public Fee(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

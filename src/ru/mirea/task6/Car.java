package ru.mirea.task6;

public class Car implements Nameable, Priceable {
    protected String name;
    protected int price;

    public Car() {
        name = "CarName";
        price = 100;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

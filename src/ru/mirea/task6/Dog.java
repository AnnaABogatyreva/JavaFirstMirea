package ru.mirea.task6;

public class Dog implements Nameable, Priceable {
    protected String name;
    protected int price;

    public Dog() {
        name = "DogName";
        price = 10;
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

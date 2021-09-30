package ru.mirea.task6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing interface Nameable");
        Nameable nc = new Car();
        System.out.println(nc.getName());
        Nameable nd = new Dog();
        System.out.println(nd.getName());

        System.out.println("Testing interface Priceable");
        Priceable pc = new Car();
        System.out.println(pc.getPrice());
        Priceable pd = new Dog();
        System.out.println(pd.getPrice());
    }
}

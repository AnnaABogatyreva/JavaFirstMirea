package ru.mirea.task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing class Circle");
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimeter = " + c1.getPerimeter());
        System.out.println("Color = " + c1.getColor());
        System.out.println("Filled = " + c1.isFilled());
        System.out.println("Radius = " + c1.getRadius());

        System.out.println("Testing class Human");
        Human human = new Human();
        System.out.println(human);

        System.out.println("Testing class Book");
        Book b1 = new Book("", "Lev Tolstoy", 1869);
        Book b2 = new Book("Oblomov", "Ivan Goncharov");
        Book b3 = new Book("Fathers and Sons");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b1.setName("War and Peace");
        b2.setPublishingYear(1857);
        b3.setAuthor("Ivan Turgenev");
        b3.setPublishingYear(1861);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
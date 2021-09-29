package ru.mirea.task5;

import ru.mirea.task4.Author;
import ru.mirea.task4.Ball;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing abstract class Dish");
        Plate p = new Plate();
        p.setMaterial("wood");
        System.out.println(p);
        Cup c = new Cup();
        c.setMaterial("glass");
        System.out.println(c);

        System.out.println("Testing abstract class Dog");
        Shepherd s = new Shepherd();
        s.setSize(12.0);
        System.out.println(s);

        System.out.println("Testing abstract class Furniture");
        Sofa q = new Sofa();
        q.setMaterial(13);
        System.out.println(q);
        Stool w = new Stool();
        System.out.println(w);
    }
}

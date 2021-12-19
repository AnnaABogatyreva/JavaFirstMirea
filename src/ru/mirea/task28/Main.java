package ru.mirea.task28;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        ArrayList<Car> v = new ArrayList<>();
        v.add(new Car("Tesla S", "green", 250, 18));
        v.add(new Car("Tesla S", "red", 250, 18));
        v.add(new Car("Lada 2107", "white", 65, 13));
        v.add(new Car("Tesla T", "silver", 290, 18));
        v.add(new Car("Lada Granta", "black", 106, 14));
        v.add(new Car("Lada Samara", "silver", 75, 13));
        v.add(new Car("Tesla T", "purple", 290, 18));
        v.add(new Car("Lada Granta", "blue", 106, 14));
        v.add(new Car("Tesla Q", "gold", 350, 19));
        v.add(new Car("Tesla A", "gray", 100, 15));

        // сортировка по модели с помощью анонимного класса
        v.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().compareTo(o2.getModel());
            }
        });
        System.out.println("Отсортировано по модели");
        for (Car car : v)
            System.out.println(car);

        // сортировка по мощности
        v.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.getPower(), o2.getPower());
            }
        });
        System.out.println("Отсортировано по мощности двигателя");
        for (Car car : v)
            System.out.println(car);

        // сортировка по цвету
        v.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        });
        System.out.println("Отсортировано по цвету");
        for (Car car : v)
            System.out.println(car);


    }
}

package ru.mirea.task30;


import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // write your code here
        ShowRoom room = new ShowRoom();
        room.add(new Car("Tesla S", "green", 250, 18));
        room.add(new Car("Tesla S", "red", 250, 18));
        room.add(new Car("Lada 2107", "white", 65, 13));
        room.add(new Car("Tesla T", "silver", 290, 18));
        room.add(new Car("Lada Granta", "black", 106, 14));
        room.add(new Car("Lada Samara", "silver", 75, 13));
        room.add(new Car("Tesla T", "purple", 290, 18));
        room.add(new Car("Lada Granta", "blue", 106, 14));
        room.add(new Car("Tesla Q", "gold", 350, 19));
        room.add(new Car("Tesla A", "gray", 100, 15));

        // отобразим все
        room.PrintInfo("Все автомобили:");
        System.out.println("Цвета: " + room.getColors());

        // выберем все автомобили серебристого цвета
        ShowRoom roomSilver = room.getByColor("silver");
        roomSilver.PrintInfo("Серебристые автомобили:");
        System.out.println("Цвета: " + roomSilver.getColors());


        // выберем автомобили с мощностью меньше 100 лошадиных сил
        ShowRoom roomLow = room.getPowerLessThen(100);
        roomLow.PrintInfo("Маломощные автомобили:");
        System.out.println("Цвета: " + roomLow.getColors());

        // выберем автомобили с мощностью больше 250 лошадиных сил
        ShowRoom roomHi = room.getPowerMoreThen(250);
        roomHi.PrintInfo("Мощные автомобили:");
        System.out.println("Цвета: " + roomHi.getColors());

    }
}

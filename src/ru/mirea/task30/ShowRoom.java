package ru.mirea.task30;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ShowRoom {
    private ArrayList<Car> room;

    public ShowRoom() {
        room = new ArrayList<>();
    }

    public void add(Car car) {
        room.add(car);
    }

    public int size() {
        return room.size();
    }

    public ArrayList<Car> getList() {
        return room;
    }

    public void PrintInfo(String title) {
        System.out.println(title);
        for (Car car : room)
            System.out.println(car);
        //System.out.println("");
    }

    public ShowRoom getByColor(String color) {
        ShowRoom r2 = new ShowRoom();
        for (Car car : room) {
            if (car.getColor().compareTo(color) == 0)
                r2.add(car);
        }
        return r2;
    }

    public ShowRoom getPowerMoreThen(int minPower) {
        ShowRoom r2 = new ShowRoom();
        for (Car car : room) {
            if (car.getPower() > minPower)
                r2.add(car);
        }
        return r2;
    }

    public ShowRoom getPowerLessThen(int maxPower) {
        ShowRoom r2 = new ShowRoom();
        for (Car car : room) {
            if (car.getPower() < maxPower)
                r2.add(car);
        }
        return r2;
    }

    public String getColors() {
        TreeSet<String> carColors = new TreeSet<>();
        for (Car car : room) {
            String color = car.getColor();
            if (!carColors.contains(color))
                carColors.add(color);
        }
        return carColors.toString();
    }

}

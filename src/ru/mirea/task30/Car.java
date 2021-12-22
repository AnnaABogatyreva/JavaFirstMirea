package ru.mirea.task30;

import java.util.ArrayList;

public class Car {
    private String model;
    private String color;
    private Engine engine;
    private ArrayList<Wheel> wheels;

    public Car(String model, String color, int power, int radius) {
        this.model = model;
        this.color = color;
        this.engine = new Engine(power);
        this.wheels = new ArrayList<>();
        for (int i = 0; i < 4; i++)
            this.wheels.add(new Wheel(radius));
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getPower() {
        return this.engine.getPower();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("model \"" + this.model + "\", ");
        sb.append("color \"" + this.color + "\", ");
        sb.append("engine " + this.engine.getPower() + "hp, ");
        sb.append("wheels (");
        for (int i = 0; i < wheels.size(); i++) {
            if (i != 0) sb.append(", ");
            sb.append(wheels.get(i).getRadius());
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof Car))
            return false;
        Car c = (Car)o;
        return (model.compareTo(c.model) == 0)
                && (color.compareTo(c.color) == 0)
                && (getPower() == c.getPower());
    }

    // внутренний класс для двигателя
    private class Engine {
        private int power; // мощность
        public Engine(int power) { this.power = power; }
        public int getPower() { return this.power; }
    }

    // внутренний класс для колеса
    private class Wheel {
        private int radius; // радиус колеса
        public Wheel(int radius) { this.radius = radius; }
        public int getRadius() { return this.radius; }
    }
}

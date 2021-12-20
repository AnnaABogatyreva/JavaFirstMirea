package ru.mirea.task3;

public class Human {
    Leg legLeft, legRight;
    Hand handLeft, handRight;
    Head head;

    public Human() {
        legLeft = new Leg();
        legRight = new Leg();
        handLeft = new Hand();
        handRight = new Hand();
        head = new Head();
    }

    @Override
    public String toString() {
        return "Human{" +
                "legLeft=" + legLeft +
                ", legRight=" + legRight +
                ", handLeft=" + handLeft +
                ", handRight=" + handRight +
                ", head=" + head +
                '}';
    }
}

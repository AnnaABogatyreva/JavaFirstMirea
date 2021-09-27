package ru.mirea.task3;

public class Hand {
    private int numFingers;

    public Hand() {
        int numFingers = 5;
    }

    public Hand(int numFingers) {
        this.numFingers = numFingers;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "numFingers=" + numFingers +
                '}';
    }
}

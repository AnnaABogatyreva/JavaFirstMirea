package ru.mirea.task14;

public class Card implements Comparable<Card> {
    private int value;
    public static int nCards = 10; // кол-во карт

    public Card(int value) {
        this.value = value;
    }

    public Card(String value) {
        this.value = Integer.parseInt(value);
    }

    @Override
    public int compareTo(Card o) {
        int c = 0;
        if (this.value == 0 && o.value == (nCards-1))
            c = 1;
        else if (this.value == (nCards-1) && o.value == 0)
            c = -1;
        else
            c = Integer.compare(this.value, o.value);
        return c;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    int getValue() {
        return value;
    }
}
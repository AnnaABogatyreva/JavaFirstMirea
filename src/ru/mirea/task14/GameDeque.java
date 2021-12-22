package ru.mirea.task14;

import java.util.ArrayDeque;
import java.util.Deque;

public class GameDeque implements Game {
    private Deque<Card> cards; // карты игрока

    public GameDeque() {
        cards = new ArrayDeque<>();
    }

    @Override
    public void toHands(String sCards) {
        String[] v = sCards.split(" ");
        for (String s : v)
            cards.addLast(new Card(s));
    }

    @Override
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    @Override
    public Card getNextCard() {
        return cards.pollFirst();
    }

    @Override
    public void Graft(Card card1, Card card2) {
        cards.addLast(card1);
        cards.addLast(card2);
    }

    @Override
    public String toString() {
        return cards.toString();
    }

    @Override
    public int sumCards() {
        int sum = 0;
        for (Card card : cards)
            sum += card.getValue();
        return sum;

    }
}

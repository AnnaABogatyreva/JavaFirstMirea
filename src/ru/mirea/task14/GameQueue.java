package ru.mirea.task14;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class GameQueue implements Game {
    private Queue<Card> cards; // карты игрока

    public GameQueue() {
        cards = new ArrayBlockingQueue<>(Card.nCards);
    }

    @Override
    public void toHands(String sCards) {
        String[] v = sCards.split(" ");
        for (String s : v)
            cards.add(new Card(s));
    }

    @Override
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    @Override
    public Card getNextCard() {
        return cards.remove();
    }

    @Override
    public void Graft(Card card1, Card card2) {
        cards.add(card1);
        cards.add(card2);
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
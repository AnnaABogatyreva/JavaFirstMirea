package ru.mirea.task14;

import java.util.Stack;

public class GameStack implements Game {
    private Stack<Card> cards; // карты игрока

    public GameStack() {
        cards = new Stack<>();
    }

    @Override
    public void toHands(String sCards) { // раздача карт
        String[] v = sCards.split(" ");
        for (int i = v.length - 1; i >= 0; i--)
            cards.push(new Card(v[i]));
    }

    @Override
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    @Override
    public Card getNextCard() {
        return cards.pop();
    }

    @Override
    public void Graft(Card card1, Card card2) {
        Stack<Card> t = new Stack<>();
        while (!cards.isEmpty())
            t.push(cards.pop());
        t.push(card1);
        t.push(card2);
        while (!t.isEmpty())
            cards.push(t.pop());
    }

    @Override
    public String toString() {
        Stack<Card> t = new Stack<>();
        while (!cards.isEmpty())
            t.push(cards.pop());
        String s = t.toString();
        while (!t.isEmpty())
            cards.push(t.pop());
        return s;
    }

    @Override
    public int sumCards() {
        int sum = 0;
        for (Card card : cards)
            sum += card.getValue();
        return sum;
    }
}

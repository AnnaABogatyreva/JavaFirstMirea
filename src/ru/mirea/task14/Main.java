package ru.mirea.task14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        int nWork = 5; // номер упражнения: 1, 2, 3, 4, 5. !!!

        if (nWork == 5) {
            work5();
            return;
        }

        // игроки
        Game first, second;
        switch (nWork) {
            case 1: // Stack
                first = new GameStack();
                second = new GameStack();
                break;
            case 2: // Queue
                first = new GameQueue();
                second = new GameQueue();
                break;
            case 3: // Deque
                first = new GameDeque();
                second = new GameDeque();
                break;
            case 4: // DoubleList
                first = new GameList();
                second = new GameList();
                break;
            default: // неверный номер упражнения
                throw new Exception("Invalid nWork value: " + nWork);
        }

        // перетасуем колоду карт
        /* ArrayList<Card> cards = new ArrayList<>(Card.nCards);
        for (int  i = 0; i < Card.nCards; i++)
            cards.add(new Card(i));
        Collections.shuffle(cards);
        log("before: " + cards);
        // раздадим карты
        StringBuilder sc1 = new StringBuilder(), sc2 = new StringBuilder();
        for (int i = 0; i < Card.nCards; i += 2) {
            sc1.append((i == 0 ? "" : " ") + cards.get(i).toString());
            sc2.append((i == 0 ? "" : " ") + cards.get(i+1).toString());
        }
        first.toHands(sc1.toString());
        second.toHands(sc2.toString());  */
        //Card.nCards = 4;
        //first.toHands("1 2");
        //second.toHands("3 0");
        //first.toHands("1 3 5 7 9");
        //second.toHands("2 4 6 8 0");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Карты first: ");
        first.toHands(br.readLine());
        System.out.print("Карты second: ");
        second.toHands(br.readLine());


        // игра
        int i = 1;
        for (; i <= 106; i++) { // макс 106 ходов
            log("step " + i);
            log("first: " + first);
            log("second: " + second);
            Card card1 = first.getNextCard();
            Card card2 = second.getNextCard();
            if (card1.compareTo(card2) > 0) // ход выиграл first
                first.Graft(card1, card2);
            else // ход выиграл second
                second.Graft(card1, card2);
            if (first.isEmpty() || second.isEmpty())
                break;
        }

        // результат
        log("finish");
        log("first: " + first);
        log("second: " + second);
        String result;
        if (second.isEmpty()) result = "first " + i /* + " " + first.sumCards() */;
        else if (first.isEmpty()) result = "second " + i /* + " " + second.sumCards()*/;
        else result = "botva";
        System.out.println(result);
    }

    public static void work5() throws IOException { // интерактивный режим задания 1
        Game first = new GameStack();
        Game second = new GameStack();

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Карты first: ");
        first.toHands(br.readLine());
        System.out.print("Карты second: ");
        second.toHands(br.readLine());
        //first.toHands("1 3 5 7 9");
        //second.toHands("2 4 6 8 0");
        */
        // перетасуем колоду карт
        ArrayList<Card> cards = new ArrayList<>(Card.nCards);
        for (int  i = 0; i < Card.nCards; i++)
            cards.add(new Card(i));
        Collections.shuffle(cards);
        log("before: " + cards);
        // раздадим карты
        StringBuilder sc1 = new StringBuilder(), sc2 = new StringBuilder();
        for (int i = 0; i < Card.nCards; i += 2) {
            sc1.append((i == 0 ? "" : " ") + cards.get(i).toString());
            sc2.append((i == 0 ? "" : " ") + cards.get(i+1).toString());
        }
        first.toHands(sc1.toString());
        second.toHands(sc2.toString());

        // игра
        int i = 1;
        for (; i <= 106; i++) { // макс 106 ходов
            log("step " + i);
            System.out.println("You cards: " + first);
            log("second cards: " + second);
            System.out.println("Нажмите Enter чтобы сделать ход " + i);
            System.in.read();
            Card card1 = first.getNextCard();
            Card card2 = second.getNextCard();
            if (card1.compareTo(card2) > 0) { // ход выиграл first
                first.Graft(card1, card2);
                System.out.println("You grafts!");
            }
            else { // ход выиграл second
                second.Graft(card1, card2);
                System.out.println("second grafts!");
            }
            if (first.isEmpty() || second.isEmpty())
                break;
        }

        // результат
        log("finish");
        log("first: " + first);
        log("second: " + second);
        String result;
        if (second.isEmpty()) result = "You win!";
        else if (first.isEmpty()) result = "second win";
        else result = "botva";
        System.out.println(result);
    }

    public static void log(String s) { // отладочный вывод
        //System.out.println(s);
    }
}

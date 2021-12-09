package ru.mirea.task14;

// общий интерфейс для упражнений
public interface Game {
    void toHands(String sCards); // раздача карт
    boolean isEmpty(); // есть ли карты на руках
    Card getNextCard(); // извлечение верхней карты
    void Graft(Card card1, Card card2); // взять выигранные карты
    String toString(); // преобразование карт в строку
    int sumCards(); // сумма всех карт игрока
}
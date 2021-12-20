package ru.mirea.task26.NeNaMeli.src.base.strategy;

public class ThanksStrategy implements NotifyStrategy{
    @Override
    public void sendNotify() {
        System.out.println("Спасибо за пользование нашим банком!");
        System.out.println();
    }
}

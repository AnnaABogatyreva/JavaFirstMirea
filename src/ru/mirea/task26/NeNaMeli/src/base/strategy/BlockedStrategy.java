package ru.mirea.task26.NeNaMeli.src.base.strategy;

public class BlockedStrategy implements NotifyStrategy{
    @Override
    public void sendNotify() {
        System.out.println("Ваш аккаунт заблокирован! " +
                "Обратитесь в ближайшее отделение банка!");
    }
}

package ru.mirea.task26.NeNaMeli.src.base.decorator;

public class SendDebitMoney extends SendDecorator{

    public SendDebitMoney(Service service) {
        super(service, 1);
    }
}

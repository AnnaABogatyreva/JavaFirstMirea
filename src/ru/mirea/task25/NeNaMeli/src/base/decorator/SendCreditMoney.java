package ru.mirea.task25.NeNaMeli.src.base.decorator;

public class SendCreditMoney extends SendDecorator{

    public SendCreditMoney(Service service) {
        super(service, 5);
    }
}

package ru.mirea.task25.NeNaMeli.src.base.decorator;

public class SendMoney extends SendDecorator{
    public SendMoney(Service service) {
        super(service, 1);
    }
}

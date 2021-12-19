package ru.mirea.task25.NeNaMeli.src.base.decorator;

public class SendDecorator implements Service{
    private Service service;
    private double price;

    public SendDecorator(Service service, double price) {
        this.service = service;
        this.price = price;
    }

    public double getPrice() {
        return this.price + service.getPrice();
    }
}

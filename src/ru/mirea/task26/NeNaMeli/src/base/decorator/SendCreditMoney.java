package base.decorator;

public class SendCreditMoney extends SendDecorator{

    public SendCreditMoney(Service service) {
        super(service, 5);
    }
}

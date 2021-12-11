package base.strategy;

public class ThanksStrategy implements NotifyStrategy{
    @Override
    public void sendNotify() {
        System.out.println("Спасибо за пользование нашим банком!");
        System.out.println();
    }
}

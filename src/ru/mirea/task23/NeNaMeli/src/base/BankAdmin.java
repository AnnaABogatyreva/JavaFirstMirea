package base;

import java.util.List;
import java.util.Scanner;

public class BankAdmin implements User{
    private int log;
    private AdminAPI userAPI;

    public BankAdmin(AdminAPI userAPI) {
        this.userAPI = userAPI;
        if (!verifyAccount())
            return;
    }

    @Override
    public boolean verifyAccount(){
        System.out.println("Введите логин: ");
        Scanner s = new Scanner(System.in);
        String login = s.nextLine();
        System.out.println("Введите пароль: ");
        String pass = s.nextLine();
        log = login.hashCode();
        return userAPI.checkCredentials(login.hashCode(), pass.hashCode());
    }

    public void sendPrizes(int value){
        userAPI.sendPrizes(value);
    }
}

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
        System.out.println("Введите логин администратора: ");
        Scanner s = new Scanner(System.in);
        String login = s.nextLine();
        System.out.println("Введите пароль администратора: ");
        String pass = s.nextLine();
        while (!pass.matches("^[a-zA-Z0-9_]+$")){
            System.out.println("Пароль такого типа не допустим!");
        }
        
        log = login.hashCode();
        return userAPI.checkCredentials(login.hashCode(), pass.hashCode());
    }

    public void sendPrizes(int value){
        userAPI.sendPrizes(value);
    }
}

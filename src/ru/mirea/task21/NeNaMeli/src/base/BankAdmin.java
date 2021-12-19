package ru.mirea.task21.NeNaMeli.src.base;

import java.util.List;
import java.util.Scanner;

public class BankAdmin {
    private int log;
    private AdminAPI userAPI;

    public BankAdmin(AdminAPI userAPI) {
        if (!verifyAccount())
            return;

        this.userAPI = userAPI;
    }

    boolean verifyAccount(){
        System.out.println("Введите логин: ");
        Scanner s = new Scanner(System.in);
        String login = s.nextLine();
        System.out.println("Введите пароль: ");
        String pass = s.nextLine();
        log = login.hashCode();
        return userAPI.checkCredentials(login.hashCode(), pass.hashCode());
    }

    void sendPrizes(int value){
        userAPI.sendPrizes(value);
    }
}

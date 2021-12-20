package ru.mirea.task23.NeNaMeli.src.base;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        AdminAPI adminAPI = new AdminAPI(dataBase, new Date(2021, 12, 10));
        UserAPI userAPI = new UserAPI(dataBase);
        UserFactory uf = new UserFactory(userAPI, adminAPI);

        BankAdmin bankAdmin = (BankAdmin) uf.getUser("Admin");
        BankUser user1 = (BankUser) uf.getUser("User");
        BankUser user2 = (BankUser) uf.getUser("User");

        Account a1 = ((BankUser) user1).createAccount();
        ((BankUser) user1).addMoney(10, a1);


        ((BankAdmin) bankAdmin).sendPrizes(5);

        System.out.println(dataBase.getOpenedAccounts().get(user1).get(0).getAmount());
    }
}

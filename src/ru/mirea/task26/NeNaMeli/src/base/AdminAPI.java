package ru.mirea.task26.NeNaMeli.src.base;

import ru.mirea.task26.NeNaMeli.src.base.strategy.BlockedStrategy;
import ru.mirea.task26.NeNaMeli.src.base.strategy.ThanksStrategy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AdminAPI {
    private DataBase db;
    private List<String> history = new ArrayList<>();

    boolean checkCredentials(int login, int password){
        return db.credentialsExist(login, password);
    }

    void openAdminAccount(BankAdmin toOpen){
        db.addAdmin(toOpen);
    }


    public AdminAPI(DataBase db, List<String> history, Date login) {
        this.db = db;
        this.history = history;
        history.add("login at: " + login);
    }

    public AdminAPI(DataBase db, Date login) {
        this.db = db;
        history = new ArrayList<>();
        history.add("login at: " + login);
    }

    public List<String> getHistory() {
        return history;
    }

    public void notifyUser(BankUser toNotify, String notification){
        System.out.println("Какое оповещение? 0 - блок, 1 - благодарность");
        int i = Integer.parseInt(new Scanner(System.in).nextLine());
        toNotify.notifyStrategy = (i == 0) ? new BlockedStrategy() : new ThanksStrategy();
        history.add("notified " + toNotify + ", msg: " + notification);
    }

    public List<Account> getUserAccounts(BankUser user) throws NoSuchUserException {
        if (user == null)
            throw new NoSuchUserException();
        List<Account> accs = db.getOpenedAccounts().get(user);
        if (accs == null)
            throw new NoSuchUserException();

        history.add("Список аккаунтов " + user +" был запрошен. Время: " +
                LocalDateTime.now());
        return db.getOpenedAccounts().get(user);
    }

    public void sendPrizes(double value){
        for(List<Account> a : db.getOpenedAccounts().values()){
            for (Account t : a){
                Double v = new Money<>(value).generatePrize();
                t.setAmount(t.getAmount() + (v == null ? 0 : v));
            }
        }
    }
}

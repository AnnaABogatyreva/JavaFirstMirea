package ru.mirea.task25.NeNaMeli.src.base;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    private void notifyUser(BankUser toNotify, String notification){
        toNotify.notify = notification;
        history.add("notified " + toNotify + ", msg: " + notification);
    }

    private List<Account> getUserAccounts(BankUser user) throws NoSuchUserException {
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

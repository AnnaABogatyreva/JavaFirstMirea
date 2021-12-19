package ru.mirea.task20.NeNaMeli.src.base;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminAPI {
    private DataBase db;
    private List<String> history = new ArrayList<>();
    private Date login;

    public AdminAPI(DataBase db, List<String> history, Date login) {
        this.db = db;
        this.history = history;
        this.login = login;
        history.add("login at: " + login);
    }

    public AdminAPI(DataBase db, Date login) {
        this.db = db;
        this.login = login;
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
}

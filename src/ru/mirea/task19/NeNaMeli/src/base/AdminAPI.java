package ru.mirea.task19.NeNaMeli.src.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminAPI {
    DataBase db;
    List<String> history = new ArrayList<>();
    Date login;

    public AdminAPI(DataBase db, List<String> history, Date login) {
        this.db = db;
        this.history = history;
        this.login = login;
    }

    public AdminAPI(DataBase db, Date login) {
        this.db = db;
        this.login = login;
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
        
        return db.getOpenedAccounts().get(user);
    }
}

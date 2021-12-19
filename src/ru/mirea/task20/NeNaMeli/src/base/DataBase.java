package ru.mirea.task20.NeNaMeli.src.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
    private Map<Integer, Integer> loginAndPass = new HashMap();
    private Map<BankUser, List<Account>> openedAccounts = new HashMap<>();
    public int status;

    public Map<Integer, Integer> getLoginAndPass() {
        return loginAndPass;
    }

    public void removePass(int login) {
        loginAndPass.remove(login);
    }

    public boolean credentialsExist(int login, int pass) {
        return loginAndPass.containsKey(login) && loginAndPass.containsValue(pass);
    }

    public void addLoginAndPass(int login, int pass) {
        loginAndPass.put(login, pass);
    }

    public Map<BankUser, List<Account>> getOpenedAccounts() {
        return openedAccounts;
    }

    public void addOpenedAccount(BankUser user, Account account) {
        List<Account> userA = openedAccounts.get(user);
        if (userA == null) {
            List<Account> l = new ArrayList<>();
            l.add(account);
            openedAccounts.put(user, l);
        } else
            openedAccounts.get(user).add(account);
    }
}

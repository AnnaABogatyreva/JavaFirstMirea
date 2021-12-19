package ru.mirea.task20.NeNaMeli.src.base;

public class Main {

    public static void main(String[] args) {
        DataBase db = new DataBase();
        UserAPI ua = new UserAPI(db);
        BankUser bu = new BankUser(ua);
        bu.sendMoney(-1, null, null);
    }
}

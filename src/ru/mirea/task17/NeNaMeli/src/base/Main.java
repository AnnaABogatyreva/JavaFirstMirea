package ru.mirea.task17.NeNaMeli.src.base;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(AccountType.DEPOSIT, new BankUser(), 20);
        System.out.println("Тип банковского аккаунта: " + account.getType());
    }
}

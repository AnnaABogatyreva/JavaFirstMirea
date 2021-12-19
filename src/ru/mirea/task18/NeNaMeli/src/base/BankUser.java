package ru.mirea.task18.NeNaMeli.src.base;

import java.util.List;
import java.util.Scanner;

public class BankUser {
    String name;
    List<Account> accountList;
    UserAPI userAPI;

    BankUser(UserAPI ua){
        this.userAPI = ua;
    }

    void createAccount(){
        System.out.println("Введите тип аккаунта: 0 - депозит, 1 - кредит");
        Scanner s = new Scanner(System.in);
        int i = Integer.parseInt(s.nextLine());
        Account newOne = new Account(i != 0 ? AccountType.CREDIT :
                AccountType.DEPOSIT, this);
        userAPI.openAccount(newOne, this);
    }

    boolean verifyAccount(){
        System.out.println("Введите логин: ");
        Scanner s = new Scanner(System.in);
        String login = s.nextLine();
        System.out.println("Введите пароль: ");
        String pass = s.nextLine();
        return userAPI.checkCredentials(login.hashCode(), pass.hashCode());
    }

    void sendMoney(double amount, Account start, Account goal){
        try {
            if (start.getAmount() < amount){
                System.out.println("Слишком мало денег на счету!");
                return;
            }
            if (amount < 0){
                System.out.println("Не можете передать такое количество денег!");
                return;
            }
            goal.setAmount(goal.getAmount() + amount);
            start.setAmount(start.getAmount() - amount);
        } catch (NullPointerException npe){
            System.out.println("Такой аккаунт не существует!");
        }
    }





}

package ru.mirea.task23.NeNaMeli.src.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankUser implements User {
    int log;
    private List<Account> accountList;
    private UserAPI userAPI;
    public String notify;

    BankUser(UserAPI ua) {
        this.userAPI = ua;
        this.accountList = userAPI.dataBase.getOpenedAccounts().get(this);
        createProfile();
    }

    public void createProfile(){
        System.out.println("Введите логин: ");
        Scanner s = new Scanner(System.in);
        String login = s.nextLine();
        System.out.println("Введите пароль: ");
        String pass = s.nextLine();
        if (userAPI.dataBase.credentialsExist(login.hashCode(), pass.hashCode()))
            if (userAPI.checkCredentials(login.hashCode(), pass.hashCode())){
                System.out.println("Вы успешно зашли в систему!");
            } else {
                System.out.println("Введенные данные не верны!");
            }
        else userAPI.addProfile(login.hashCode(), pass.hashCode());
    }

    public Account createAccount() {
        System.out.println("Введите тип аккаунта: 0 - депозит, 1 - кредит");
        Scanner s = new Scanner(System.in);
        int i = Integer.parseInt(s.nextLine());
        Account newOne = new Account(i != 0 ? AccountType.CREDIT :
                AccountType.DEPOSIT, this);
        userAPI.openAccount(newOne, this);

        if (accountList == null)
            accountList = new ArrayList<>();
        accountList.add(newOne);
        return newOne;
    }

    public void updatePassword() {
        if (verifyAccount()) {
            System.out.println("Введите новый пароль: ");
            String pass = new Scanner(System.in).nextLine();
            userAPI.updateLogin(log, pass.hashCode());
        }
    }

    public void addMoney(double amount, Account start){
        if (!accountList.contains(start)){
            System.out.println("Нет такого аккаунта у вас!");
            return;
        }
        start.setAmount(start.getAmount() + amount);
    }

    @Override
    public boolean verifyAccount() {
        System.out.println("Введите логин: ");
        Scanner s = new Scanner(System.in);
        String login = s.nextLine();
        System.out.println("Введите пароль: ");
        String pass = s.nextLine();
        log = login.hashCode();
        return userAPI.checkCredentials(login.hashCode(), pass.hashCode());
    }

    public void sendMoney(double amount, Account start, Account goal) {
        try {
            if (start.getAmount() < amount) {
                System.out.println("Слишком мало денег на счету!");
                return;
            }
            if (amount < 0) {
                System.out.println("Не можете передать такое количество денег!");
                return;
            }
            if (accountList.contains(start)) {
                System.out.println("У вас нет такого аккаунта!");
                return;
            }
            if (verifyAccount()) {
                goal.setAmount(goal.getAmount() + amount);
                start.setAmount(start.getAmount() - amount);
            }
        } catch (NullPointerException npe) {
            System.out.println("Такой аккаунт не существует!");
        }
    }
}

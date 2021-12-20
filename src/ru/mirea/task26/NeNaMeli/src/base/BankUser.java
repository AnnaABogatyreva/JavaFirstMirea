package ru.mirea.task26.NeNaMeli.src.base;

import ru.mirea.task26.NeNaMeli.src.base.decorator.Fee;
import ru.mirea.task26.NeNaMeli.src.base.decorator.SendCreditMoney;
import ru.mirea.task26.NeNaMeli.src.base.decorator.SendDebitMoney;
import ru.mirea.task26.NeNaMeli.src.base.decorator.Service;
import ru.mirea.task26.NeNaMeli.src.base.strategy.NotifyStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankUser implements User {
    int log;
    private List<Account> accountList;
    private UserAPI userAPI;
    public NotifyStrategy notifyStrategy;

    BankUser(UserAPI ua) {
        this.userAPI = ua;
        this.accountList = userAPI.dataBase.getOpenedAccounts().get(this);
        createProfile();
    }

    public void createProfile(){
        System.out.println("Введите логин пользователя: ");
        Scanner s = new Scanner(System.in);
        String login = s.nextLine();
        System.out.println("Введите пароль пользователя: ");
        String pass = s.nextLine();
        while (!pass.matches("^[a-zA-Z0-9_]+$")){
            System.out.println("Пароль такого типа не допустим!");
        }

        if (userAPI.dataBase.credentialsExist(login.hashCode(), pass.hashCode()))
            if (userAPI.checkCredentials(login.hashCode(), pass.hashCode())){
                System.out.println("Вы успешно зашли в систему как пользователь!");
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
        if (notifyStrategy != null) {
            notifyStrategy.sendNotify();
            notifyStrategy = null;
        }
        System.out.println("Введите логин пользователя: ");
        Scanner s = new Scanner(System.in);
        String login = s.nextLine();
        System.out.println("Введите пароль пользователя: ");
        String pass = s.nextLine();
        log = login.hashCode();
        return userAPI.checkCredentials(login.hashCode(), pass.hashCode());
    }

    public void sendMoney(double amount, Account start, Account goal) {
        if (notifyStrategy != null) {
            notifyStrategy.sendNotify();
            notifyStrategy = null;
        }
        try {
            if (start.getAmount() < amount) {
                System.out.println("Слишком мало денег на счету!");
                return;
            }
            if (amount < 0) {
                System.out.println("Не можете передать такое количество денег!");
                return;
            }
            if (!accountList.contains(start)) {
                System.out.println("У вас нет такого аккаунта!");
                return;
            }
            if (verifyAccount()) {
                Service s = new Fee(5);
                Service end;
                if (start.getType() == AccountType.CREDIT){
                    end = new SendCreditMoney(s);
                } else end = new SendDebitMoney(s);

                System.out.println("Общая стоимость перевода: " +
                        (amount + end.getPrice()));
                if (start.getAmount() - amount - end.getPrice() < 0){
                    System.out.println("Недостаточно средств на счету!");
                    return;
                }

                goal.setAmount(goal.getAmount() + amount);
                start.setAmount(start.getAmount() - amount - s.getPrice());
            }
        } catch (NullPointerException npe) {
            System.out.println("Такой аккаунт не существует!");
        }
    }
}

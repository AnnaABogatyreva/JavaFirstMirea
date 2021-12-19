package ru.mirea.task18.NeNaMeli.src.base;

public class UserAPI {
    DataBase dataBase;

    public UserAPI(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    void login(String login, String password){

    }

    boolean checkCredentials(int login, int password){
        return dataBase.credentialsExist(login, password);
    }

    void updateLogin(int login, int password){
        dataBase.removePass(login);
        dataBase.addLoginAndPass(login, password);
    }

    void openAccount(Account toOpen, BankUser user){
        dataBase.addOpenedAccount(user, toOpen);
    }

    void sendMoney(double amount, BankUser goal){

    }
}

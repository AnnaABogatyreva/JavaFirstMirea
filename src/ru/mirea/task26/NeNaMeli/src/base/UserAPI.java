package ru.mirea.task26.NeNaMeli.src.base;

public class UserAPI {
    DataBase dataBase;

    public UserAPI(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void addProfile(int login, int password){
        dataBase.addLoginAndPass(login, password);
    }
    public boolean checkCredentials(int login, int password){
        return dataBase.credentialsExist(login, password);
    }

    void updateLogin(int login, int password){
        dataBase.removePass(login);
        dataBase.addLoginAndPass(login, password);
    }

    void openAccount(Account toOpen, BankUser user){
        dataBase.addOpenedAccount(user, toOpen);
    }
}

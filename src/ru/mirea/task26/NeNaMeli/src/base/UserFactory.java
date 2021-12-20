package ru.mirea.task26.NeNaMeli.src.base;

public class UserFactory {
    private UserAPI ua;
    private AdminAPI aa;

    public UserFactory(UserAPI ua, AdminAPI aa) {
        this.ua = ua;
        this.aa = aa;
    }

    public User getUser(String userType){
        if (userType.equals("User"))
            return new BankUser(ua);
        if (userType.equals("Admin"))
            return new BankAdmin(aa);
        return null;
    }
}

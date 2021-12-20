package ru.mirea.task19.NeNaMeli.src.base;

public class Account {
    private AccountType type;
    private final BankUser owner;
    private double amount = 0;

    public Account(AccountType type, BankUser owner, double amount) {
        this.type = type;
        this.owner = owner;
        this.amount = amount;
    }

    public Account(AccountType type, BankUser owner) {
        this.type = type;
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public BankUser getOwner() {
        return owner;
    }
}

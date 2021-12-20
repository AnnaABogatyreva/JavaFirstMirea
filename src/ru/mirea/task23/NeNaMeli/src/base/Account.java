package ru.mirea.task23.NeNaMeli.src.base;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.amount, amount) == 0 && type == account.type && owner.equals(account.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, owner, amount);
    }
}

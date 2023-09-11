package me.samuel_linus.bank;

import java.util.UUID;

public class BankAccount {

    private String username;
    private String password;
    private int money;

    public BankAccount(String username, String password, int money) {
        this.username = username;
        this.password = password;
        this.money = money;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

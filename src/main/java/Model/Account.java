package Model;

import java.sql.SQLOutput;

public class Account {

    public int balance;

    public Account(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public int setBalance(int balance){
        return this.balance = balance;
    }

    public static void pay(Account fromAccount, Account toAccount, int payAmount, Spiller spiller){

        if (fromAccount.getBalance() > payAmount) {
            System.out.println("Player has payed " + payAmount);
            fromAccount.setBalance(fromAccount.getBalance() - payAmount);
            toAccount.setBalance(toAccount.getBalance() + payAmount);
            System.out.println("sufficent funds");
        } else if(fromAccount.getBalance() < payAmount){
            System.out.println("Player doesn't have enough funds " + fromAccount.getBalance());
            toAccount.setBalance(toAccount.getBalance() + fromAccount.getBalance());
            fromAccount.setBalance(0);
            spiller.bankRupt();
            System.out.println("insufficent funds");
        }
    }

    public static void deposit(Account account, int amount){
        account.setBalance(account.getBalance() + amount);
    }

    public static void withdraw(Account account, int amount, Spiller player){
        if (account.getBalance() > amount) {
            System.out.println("Players has payed: " + amount);
            account.setBalance(account.getBalance() - amount);
        } else if(account.getBalance() < amount){
            System.out.println("Player doesn't have enough funds " + account.getBalance());
            account.setBalance(0);
            player.bankRupt();
        }
    }
}

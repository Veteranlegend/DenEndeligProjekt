package Model;
import Model.Account;
import Model.Fields.Field;
import Model.Fields.Owneble;

import java.util.ArrayList;

public class Spiller {
    private String name;
    private final Account account;
    private int position = 0;
    public int previousPosition = 0;
    private int playerNumber;


    private boolean setOutofJailCard;
    private boolean isJail;
    private int jailTurns;
    private boolean passingMoney = true;
    private boolean extraTurn = false;
    private boolean bankRupt;
    public int extraTurns;
    private boolean hasLost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Spiller(String name, int startingBalance) {
        this.name = name;
        this.account = new Account(startingBalance);
        this.position = 0;
        this.isJail = false;
        this.bankRupt = false;
        this.setOutofJailCard = false;
        this.hasLost = false;
    }

    public boolean isSetOutofJailCard() {
        return setOutofJailCard;
    }

    public void setSetOutofJailCard(boolean setOutofJailCard) {
        this.setOutofJailCard = setOutofJailCard;
    }

    public void setPosition(int pos) {
        this.previousPosition = getPosition();
        this.position = pos % 39;
    }

    public int getPosition() {
        return position;
    }

    public boolean isJail() {
        return isJail;
    }

    public void setJail(boolean jail) {
        isJail = jail;
    }

    public boolean isPassingMoney() {
        return passingMoney;
    }

    public void setPassingMoney(boolean passingMoney) {
        this.passingMoney = passingMoney;
    }

    public int getJailTurns() {
        return jailTurns;
    }

    public void setJailTurns(int jailTurns) {
        this.jailTurns = jailTurns;
    }

    public Account getAccount() {
        return account;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public boolean getExtraTurn() {
        return extraTurn;
    }

    public void bankRupt() {
        this.bankRupt = true;
    }

    public boolean isBankRupt() {
        return bankRupt;
    }
    public void setExtraTurn(boolean b) {
        extraTurn = b;
    }

    public boolean hasLost() {
        return hasLost;
    }

    public void setHasLost(boolean hasLost){
        this.hasLost = hasLost;
    }
}


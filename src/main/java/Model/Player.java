package Model;
import Model.Fields.Field;
import Model.Fields.Owneble;

public class Player {
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

    /**
     *
     * @return Players name
     */
    public String getName() {
        return name;
    }

    /**
     * Can be used to set a players name
     * @param name players name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Constructer for the player this is how the player object is created
     * @param name Players Name
     * @param startingBalance Starting balance
     */
    public Player(String name, int startingBalance) {
        this.name = name;
        this.account = new Account(startingBalance);
        this.position = 0;
        this.isJail = false;
        this.bankRupt = false;
        this.setOutofJailCard = false;
        this.hasLost = false;
    }

    /**
     *
     * @return Returns whether or not the player has a get out of jail card
     * and can use it if he ever is in jail
     */
    public boolean isSetOutofJailCard() {
        return setOutofJailCard;
    }

    /**
     * This is used when a player draws a chancecard that give him a get out of jail card
     * @param setOutofJailCard Setter for get out of jail card
     */
    public void setSetOutofJailCard(boolean setOutofJailCard) {
        this.setOutofJailCard = setOutofJailCard;
    }

    /**
     * Updates the players current position and saves his old position that he was on before
     * The position is like a round robin where the player cannot escape the board
     * @param pos Position of the player
     */
    public void setPosition(int pos) {
        this.previousPosition = getPosition();
        this.position = pos % 39;
    }

    /**
     *
     * @return The players current position
     */
    public int getPosition() {
        return position;
    }

    /**
     * Sets the player in jail, if the player is in jail they take a jail turn
     * @return boolean if the player is staying in jail
     */
    public boolean isJail() {
        return isJail;
    }

    /**
     * Sets the player in jail, if the player is in jail they take a jail turn
     * @param jail
     */
    public void setJail(boolean jail) {
        isJail = jail;
    }

    /**
     * @return If the player is allowed to get passing money when they pass the start
     */
    public boolean isPassingMoney() {
        return passingMoney;
    }

    /**
     * If the player is allowed to get passing money when they pass the start
     * @param passingMoney
     */
    public void setPassingMoney(boolean passingMoney) {
        this.passingMoney = passingMoney;
    }

    /**
     * Player can be in jail for a maximum of 3 turns
     * this is used to controll how many turns the player has been in jail for
     * @return The amount of turns a player has been in jail for
     */
    public int getJailTurns() {
        return jailTurns;
    }

    /**
     * Player can be in jail for a maximum of 3 turns
     * this is used to controll how many turns the player has been in jail for
     * @param jailTurns
     */
    public void setJailTurns(int jailTurns) {
        this.jailTurns = jailTurns;
    }

    /**
     *
     * @return Returns Account of the player that is created automaticcaly in the constructer
     */
    public Account getAccount() {
        return account;
    }

    /**
     *
     * @return player number is the index that the player is
     * saved at in an array of players
     */
    public int getPlayerNumber() {
        return playerNumber;
    }

    /**
     *
     * @param playerNumber player number is the index that the player is
     * saved at in an array of players
     * This method is used for setting ther player number by their index in an array
     */
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    /**
     *
     * @return Returns how many turns the player has taken in a row
     */
    public boolean getExtraTurn() {
        return extraTurn;
    }

    /**
     * This is automaticcaly set whenever the player tries to pay for something
     * and they dont have enough money to pay
     * This is a setter for the bankrupt field
     */
    public void bankRupt() {
        this.bankRupt = true;
    }

    /**
     *
     * @return Returns if the player has gone bankrupt or not
     */
    public boolean isBankRupt() {
        return bankRupt;
    }

    /**
     * This is a method that is used to set the amount of extra turns the player has taken
     * this is used whenever the pllayer rolld 2 equals with the dice
     * @param b
     */
    public void setExtraTurn(boolean b) {
        extraTurn = b;
    }

    /**
     *
     * @return Returns if the player has lost or not and if he gets to take his turn again
     */
    public boolean hasLost() {
        return hasLost;
    }

    /**
     * Used to set that the player has lost and dosent get to move anymore
     * @param hasLost sets the players loss condition
     */
    public void setHasLost(boolean hasLost){
        this.hasLost = hasLost;
    }
}


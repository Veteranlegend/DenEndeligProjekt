package Model;

public class SpillerListe {

    Dice[] players;
    Dice currentPlayer;
    int playerAmount;
    int currentPlayerID;

    /**
     * Makes a new player and account for that player and stores it in the playerlist
     * @param playerAmount Specifies how many accounts and players you want to make
     */
    public SpillerListe(int playerAmount){
        this.playerAmount = playerAmount;
        players = new Dice[playerAmount];
        for (int i = 0; i < playerAmount; i++) {
            players[i] = new Dice(null,3000);
            players[i].setPlayerNumber(i);
        }
    }

    //Getters and setters

    /**
     *
     * @param id used identify the correct player to return
     * @return Spiller returns a player given the index of the player in the array
     */
    public Dice getPlayerList(int id) { return players[id]; }

    /**
     * @param index used identify the correct player to return
     * @return Spiller sets and returns a player given the index of the player in the array
     */
    public Dice setCurrentPlayer(int index){
        return currentPlayer = players[index];
    }

    /**
     *
     * @return Spiller current player is returned
     */
    public Dice getCurrentPlayer(){
        return currentPlayer;
    }

    /**
     * Switches between players and sets a new currentplayer
     * used at the end of each round
     * @return returns the next player in the array
     */
    public Dice getNextPlayer(){
        currentPlayerID = (currentPlayerID + 1) % players.length;
        currentPlayer = players[currentPlayerID];
        return currentPlayer;
    }

    public int getPlayerAmount() {
        return playerAmount;
    }
}
package Model;

import Model.Account;
import Model.Spiller;

import java.awt.*;

public class SpillerListe {

    Spiller[] players;
    Spiller currentPlayer;
    int playerAmount;
    int currentPlayerID;

    /**
     * Makes a new player and account for that player and stores it in the playerlist
     * @param playerAmount Specifies how many accounts and players you want to make
     */
    public SpillerListe(int playerAmount){
        this.playerAmount = playerAmount;
        players = new Spiller[playerAmount];
        for (int i = 0; i < playerAmount; i++) {
            players[i] = new Spiller(null,3000);
            players[i].setPlayerNumber(i);
        }
    }

    //Getters and setters
    public Spiller getPlayerList(int id) { return players[id]; }

    public Spiller setCurrentPlayer(int index){
        return currentPlayer = players[index];
    }

    public Spiller getCurrentPlayer(){
        return currentPlayer;
    }

    public Spiller getNextPlayer(){
        currentPlayerID = (currentPlayerID + 1) % players.length;
        currentPlayer = players[currentPlayerID];
        return currentPlayer;
    }

    public int getPlayerAmount() {
        return playerAmount;
    }
}
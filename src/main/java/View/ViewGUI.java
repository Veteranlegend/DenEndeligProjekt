package View;

import Model.Fields.Owneble;
import Model.Fields.Street;
import Model.Spiller;
import Model.SpillerListe;
import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

import static gui_fields.GUI_Car.Pattern.*;
import static gui_fields.GUI_Car.Type.*;

public class ViewGUI {
    private final GUI gui;
    private GUI_Player[] gui_players;
    private GUI_Car[] gui_cars;
    private GUI_Field[] gui_fields;


    public ViewGUI(GUI gui){
        this.gui = gui;
        this.gui_fields = gui.getFields();
    }

    GUI_Car.Type[] carTypes = {CAR, RACECAR, TRACTOR, UFO};
    GUI_Car.Pattern[] carPatterns = {FILL, HORIZONTAL_GRADIANT, DIAGONAL_DUAL_COLOR,
            HORIZONTAL_DUAL_COLOR, HORIZONTAL_LINE, CHECKERED, DOTTED, ZEBRA};
    Color[] colors = {Color.BLUE, Color.ORANGE,Color.RED, Color.GREEN,Color.YELLOW, Color.WHITE };
    public void addPlayers(SpillerListe sl){
        gui_cars = new  GUI_Car[sl.getPlayerAmount()];
        gui_players = new GUI_Player[sl.getPlayerAmount()];

        for (int i = 0; i < sl.getPlayerAmount(); i++) {
            Spiller player = sl.getPlayerList(i);

            String navn = gui.getUserString("Indtast dit navn !");
            gui.showMessage("Du valgte navn: " + navn);
            player.setName(navn);

            GUI_Car.Type carType = CAR;
            String type = gui.getUserButtonPressed("Vælg din bil type", "CAR", "RACECAR", "TRACTOR", "UFO");
            for (GUI_Car.Type item : carTypes) {
                if (item.toString().equals(type)) {
                    carType = item;
                }
            }

            String primaryColor = gui.getUserButtonPressed("Vælg din bils primær farve", "BLUE", "ORANGE", "RED", "GREEN", "YELLOW", "WHITE");
            Color primaryCarColor = colorFromString(primaryColor);

            String secondaryColor = gui.getUserButtonPressed("Vælg din bils sekundær farve", "BLUE", "ORANGE", "RED", "GREEN", "YELLOW", "WHITE");
            Color secondaryCarColor = colorFromString(secondaryColor);

            GUI_Car.Pattern carPattern = FILL;
            String pattern = gui.getUserButtonPressed("Vælg din bils farve pattern", "FILL", "HORIZONTAL_GRADIANT", "DIAGONAL_DUAL_COLOR",
                    "HORIZONTAL_DUAL_COLOR", "HORIZONTAL_LINE", "CHECKERED", "DOTTED", "ZEBRA");
            for (GUI_Car.Pattern value : carPatterns) {
                if (value.toString().equals(pattern)) {
                    carPattern = value;
                }
            }
            gui_cars[i] = new GUI_Car(primaryCarColor, secondaryCarColor, carType, carPattern);
            gui_players[i] = new GUI_Player(player.getName(), sl.getPlayerList(i).getAccount().getBalance(), gui_cars[i]);
            gui.addPlayer(gui_players[i]);
            gui_players[i].getCar().setPosition(gui_fields[0]);
        }
    }

    private Color colorFromString(String color) {
        switch (color) {
            case "BLUE" -> {return Color.BLUE;}
            case "ORANGE" -> {return Color.ORANGE;}
            case "RED" -> {return Color.RED;}
            case "GREEN" -> {return Color.GREEN;}
            case "YELLOW" -> {return Color.YELLOW;}
            case "WHITE" -> {return Color.WHITE;}
            default -> {return Color.BLACK;}
        }
    }

    public void updateBalance(SpillerListe sl){
        for (int i = 0; i < gui_players.length; i++) {
            gui_players[i].setBalance(sl.getPlayerList(i).getAccount().getBalance());
        }
    }

    public void moveCar(Spiller player, int moveAmount){
        player.setPosition(player.getPosition() + moveAmount);
        gui_players[player.getPlayerNumber()].getCar().setPosition(gui_fields[player.getPosition()]);
    }

    public void moveCarToField(Spiller player, int fieldToMoveTo){
        if(player.getPosition() != -1 || fieldToMoveTo != -1) {
            player.setPosition(fieldToMoveTo);
            gui_players[player.getPlayerNumber()].getCar().setPosition(gui_fields[player.getPosition()]);
        }
    }

    public void setDice(int dice1, int dice2){
        for(int a = 0; a <= 360; a++) {
            gui.setDice(dice1, a, 5, 5, dice2, 359 - a, 6, 5);
            try {
                Thread.sleep(5);
            } catch(InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void buyOwneble(Spiller player){
        GUI_Player gui_player = gui_players[player.getPlayerNumber()];
        GUI_Field f = gui_fields[player.getPosition()];
        if(f instanceof GUI_Ownable o){
            gui_player.setBalance(player.getAccount().getBalance());
            o.setBorder(gui_player.getPrimaryColor(), gui_player.getSecondaryColor());
        }
    }

    public void removeOwneble(int index){
        GUI_Field f = gui_fields[index];
        if(f instanceof GUI_Ownable o) {
            o.setBorder(Color.BLACK, Color.BLACK);
        }
    }

    public void showChanceCard(String message){
        gui.displayChanceCard(message);
        gui.showMessage(message);
        gui.displayChanceCard("");
    }

    public void buyHouseHotel(Street field, int index){
        GUI_Field f = gui.getFields()[index];
        if(f instanceof GUI_Street s){
            if(field.getHouseAmount() <= 4){
                s.setHouses(field.getHouseAmount());
            } else
                s.setHotel(true);
        }
    }


    public int bidCheck(Spiller player, Owneble field){
        int bid = gui.getUserInteger(player.getName() + " indtast dit bud på " + field.getName() + " (minimum " + field.getPrice() + ")");
        if (bid > player.getAccount().getBalance()) {
            gui.showMessage("Invalid beløb, prøv igen");
            return bidCheck(player, field);
        }
        return bid;
    }
    // Set field to auction and get the highest bid
    public int[] auctionField(Owneble field, SpillerListe sl, Spiller spiller){
        // Return a list of int, where 0 is the bid and 1 is the player number
        int[] values = new int[2];
        for (int i = 0; i < sl.getPlayerAmount(); i++) {
            Spiller player = sl.getPlayerList(i);
            if(player == spiller || player.isBankRupt() || player.getAccount().getBalance() < field.getPrice()){
                continue;
            }
            int bid = bidCheck(player, field);
            if(bid > values[0]){
                values[0] = bid;
                values[1] = i;
            }
        }

        if(values[0] < field.getPrice()){
            gui.showMessage("Ingen valid bud på " + field.getName() + " derfor bliver feltet solgt til banken");
            values[1] = -1;
        }
        return values;
    }

    public void showMessage(String message) {
        gui.showMessage(message);
    }

}

package Model.Chance;

import Model.Dice;
import View.ViewGUI;
import gui_main.GUI;

public abstract class ChanceCard {

    public String getDescription() {
        return description;
    }

    String description;

    public ChanceCard(String description){
        this.description = description;
    }



    public void doCard(Dice player, ViewGUI gui){
        gui.showMessage(description);
    }

}

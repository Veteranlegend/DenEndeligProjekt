package Model.Chance;

import Model.Spiller;
import View.ViewGUI;

public class MoveToFerry extends ChanceCard {
    public MoveToFerry(String destination) {
        super(destination);
    }

    @Override
    public void doCard(Spiller player, ViewGUI gui) {
        super.doCard(player, gui);

        if(35 < player.getPosition() && player.getPosition() < 5){
            gui.moveCarToField(player, 5);
        }
        if(5 < player.getPosition() && player.getPosition() < 15){
            gui.moveCarToField(player, 15);
        }
        if(15 < player.getPosition() && player.getPosition() < 25){
            gui.moveCarToField(player, 25);
        }
        if(25 < player.getPosition() && player.getPosition() < 35){
            gui.moveCarToField(player, 35);
        }
    }
}

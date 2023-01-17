package Model.Chance;

import Model.Fields.Chance;
import Model.Spiller;
import gui_main.GUI;
import View.ViewGUI;

public class MoveFieldAmount extends ChanceCard {

    public int fieldAmount;

    public MoveFieldAmount(String description, int fieldAmount) {
        super(description);
        this.fieldAmount = fieldAmount;
    }

    @Override
    public void doCard(Spiller player, ViewGUI gui) {
        super.doCard(player, gui);
        player.setPosition(player.getPosition() + fieldAmount);
        gui.moveCarToField(player, player.getPosition());
    }

}

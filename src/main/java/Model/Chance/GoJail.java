package Model.Chance;

import Model.Spiller;
import View.ViewGUI;

public class GoJail extends ChanceCard {
    public GoJail(String description) {
        super(description);
    }

    @Override
    public void doCard(Spiller player, ViewGUI gui) {
        super.doCard(player, gui);
        player.setJail(true);
        gui.moveCarToField(player, 10);
    }
}

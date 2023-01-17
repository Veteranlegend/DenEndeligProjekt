package Model.Chance;

import Model.Spiller;
import View.ViewGUI;

public class JailCard extends ChanceCard {
    public JailCard(String description) {
        super(description);
    }

    @Override
    public void doCard(Spiller player, ViewGUI gui) {
        super.doCard(player, gui);
        player.setSetOutofJailCard(true);
    }
}
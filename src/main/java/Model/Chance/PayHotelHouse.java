package Model.Chance;

import Model.Spiller;
import View.ViewGUI;
import gui_main.GUI;

public class PayHotelHouse extends ChanceCard{
    int payHousePrice;
    int payHotelPrice;

    public PayHotelHouse(String description, int payHousePrice, int payHotelPrice) {
        super(description);
        this.payHousePrice = payHousePrice;
        this.payHotelPrice = payHotelPrice;
    }

    @Override
    public void doCard(Spiller player, ViewGUI gui) {
        super.doCard(player, gui);


    }
}
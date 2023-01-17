package Model.Fields;

import java.awt.*;

public class Street extends Owneble {
    public int getHousePrice() {
        return housePrice;
    }

    int housePrice;
    public Street(String name, String message, int price, int housePrice, int[] rent, Color color, int monopoly) {
        super(name, message, price, rent, color, monopoly);
        this.housePrice = housePrice;
    }




}
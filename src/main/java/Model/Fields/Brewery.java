package Model.Fields;

import java.awt.*;

public class Brewery extends Owneble{
    /**
     *
     * @param name
     * @param message
     * @param price
     * @param rent
     * @param color
     * @param monopoly
     */
    public Brewery(String name, String message, int price, int[] rent, Color color, int monopoly) {
        super(name, message, price, rent, color, monopoly);
    }

    /**
     *
     * @return
     */
    @Override
    public int getRent() {
        return super.getRent();
    }
}

package Model.Fields;

import Model.Spiller;

import java.awt.*;

public class Ferry extends Owneble {
    /**
     *
     * @param name
     * @param message
     * @param price
     * @param rent
     * @param color
     * @param monopoly
     */
    public Ferry(String name, String message, int price, int[] rent, Color color, int monopoly) {
        super(name, message, price, rent, color, monopoly);
    }

    /**
     *
     * @return
     */
    @Override
    public Spiller getOwner() {
        return super.getOwner();
    }

}

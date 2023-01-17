package Model.Fields;

import Model.Spiller;

import java.awt.*;

public class Ferry extends Owneble {
    public Ferry(String name, String message, int price, int[] rent, Color color, int monopoly) {
        super(name, message, price, rent, color, monopoly);
    }

    @Override
    public Spiller getOwner() {
        return super.getOwner();
    }

}

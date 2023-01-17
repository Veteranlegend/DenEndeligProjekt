package Model.Fields;

import java.awt.*;

public class Brewery extends Owneble{
    public Brewery(String name, String message, int price, int[] rent, Color color, int monopoly) {
        super(name, message, price, rent, color, monopoly);
    }

    @Override
    public int getRent() {
        return super.getRent();
    }
}

package Model.Fields;
import Model.Spiller;

import java.awt.*;

public abstract class Owneble extends Field{
    private int price;
    private final int[] rent;
    private Spiller owner;
    private int houseAmount;
    Color color;
    private int monopoly;

    /**
     *
     * @param name
     * @param message
     * @param price
     * @param rent
     * @param color
     * @param monopoly
     */
    public Owneble(String name, String message, int price, int[] rent, Color color, int monopoly) {
        super(name, message);
        this.owner = null;
        this.rent = rent;
        this.price = price;
        this.color = color;
        this.houseAmount = 0;
        this.monopoly = monopoly;
    }

    /**
     *
     * @return
     */
    public int getMonopoly() {
        return monopoly;
    }

    /**
     *
     * @param monopoly
     */
    public void setMonopoly(int monopoly) {
        this.monopoly = monopoly;
    }

    /**
     *
     * @return
     */
    public Color getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public int getPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    public int getRent() {
        if (getHouseAmount() > rent.length-1){
            return rent[rent.length-1];
        }
        return rent[getHouseAmount()];
    }

    /**
     *
     * @return
     */
    public Spiller getOwner() {
        return owner;
    }

    /**
     *
     * @param owner
     */
    public void setOwner(Spiller owner) {
        this.owner = owner;
    }

    /**
     *
     * @return
     */
    public int getHouseAmount() {
        return houseAmount;
    }

    /**
     *
     * @param houseAmount
     */
    public void setHouseAmount(int houseAmount) {
        this.houseAmount = houseAmount;
    }


}
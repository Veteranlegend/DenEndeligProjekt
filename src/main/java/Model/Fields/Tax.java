package Model.Fields;

public class Tax extends Field{
    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    int tax;
    public Tax(String name, String message, int tax) {
        super(name, message);
        this.tax = tax;
    }


}
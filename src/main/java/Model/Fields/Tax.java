package Model.Fields;

public class Tax extends Field{
    /**
     *
     * @return
     */
    public int getTax() {
        return tax;
    }

    /**
     *
     * @param tax
     */
    public void setTax(int tax) {
        this.tax = tax;
    }

    int tax;

    /**
     *
     * @param name
     * @param message
     * @param tax
     */
    public Tax(String name, String message, int tax) {
        super(name, message);
        this.tax = tax;
    }


}
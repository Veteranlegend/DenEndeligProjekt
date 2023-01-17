package Model.Fields;

public abstract class Field {

    private String name;
    private String message;

    /**
     *
     * @param name
     * @param message
     */
    public Field (String name, String message) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


}
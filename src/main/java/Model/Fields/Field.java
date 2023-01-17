package Model.Fields;

public abstract class Field {

    private String name;
    private String message;

    public Field (String name, String message) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
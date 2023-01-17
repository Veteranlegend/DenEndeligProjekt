package View;

import Model.FieldList;
import Model.Fields.*;
import gui_fields.*;
import gui_main.GUI;

import java.awt.*;


public class BoardGUI {
    public GUI_Field[] gui_fields;

    public GUI_Field[] guiFields(Field[] fields){

        GUI.setNull_fields_allowed(true);
        gui_fields = new GUI_Field[fields.length];

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if(field instanceof Brewery){
                int rent = ((Brewery) field).getRent();
                int price = ((Brewery) field).getPrice();
                gui_fields[i] = new GUI_Brewery("default", field.getName(), Integer.toString(price), field.getName(), Integer.toString(rent), ((Brewery) field).getColor(), Color.BLACK);
            }
            if(field instanceof Chance){
                gui_fields[i] = new GUI_Chance("?", field.getName(), field.getName(), Color.darkGray, Color.BLACK);
            }
            if(field instanceof Ferry){
                int rent  = ((Ferry) field).getRent();
                int price  = ((Ferry) field).getPrice();
                gui_fields[i] = new GUI_Shipping("default", field.getName(), Integer.toString(price), field.getName(), Integer.toString(rent),((Ferry) field).getColor(), Color.BLACK);
            }
            if(field instanceof Jail){
                gui_fields[i] = new GUI_Jail("default", field.getName(), field.getName(), field.getName(), Color.LIGHT_GRAY, Color.BLACK);
            }
            if(field instanceof Parking){
                gui_fields[i] = new GUI_Refuge("default", field.getName(), field.getName(), field.getName(), Color.green, Color.BLACK);
            }
            if(field instanceof Start){
                gui_fields[i] = new GUI_Start(field.getName(),field.getName(),field.getName(),Color.GREEN,Color.BLACK);
            }
            if(field instanceof Street){
                int rent = ((Street) field).getRent();
                int price  = ((Street) field).getPrice();
                gui_fields[i] = new GUI_Street(field.getName(), Integer.toString(price),field.getName(), Integer.toString(rent), ((Street) field).getColor(), Color.BLACK);
            }
            if(field instanceof Tax){
                int tax = ((Tax) field).getTax();
                gui_fields[i] = new GUI_Tax(field.getName(), Integer.toString(tax), field.getName(), Color.GREEN,Color.BLACK);
            }
        }

        return gui_fields;
    }

}

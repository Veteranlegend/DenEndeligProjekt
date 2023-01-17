package Model;

import Model.Fields.*;

import java.awt.*;

public class FieldList {

    private final Field[] fields = new Field[40];

    public Field[] CreateFieldList() {
        fields[0] = new Start("Start", "Start felt");
        fields[1] = new Street("Rødovrevej", "Rødorevej", 1200, 1000, new int[]{50, 250, 750, 2250, 4000, 6000}, Color.blue,2);
        fields[2] = new Chance("Chance", "Prøv lykken");
        fields[3] = new Street("Hvidovrevej", "Hvidovrevej", 1200, 1000, new int[]{50, 250, 400, 750, 2250, 6000},Color.blue,2);
        fields[4] = new Tax("Tax", "Tax", 4000);
        fields[5] = new Ferry("Helsingborg", "Helsingborg", 4000, new int[]{500, 1000, 2000, 4000},Color.magenta,4);
        fields[6] = new Street("Roskildevej", "Roskildevej", 2000, 1000, new int[]{100, 600, 1800, 5400, 8000, 11000},Color.red,3);
        fields[7] = new Chance("Chance", "Prøvlykken");
        fields[8] = new Street("Valby Langgade", "Valby Langgade", 2000, 1000, new int[]{100, 600, 1800, 5400, 8000, 11000},Color.red,3);
        fields[9] = new Street("Allégade", "Allégade", 2400, 1000, new int[]{150, 800, 2000, 6000, 9000, 12000},Color.red,3);
        fields[10] = new Jail("I fængsel", "På besøg");
        fields[11] = new Street("Frederiksberg Allé", "Frederiksberg Allé", 2800, 2000, new int[]{200, 1000, 3000, 9000, 12500, 15000},Color.yellow,3);
        fields[12] = new Brewery("Tuborg Squash", "Tuborg Squash", 3000, new int[]{100, 200},Color.pink,2);
        fields[13] = new Street("Bülowsvej", "Bülowsvej", 2800, 2000, new int[]{200, 1000, 3000, 9000, 12500, 15000},Color.yellow,3);
        fields[14] = new Street("Gl. Kongevej", "Gl. Kongevej", 3200, 2000, new int[]{250, 1250, 3750, 10000, 14000, 18000},Color.yellow,3);
        fields[15] = new Ferry("Mols-Linien", "Mols-linien", 4000, new int[]{500, 1000, 2000, 4000},Color.magenta,4);
        fields[16] = new Street("Bernstorffsvej", "Bernstoffsvej", 3600, 2000, new int[]{300, 1400, 4000, 11000, 15000, 19000},Color.GRAY,3);
        fields[17] = new Chance("Chance", "Prøv lykken");
        fields[18] = new Street("Hellerupvej", "Hellerupvej", 3600, 2000, new int[]{300, 1400, 4000, 11000, 15000, 19000},Color.GRAY,3);
        fields[19] = new Street("Strandvejen", "Strandvejen", 4000, 2000, new int[]{350, 1600, 4400, 12000, 16000, 20000},Color.GRAY,3);
        fields[20] = new Parking("Parking", "Refugee");
        fields[21] = new Street("Trianglen", "Trianglen", 4400, 3000, new int[]{350, 1800, 5000, 14000, 17500, 21000},Color.orange,3);
        fields[22] = new Chance("Chance", "Prøv lykken");
        fields[23] = new Street("Østerbrogade", "Østerbrogade", 4400, 3000, new int[]{350, 1800, 5000, 14000, 17500, 21000},Color.orange,3);
        fields[24] = new Street("Grønningen", "Grønningen", 4800, 3000, new int[]{400, 2000, 6000, 15000, 18500, 22000},Color.orange,3);
        fields[25] = new Ferry("Gedser-Rostock", "Gedser-Rostock", 4000, new int[]{500, 1000, 2000, 4000}, Color.magenta,4);
        fields[26] = new Street("Bredgade", "Bredgade", 5200, 3000, new int[]{450, 2200, 6600, 16000, 19500, 23000}, Color.white,3);
        fields[27] = new Street("Kgs.Nytorv", "Kgs.Nytorv", 5200, 3000, new int[]{450, 2200, 6600, 16000, 19500, 23000}, Color.white,3);
        fields[28] = new Brewery("Coca Cola", "Coca Cola", 3000, new int[]{100, 200}, Color.pink,2);
        fields[29] = new Street("Østergade", "Østergade", 5600, 3000, new int[]{500, 2400, 7200, 17000, 20500, 24000}, Color.white,3);
        fields[30] = new Jail("Jail", "Go to jail");
        fields[31] = new Street("Amagertorv", "Amagertorv", 6000, 4000, new int[]{550, 2600, 7800, 18000, 22000, 25000}, Color.YELLOW,3);
        fields[32] = new Street("Vimmelskaftet", "Vimmelskaftet", 6000, 4000, new int[]{550, 2600, 7800, 18000, 22000, 25000},Color.YELLOW,3);
        fields[33] = new Chance("Chance", "Prøv Lykken");
        fields[34] = new Street("Nygade", "Nygade", 6400, 4000, new int[]{600, 3000, 9000, 20000, 24000, 28000},Color.YELLOW,3);
        fields[35] = new Ferry("Rødby-Puttgarden", "Rødby-Puttgarden", 4000, new int[]{500, 1000, 2000, 4000},Color.magenta,4);
        fields[36] = new Chance("Chance", "Prøv Lykken");
        fields[37] = new Street("Frederiksberggade", "Frederiksberggade", 7000, 4000, new int[]{700, 3500, 10000, 22000, 26000, 30000},Color.CYAN,2);
        fields[38] = new Tax("Ekstra Ordinær Statsskat", "Betal 2000kr", 2000);
        fields[39] = new Street("Rådhuspladsen", "Rådhuspladsen", 8000, 4000, new int[]{1000, 4000, 12000, 28000, 34000, 40000},Color.CYAN,2);

        return fields;
    }

    public Field[] getFields() {
        return fields;
    }

    public Field getField(int index){
        return fields[index];
    }


}

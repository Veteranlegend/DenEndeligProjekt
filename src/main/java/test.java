import Model.Chance.MoveToField;
import Model.FieldList;
import Model.Fields.Chance;
import Model.Fields.Field;
import Model.SpillerListe;
import View.ViewGUI;
import gui_main.GUI;
import org.junit.Test;

import static Model.Account.pay;
import static Model.Account.withdraw;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class test {
    @Test
    public void movePlayer() {
        SpillerListe sl = new SpillerListe(3);
        sl.setCurrentPlayer(0);
        sl.getCurrentPlayer().setPosition(1);
        assertEquals(1, sl.getCurrentPlayer().getPosition());
    }
    @Test
    public void updateBalance() {
        SpillerListe sl = new SpillerListe(3);
        sl.setCurrentPlayer(0);
        withdraw(sl.getCurrentPlayer().getAccount(), 1000, sl.getCurrentPlayer());
        assertEquals(29000, sl.getCurrentPlayer().getAccount().getBalance());
    }

    @Test
    public void payPlayer() {
        SpillerListe sl = new SpillerListe(3);
        sl.setCurrentPlayer(0);
        pay(sl.getPlayerList(1).getAccount(), sl.getCurrentPlayer().getAccount(), 1000, sl.getCurrentPlayer());
        assertEquals(31000, sl.getCurrentPlayer().getAccount().getBalance());
    }

    @Test
    public void getField() {
        SpillerListe sl = new SpillerListe(3);
        sl.setCurrentPlayer(0);
        sl.getCurrentPlayer().setPosition(1);
        FieldList fl = new FieldList();
        fl.CreateFieldList();
        assertEquals("Rødovrevej", fl.getField(sl.getCurrentPlayer().getPosition()).getName());
    }

    @Test
    public void getChanceField() {
        SpillerListe sl = new SpillerListe(3);
        sl.setCurrentPlayer(0);
        sl.getCurrentPlayer().setPosition(7);
        FieldList fl = new FieldList();
        fl.CreateFieldList();
        assertTrue(fl.getField(sl.getCurrentPlayer().getPosition()) instanceof Chance);
    }
}

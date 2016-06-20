import java.util.List;

/**
 * Created by Nico on 20.05.2016.
 */
public class Hauptklasse {
    public static void main(String[] args) {



        Spielfeld mySpielfeld = new Spielfeld(30, 30);

        List<Zelle> myList = mySpielfeld.generateSpielfeld(30);


        GoLGUI myGUI = new GoLGUI("Mein Spiel", mySpielfeld, myList);

        Generation myGeneration = new Generation();

        while (myGeneration.isAnyFieldLiving()) {
            myList = myGeneration.next(myList, mySpielfeld);
            myGUI.updateLayout(myList);
        }

    }
}

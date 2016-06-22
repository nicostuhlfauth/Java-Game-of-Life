import java.util.List;

/**
 * Created by Nico on 20.05.2016.
 */
public class Hauptklasse {
    public static void main(String[] args) {



        SpielfeldI mySpielfeld = new Spielfeld(30, 30);

        List<ZelleI> myList = mySpielfeld.generateSpielfeld(15);


        GoLGUII myGUI = new GoLGUI("Mein Spiel", mySpielfeld, myList);

        GenerationI myGeneration = new Generation();

        while (myGeneration.isAnyFieldLiving()) {
            myList = myGeneration.next(myList, mySpielfeld);
            myGUI.updateLayout(myList);
        }

    }
}

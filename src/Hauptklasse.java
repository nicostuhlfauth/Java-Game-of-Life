import java.util.List;

/**
 * Created by Nico on 20.05.2016.
 */
public class Hauptklasse {
    public static void main(String[] args) {

        // Spielfeld aufziehen

        Spielfeld mySpielfeld = new Spielfeld(5, 5);

        List<Zelle> myList = mySpielfeld.generateSpielfeld(25);

        Generation myGeneration = new Generation();

        for (Zelle zelle : myList) {
            System.out.print(zelle.isZelleLebt() + "\t");
        }

        System.out.println();

        myList = myGeneration.next(myList, mySpielfeld);

        for (Zelle zelle : myList) {
            System.out.print(zelle.isZelleLebt() + "\t");
        }


    }
}

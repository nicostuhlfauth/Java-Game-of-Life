import java.util.Arrays;
import java.util.List;

/**
 * Created by Nico on 20.05.2016.
 */
public class Hauptklasse {
    public static void main(String[] args) {

        // Spielfeld aufziehen

        Spielfeld mySpielfeld = new Spielfeld(5, 5);
        List<Zelle> myZelle = mySpielfeld.generateSpielfeld(90);

        for (Zelle zelle : myZelle) {
            System.out.println(zelle.isZelleLebt());
        }


    }
}

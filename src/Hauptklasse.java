import java.util.Arrays;

/**
 * Created by Nico on 20.05.2016.
 */
public class Hauptklasse {
    public static void main(String[] args) {

        // Spielfeld aufziehen

        Spielfeld mySpielfeld = new Spielfeld(30, 30);
        Zelle[] myZelle = mySpielfeld.generateSpielfeld();

        System.out.println(myZelle[800]);
    }
}

import java.util.List;

/**
 * Created by Nico on 20.05.2016.
 */
public class Hauptklasse {
    public static void main(String[] args) {

        // Spielfeld aufziehen

        Spielfeld mySpielfeld = new Spielfeld(5, 5);

        List<Zelle> myList = mySpielfeld.generateSpielfeld(100);

        Generation myGeneration = new Generation();

        myList = myGeneration.next(myList, mySpielfeld);

        System.out.println(myList.get(5).getX());


    }
}

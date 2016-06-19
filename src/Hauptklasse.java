import java.util.List;

/**
 * Created by Nico on 20.05.2016.
 */
public class Hauptklasse {
    public static void main(String[] args) {

        // Spielfeld aufziehen

        Spielfeld mySpielfeld = new Spielfeld(8, 8);

        List<Zelle> myList = mySpielfeld.generateSpielfeld(50);


        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i).isZelleLebt());
            if ((i+1)%mySpielfeld.getY() == 0) {
                System.out.println();
            }
            else {
                System.out.print("\t");
            }
        }

        System.out.println();

        myList = new Generation().next(myList, mySpielfeld);

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i).isZelleLebt());
            if ((i+1)%mySpielfeld.getY() == 0) {
                System.out.println();
            }
            else {
                System.out.print("\t");
            }
        }

    }
}

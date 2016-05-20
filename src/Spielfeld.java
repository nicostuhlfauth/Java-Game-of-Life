import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Nico on 20.05.2016.
 */
public class Spielfeld {
    private int x;
    private int y;

    public Spielfeld(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public List<Zelle> generateSpielfeld() {
        List<Zelle> myList = new ArrayList<>(x*y);
        Random myRandom = new Random();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Zelle tempZelle = new Zelle(myRandom.nextBoolean(), i, j);
                myList.add(tempZelle);
                //System.out.println(tempZelle.getX() + " " + tempZelle.getY() + " " + tempZelle.isZelleLebt());
            }

        }


        return myList;
    }
}

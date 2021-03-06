import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Nico on 20.05.2016.
 */
public class Spielfeld implements SpielfeldI {
    private int x;
    private int y;

    public Spielfeld(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }


    @Override
    public int getY() {
        return y;
    }


    @Override
    public List generateSpielfeld(double wahrscheinlichkeit) {
        List<ZelleI> myList = new ArrayList<>(x*y);


        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if ((i == 0) || (j == 0) || (i == (x-1)) || (j == (y-1))) {
                    myList.add(new Zelle(false, i+1, j+1));
                    continue;
                }
                if (new Random().nextDouble() <= (wahrscheinlichkeit/100)) {
                    myList.add(new Zelle(true, i+1, j+1));
                }
                else {
                    myList.add(new Zelle(false, i+1, j+1));
                }
            }

        }

        return myList;
    }
}
